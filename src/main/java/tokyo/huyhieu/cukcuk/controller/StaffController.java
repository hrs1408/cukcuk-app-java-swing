package tokyo.huyhieu.cukcuk.controller;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;

import tokyo.huyhieu.cukcuk.model.Export;
import tokyo.huyhieu.cukcuk.model.ExportDetail;
import tokyo.huyhieu.cukcuk.model.Import;
import tokyo.huyhieu.cukcuk.model.ImportDetail;
import tokyo.huyhieu.cukcuk.model.Material;

import tokyo.huyhieu.cukcuk.model.Product;
import tokyo.huyhieu.cukcuk.model.Supplier;
import tokyo.huyhieu.cukcuk.model.User;
import tokyo.huyhieu.cukcuk.repository.ExportDetailRepository;
import tokyo.huyhieu.cukcuk.repository.ExportRepository;
import tokyo.huyhieu.cukcuk.repository.ImportDetailRepository;
import tokyo.huyhieu.cukcuk.repository.ImportRepository;
import tokyo.huyhieu.cukcuk.repository.MaterialRepository;
import tokyo.huyhieu.cukcuk.repository.ProductRepository;
import tokyo.huyhieu.cukcuk.repository.SupplierRepository;
import tokyo.huyhieu.cukcuk.repository.UserRepository;
import tokyo.huyhieu.cukcuk.view.Login;
import tokyo.huyhieu.cukcuk.view.ProductRenderPanel;
import tokyo.huyhieu.cukcuk.view.StaffFrame;
import tokyo.huyhieu.cukcuk.view.dialog.CheckMoneyDialog;
import tokyo.huyhieu.cukcuk.view.dialog.CheckOutDialog;
import tokyo.huyhieu.cukcuk.view.dialog.ExportDialog;
import tokyo.huyhieu.cukcuk.view.dialog.ImportDialog;
import tokyo.huyhieu.cukcuk.view.dialog.ListOrderDialog;
import tokyo.huyhieu.cukcuk.view.dialog.SaveOrderDialog;

public class StaffController {

    private List<ImportDetail> listImportDetail = new ArrayList<>();
    private DefaultTableModel tableTempOrder = new DefaultTableModel();
    private DefaultTableModel tableTempImport = new DefaultTableModel();
    private DefaultTableModel tableMaterial = new DefaultTableModel();
    private DefaultTableModel tableTempExport = new DefaultTableModel();

    private ProductRepository productRepo = new ProductRepository();
    private MaterialRepository materialRepository = new MaterialRepository();
    private ImportRepository importRepository = new ImportRepository();
    private UserRepository userRepository = new UserRepository();
    private SupplierRepository supplierRepository = new SupplierRepository();
    private ImportDetailRepository importDetailRepository = new ImportDetailRepository();
    private ExportRepository exportRepository = new ExportRepository();
    private ExportDetailRepository exportDetailRepository = new ExportDetailRepository();

    private List<Product> listProductR = new ArrayList<>();
    private List<Product> listProduct = productRepo.findAll();
    private List<Material> materials = materialRepository.findAll();
    private StaffFrame view;
    private User user;

    public StaffController(StaffFrame view, User user) {
        this.user = user;
        this.view = view;
        this.view.setVisible(true);

        listener();
    }

    public void listener() {
        view.getLblFullName().setText(user.getFullName());
        tableTempOrder = (DefaultTableModel) view.getTblOrder().getModel();
        tableTempOrder.setRowCount(0);
        checkMoney();
        checkOutOrder();
        saveOrder();
        btnImport();
        btnExport();
        showListOrder();
        logOut();
        showProduct();
    }

    public void showProduct() {
        listProductR = productRepo.findAll();
        listProductR.forEach(p -> {
            ProductRenderPanel productRenderPanel = new ProductRenderPanel();
            ImageIcon imageIcon = new ImageIcon(
                    new ImageIcon(p.getImage()).getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
            productRenderPanel.getLblImage().setIcon(imageIcon);
            productRenderPanel.getLblProductName().setText(p.getName());
            productRenderPanel.getLblPrice().setText(String.valueOf(p.getPrice()));
            view.getPanelRenderMenu().add(productRenderPanel);
            addProductToOrder(productRenderPanel);
        });
    }

    public void addProductToOrder(ProductRenderPanel panelRender) {
        panelRender.getLblImage().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Product prd = productRepo.findByNameAdd(panelRender.getLblProductName().getText());
                checkProduct(prd);
            }
        });
    };

    public void checkProduct(Product prd) {
        Double total = 0.0;
        for (int i = 0; i < tableTempOrder.getRowCount(); i++) {
            total += Double.parseDouble(tableTempOrder.getValueAt(i, 2).toString());
        }
        if (tableTempOrder.getRowCount() == 0) {
            tableTempOrder.addRow(new Object[] {
                    prd.getName(),
                    1,
                    prd.getPrice()
            });
            total += prd.getPrice();
        } else {
            for (int i = 0; i < tableTempOrder.getRowCount(); i++) {
                if (tableTempOrder.getValueAt(i, 0).equals(prd.getName())) {
                    int quantity = Integer.parseInt(tableTempOrder.getValueAt(i, 1).toString());
                    tableTempOrder.setValueAt(quantity + 1, i, 1);
                    tableTempOrder.setValueAt(quantity * prd.getPrice(), i, 2);
                    total += prd.getPrice();
                    view.getLblTotal().setText(String.valueOf(total) + "VNĐ");
                    return;
                }
            }
            tableTempOrder.addRow(new Object[] {
                    prd.getName(),
                    1,
                    prd.getPrice()
            });
            total += prd.getPrice();
            view.getLblTotal().setText(String.valueOf(total) + "VNĐ");
        }
        view.getLblTotal().setText(String.valueOf(total) + "VNĐ");
    }

    public void btnImport() {
        this.view.getBtnImport().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                List<Material> materials = materialRepository.findAll();
                ImportDialog importDialog = new ImportDialog();
                importDialog.setVisible(true);
                tableMaterial = (DefaultTableModel) importDialog.getTblMaterial().getModel();
                tableMaterial.setRowCount(0);
                materials.forEach(item -> {
                    tableMaterial.addRow(new Object[] {
                            item.getName(),
                            item.getPrice()
                    });
                });
                tableTempImport = (DefaultTableModel) importDialog.getTblTempImportDetal().getModel();
                tableTempImport.setRowCount(0);
                importDialog.getBtnAddTemp().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        int index = importDialog.getTblMaterial().getSelectedRow();
                        Material material = materials.get(index);
                        tableTempImport.addRow(new Object[] {
                                material.getName(),
                                material.getPrice(),
                                importDialog.getTxtQuantity().getText(),
                                (material.getPrice() * (Double.parseDouble(importDialog.getTxtQuantity().getText())))
                        });
                    }
                });
                importDialog.getBtnRemoveTemp().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        int index = importDialog.getTblTempImportDetal().getSelectedRow();
                        tableTempImport.removeRow(index);
                    }
                });
                importDialog.getBtnSave().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        int indexUser = importDialog.getCbUser().getSelectedIndex();
                        User user = userRepository.findAll().get(indexUser);
                        int indexSupplier = importDialog.getCbSupplier().getSelectedIndex();
                        Supplier supplier = supplierRepository.findAll().get(indexSupplier);
                        LocalDate localDate = LocalDate.now();
                        Import importA = new Import(supplier.getId(), user.getId(), localDate.toString());
                        importRepository.insertE(importA);
                        Double total = 0.0;
                        long idImport = importRepository.findAll().get(importRepository.findAll().size() - 1).getId();
                        for (int i = 0; i < tableTempImport.getRowCount(); i++) {
                            long idMaterial = materialRepository.findByName(tableTempImport.getValueAt(i, 0).toString())
                                    .getId();
                            ImportDetail importDetail = new ImportDetail(idImport, idMaterial,
                                    Long.parseLong(tableTempImport.getValueAt(i, 2).toString()),
                                    Double.parseDouble(tableTempImport.getValueAt(i, 3).toString()));
                            total += Double.parseDouble(tableTempImport.getValueAt(i, 3).toString());
                            importDetailRepository.insert(importDetail);
                            listImportDetail.add(importDetail);
                        }
                        System.out.println(localDate.toString());
                        Import importE = new Import(importA.getIdSupplier(), importA.getIdUser(), total,
                                importA.getDate());
                        importRepository.edit(importE, idImport);
                    }
                });
            }
        });
    }

    public void btnExport() {
        this.view.getBtnExport().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                ExportDialog exportDialog = new ExportDialog();
                exportDialog.setVisible(true);
                tableMaterial = (DefaultTableModel) exportDialog.getTblMaterial().getModel();
                tableMaterial.setRowCount(0);
                materialRepository.findAll().forEach(item -> {
                    tableMaterial.addRow(new Object[] {
                            item.getName(),
                            item.getPrice(),
                    });
                });
                tableTempExport = (DefaultTableModel) exportDialog.getTblTempImportDetal().getModel();
                tableTempExport.setRowCount(0);
                exportDialog.getBtnAddTemp().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        int index = exportDialog.getTblMaterial().getSelectedRow();
                        Material material = materials.get(index);
                        tableTempExport.addRow(new Object[] {
                                material.getName(),
                                exportDialog.getTxtQuantity().getText()

                        });
                    }
                });
                exportDialog.getBtnRemoveTemp().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        int index = exportDialog.getTblTempImportDetal().getSelectedRow();
                        tableTempExport.removeRow(index);
                    }
                });
                exportDialog.getBtnSave().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        int indexUser = exportDialog.getCbUser().getSelectedIndex();
                        User user = userRepository.findAll().get(indexUser);
                        LocalDate localDate = LocalDate.now();
                        Export export = new Export();
                        export.setIdUser(user.getId());
                        export.setDate(localDate.toString());
                        exportRepository.insert(export);
                        long idExport = exportRepository.findAll().get(exportRepository.findAll().size() - 1).getId();
                        for (int i = 0; i < tableTempExport.getRowCount(); i++) {
                            ExportDetail exportDetail = new ExportDetail();
                            exportDetail.setIdExport(idExport);
                            exportDetail.setIdMaterial(
                                    materialRepository.findByName(tableTempExport.getValueAt(i, 0).toString()).getId());
                            exportDetail.setQuantity(Integer.parseInt(tableTempExport.getValueAt(i, 1).toString()));
                            exportDetailRepository.insert(exportDetail);
                        }
                    }
                });
            }
        });
    }

    public void checkOutOrder() {
        this.view.getBtnPay().addActionListener(l -> {
            CheckOutDialog checkOutDialog = new CheckOutDialog();
            checkOutDialog.setVisible(true);
        });
    }

    public void saveOrder() {
        this.view.getBtnSaveOrder().addActionListener(l -> {
            SaveOrderDialog saveOrderDialog = new SaveOrderDialog();
            saveOrderDialog.setVisible(true);
        });
    }

    public void checkMoney() {
        this.view.getBtnCheckMoney().addActionListener(l -> {
            CheckMoneyDialog checkMoneyDialog = new CheckMoneyDialog();
            checkMoneyDialog.setVisible(true);
        });
    }

    public void showListOrder() {
        this.view.getBtnOrderList().addActionListener(l -> {
            ListOrderDialog listOrderDialog = new ListOrderDialog();
            listOrderDialog.setVisible(true);
        });
    }

    public void logOut() {
        this.view.getBtnLogout().addActionListener(l -> {
            this.view.dispose();
            LoginController userController = new LoginController(new Login());
        });
    }
}
