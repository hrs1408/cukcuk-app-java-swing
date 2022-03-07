package tokyo.huyhieu.cukcuk.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import tokyo.huyhieu.cukcuk.model.Import;
import tokyo.huyhieu.cukcuk.model.ImportDetail;
import tokyo.huyhieu.cukcuk.model.Material;
import tokyo.huyhieu.cukcuk.model.Supplier;
import tokyo.huyhieu.cukcuk.model.User;
import tokyo.huyhieu.cukcuk.repository.ImportDetailRepository;
import tokyo.huyhieu.cukcuk.repository.ImportRepository;
import tokyo.huyhieu.cukcuk.repository.MaterialRepository;
import tokyo.huyhieu.cukcuk.repository.SupplierRepository;
import tokyo.huyhieu.cukcuk.repository.UserRepository;
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

    private List<Import> listImport = new ArrayList<>();
    private List<ImportDetail> listImportDetail = new ArrayList<>();

    public ImportController(ImportPanel view) {
        this.view = view;
        this.view.setVisible(true);
        listener();
    }

    public void listener() {
        // show();
        // showDetail();
        // btnAdd();
        // btnEdit();
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
                    importDetailRepository.getTotalById(item.getId())
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
                        Import importA = new Import(supplier.getId(), user.getId());
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
                        Import importE = new Import(importA.getIdSupplier(), importA.getIdUser(), total);
                        importRepository.edit(importE, idImport);
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
                importDetails.forEach(item -> {
                    tableTempImport.addRow(new Object[] {
                            materialRepository.findById(item.getIdMaterial()).getName(),
                            materialRepository.findById(item.getIdMaterial()).getPrice(),
                            item.getQuantity(),
                            item.getIntoMoney()
                    });
                });
                Import importE = importRepository.findById(idImport);
                importDialog.getCbUser().setSelectedItem(importE.getIdUser());
                importDialog.getCbSupplier().setSelectedItem(importE.getIdSupplier());
            }
        });
    }
}
