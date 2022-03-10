package tokyo.huyhieu.cukcuk.controller;

import java.util.ArrayList;
import java.util.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import tokyo.huyhieu.cukcuk.model.Import;
import tokyo.huyhieu.cukcuk.model.ImportDetail;
import tokyo.huyhieu.cukcuk.model.Material;
import tokyo.huyhieu.cukcuk.model.Supplier;
import tokyo.huyhieu.cukcuk.model.User;
import tokyo.huyhieu.cukcuk.model.Warehouse;
import tokyo.huyhieu.cukcuk.repository.ImportDetailRepository;
import tokyo.huyhieu.cukcuk.repository.ImportRepository;
import tokyo.huyhieu.cukcuk.repository.MaterialRepository;
import tokyo.huyhieu.cukcuk.repository.SupplierRepository;
import tokyo.huyhieu.cukcuk.repository.UserRepository;
import tokyo.huyhieu.cukcuk.repository.WarehouseRepository;
import tokyo.huyhieu.cukcuk.view.dialog.ImportDialog;
import tokyo.huyhieu.cukcuk.view.panel.ImportPanel;

public class ImportController {
    private ImportPanel view;
    private ImportRepository importRepository = new ImportRepository();
    private ImportDetailRepository importDetailRepository = new ImportDetailRepository();
    private SupplierRepository supplierRepository = new SupplierRepository();
    private UserRepository userRepository = new UserRepository();
    private MaterialRepository materialRepository = new MaterialRepository();
    private DefaultTableModel table = new DefaultTableModel();
    private DefaultTableModel table2 = new DefaultTableModel();
    private DefaultTableModel tableMaterial = new DefaultTableModel();
    private DefaultTableModel tableTempImport = new DefaultTableModel();
    private WarehouseRepository warehouseRepository = new WarehouseRepository();
    private List<Import> listImport = new ArrayList<>();
    private List<ImportDetail> listImportDetail = new ArrayList<>();

    public ImportController(ImportPanel view) {
        this.view = view;
        this.view.setVisible(true);
        listener();
    }

    public void listener() {
        show();
        showDetail();
        btnAdd();
        btnEdit();
        btnDelete();
    }

    public void show() {
        listImport = importRepository.findAll();
        table = (DefaultTableModel) this.view.getTblImport().getModel();
        table.setRowCount(0);
        listImport.forEach(item -> {
            table.addRow(new Object[] {
                    "NH" + item.getId(),
                    supplierRepository.findById(item.getIdSupplier()).getName(),
                    userRepository.findById(item.getIdUser()).getFullName(),
                    importDetailRepository.getTotalById(item.getId()),
                    item.getDate()
            });
        });
    }

    public void showDetail() {
        this.view.getTblImport().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int index = view.getTblImport().getSelectedRow();
                Import importShow = listImport.get(index);
                table2 = (DefaultTableModel) view.getTblImportDetail().getModel();
                table2.setRowCount(0);
                listImportDetail = importDetailRepository.findByImport(importShow.getId());
                listImportDetail.forEach(item -> {
                    table2.addRow(new Object[] {
                            materialRepository.findById(item.getIdMaterial()).getName(),
                            materialRepository.findById(item.getIdMaterial()).getPrice(),
                            item.getQuantity(),
                            item.getIntoMoney()
                    });
                });
            }
        });
    }

    public void btnAdd() {
        this.view.getBtnAdd().addMouseListener(new MouseAdapter() {
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
                            Warehouse warehouse = warehouseRepository.findById(idMaterial);
                            warehouse.setIdMaterial(idMaterial);
                            warehouse.setQuantity(warehouse.getQuantity() + Long.parseLong(tableTempImport.getValueAt(i, 2).toString()));
                            warehouseRepository.edit(warehouse, idMaterial);
                            importDetailRepository.insert(importDetail);
                            listImportDetail.add(importDetail);
                        }
                        System.out.println(localDate.toString());
                        Import importE = new Import(importA.getIdSupplier(), importA.getIdUser(), total,
                                importA.getDate());
                        importRepository.edit(importE, idImport);
                    }
                });
                importDialog.addWindowListener(new WindowAdapter() {
                    public void windowClosed(WindowEvent e) {
                        show();
                    }
                });
            }
        });
    }

    public void btnEdit() {
        this.view.getBtnEdit().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                ImportDialog importDialog = new ImportDialog();
                importDialog.setVisible(true);
                long idImport = importRepository.findAll().get(view.getTblImport().getSelectedRow()).getId();
                List<ImportDetail> importDetails = importDetailRepository.findByImport(idImport);
                tableTempImport = (DefaultTableModel) importDialog.getTblTempImportDetal().getModel();
                tableTempImport.setRowCount(0);
                tableMaterial = (DefaultTableModel) importDialog.getTblMaterial().getModel();
                tableMaterial.setRowCount(0);
                List<Material> materials = materialRepository.findAll();
                materials.forEach(item -> {
                    tableMaterial.addRow(new Object[] {
                            item.getName(),
                            item.getPrice()
                    });
                });
                importDetails.forEach(item -> {
                    tableTempImport.addRow(new Object[] {
                            materialRepository.findById(item.getIdMaterial()).getName(),
                            materialRepository.findById(item.getIdMaterial()).getPrice(),
                            item.getQuantity(),
                            item.getIntoMoney()
                    });
                });
                Import importE = importRepository.findById(idImport);
                importDialog.getCbUser().setSelectedItem(userRepository.findById(importE.getIdUser()).getFullName());
                importDialog.getCbSupplier()
                        .setSelectedItem(supplierRepository.findById(importE.getIdSupplier()).getName());
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
                        int indexImport = view.getTblImport().getSelectedRow();
                        int indexUser = importDialog.getCbUser().getSelectedIndex();
                        User user = userRepository.findAll().get(indexUser);
                        int indexSupplier = importDialog.getCbSupplier().getSelectedIndex();
                        Supplier supplier = supplierRepository.findAll().get(indexSupplier);
                        LocalDate localDate = LocalDate.now();
                        Import importF = importRepository.findById(importRepository.findAll().get(indexImport).getId());
                        for (int i = 0; i < importDetails.size(); i++) {
                            Warehouse warehouse = warehouseRepository.findById(importDetails.get(i).getIdMaterial());
                                warehouse.setIdMaterial(importDetails.get(i).getIdMaterial());
                                warehouse.setQuantity(warehouse.getQuantity() - importDetails.get(i).getQuantity());
                                warehouseRepository.edit(warehouse, importDetails.get(i).getIdMaterial());
                        }
                        importDetailRepository.removeByIdImport(importF.getId());
                        Import importA = new Import(supplier.getId(), user.getId(), localDate.toString());
                        importRepository.editE(importA, importF.getId());
                        Double total = 0.0;
                        for (int i = 0; i < tableTempImport.getRowCount(); i++) {
                            long idMaterial = materialRepository.findByName(tableTempImport.getValueAt(i, 0).toString())
                                    .getId();
                            ImportDetail importDetail = new ImportDetail(importF.getId(), idMaterial,
                                    Long.parseLong(tableTempImport.getValueAt(i, 2).toString()),
                                    Double.parseDouble(tableTempImport.getValueAt(i, 3).toString()));

                            total += Double.parseDouble(tableTempImport.getValueAt(i, 3).toString());
                            Warehouse warehouse = warehouseRepository.findById(idMaterial);
                            warehouse.setIdMaterial(idMaterial);
                            warehouse.setQuantity(warehouse.getQuantity() + Long.parseLong(tableTempImport.getValueAt(i, 2).toString()));
                            warehouseRepository.edit(warehouse, idMaterial);
                            importDetailRepository.insert(importDetail);
                            listImportDetail.add(importDetail);
                        }
                        Import importE = new Import(importA.getIdSupplier(), importA.getIdUser(), total,
                                importA.getDate());
                        importRepository.edit(importE, importF.getId());
                    }
                });
                importDialog.addWindowListener(new WindowAdapter() {
                    public void windowClosed(WindowEvent e) {
                        show();
                    }
                });

            }
        });
    }

    public void btnDelete() {
        this.view.getBtnRemove().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int opcion = JOptionPane.showConfirmDialog(null, "Bạn có muốn xoá?", "Xác nhận",
                        JOptionPane.YES_NO_OPTION);
                if (opcion == 0) {
                    int index = view.getTblImport().getSelectedRow();
                    Import importDelete = listImport.get(index);
                    List<ImportDetail> importDetails = importDetailRepository.findByImport(importDelete.getId());
                    for (int i = 0; i < importDetails.size(); i++) {
                        Warehouse warehouse = warehouseRepository.findById(importDetails.get(i).getIdMaterial());
                            warehouse.setIdMaterial(importDetails.get(i).getIdMaterial());
                            warehouse.setQuantity(warehouse.getQuantity() - importDetails.get(i).getQuantity());
                            warehouseRepository.edit(warehouse, importDetails.get(i).getIdMaterial());
                    }
                    importDetailRepository.removeByIdImport(importDelete.getId());
                    importRepository.remove(importDelete.getId());
                    show();
                } else {
                    show();
                }
            }
        });
    }
}
