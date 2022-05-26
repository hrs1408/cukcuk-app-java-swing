package tokyo.huyhieu.cukcuk.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import tokyo.huyhieu.cukcuk.model.Export;
import tokyo.huyhieu.cukcuk.model.ExportDetail;
import tokyo.huyhieu.cukcuk.model.Material;
import tokyo.huyhieu.cukcuk.model.User;
import tokyo.huyhieu.cukcuk.model.Warehouse;
import tokyo.huyhieu.cukcuk.repository.ExportDetailRepository;
import tokyo.huyhieu.cukcuk.repository.ExportRepository;
import tokyo.huyhieu.cukcuk.repository.MaterialRepository;
import tokyo.huyhieu.cukcuk.repository.UserRepository;
import tokyo.huyhieu.cukcuk.repository.WarehouseRepository;
import tokyo.huyhieu.cukcuk.view.dialog.ExportDialog;
import tokyo.huyhieu.cukcuk.view.panel.ExportPanel;

public class ExportController {

    private ExportPanel view;
    private ExportRepository exportRepository = new ExportRepository();
    private ExportDetailRepository exportDetailRepository = new ExportDetailRepository();
    private UserRepository userRepository = new UserRepository();
    private MaterialRepository materialRepository = new MaterialRepository();
    private DefaultTableModel table = new DefaultTableModel();
    private DefaultTableModel table2 = new DefaultTableModel();
    private DefaultTableModel tableMaterial = new DefaultTableModel();
    private DefaultTableModel tableTempExport = new DefaultTableModel();
    private List<Export> exports = new ArrayList<>();
    private List<Material> materials = materialRepository.findAll();
    private List<ExportDetail> exportDetails = exportDetailRepository.findAll();
    private WarehouseRepository warehouseRepository = new WarehouseRepository();

    public ExportController(ExportPanel view) {
        this.view = view;
        this.view.setVisible(true);
        listener();
    }

    public void listener() {
        show();
        showExportDetail();
        btnAdd();
        btnEdit();
        btnRemove();
    }

    public void show() {
        exports = exportRepository.findAll();
        table = (DefaultTableModel) this.view.getTblExport().getModel();
        table.setRowCount(0);
        exports.forEach(item -> {
            table.addRow(new Object[]{
                "XH" + item.getId(),
                userRepository.findById(item.getIdUser()).getFullName(),
                item.getDate()
            });
        });
    }

    public void showExportDetail() {
        this.view.getTblExport().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int index = view.getTblExport().getSelectedRow();
                Export exportShow = exports.get(index);
                table2 = (DefaultTableModel) view.getTblExportDetail().getModel();
                table2.setRowCount(0);
                List<ExportDetail> exportDetails = exportDetailRepository.findByExport(exportShow.getId());
                exportDetails.forEach(item -> {
                    table2.addRow(new Object[]{
                        materialRepository.findById(item.getIdMaterial()).getName(),
                        item.getQuantity()
                    });
                });
            }
        });
    }

    public void btnAdd() {
        this.view.getBtnAdd().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                ExportDialog exportDialog = new ExportDialog();
                exportDialog.setVisible(true);
                tableMaterial = (DefaultTableModel) exportDialog.getTblMaterial().getModel();
                tableMaterial.setRowCount(0);
                materialRepository.findAll().forEach(item -> {
                    tableMaterial.addRow(new Object[]{
                        item.getName(),
                        item.getPrice(),});
                });
                tableTempExport = (DefaultTableModel) exportDialog.getTblTempImportDetal().getModel();
                tableTempExport.setRowCount(0);
                exportDialog.getBtnAddTemp().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        int index = exportDialog.getTblMaterial().getSelectedRow();
                        Material material = materials.get(index);
                        tableTempExport.addRow(new Object[]{
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
                            Warehouse warehouse = warehouseRepository.findById(
                                    materialRepository.findByName(tableTempExport.getValueAt(i, 0).toString()).getId());
                            if (Long.parseLong(tableTempExport.getValueAt(i, 1).toString()) > warehouse.getQuantity()) {
                                JOptionPane.showMessageDialog(null, "Số lượng xuất của nguyên liệu "
                                        + materialRepository.findById(materialRepository
                                                .findByName(tableTempExport.getValueAt(i, 0).toString()).getId())
                                                .getName()
                                        + " lớn hơn số lượng trong kho");
                                return;
                            } else {
                                ExportDetail exportDetail = new ExportDetail();
                                exportDetail.setIdExport(idExport);
                                exportDetail.setIdMaterial(
                                        materialRepository.findByName(tableTempExport.getValueAt(i, 0).toString())
                                                .getId());
                                exportDetail.setQuantity(Integer.parseInt(tableTempExport.getValueAt(i, 1).toString()));

                                warehouse.setIdMaterial(
                                        materialRepository.findByName(tableTempExport.getValueAt(i, 0).toString())
                                                .getId());
                                warehouse.setQuantity(warehouse.getQuantity()
                                        - Long.parseLong(tableTempExport.getValueAt(i, 1).toString()));
                                warehouseRepository.edit(warehouse,
                                        materialRepository.findByName(tableTempExport.getValueAt(i, 0).toString())
                                                .getId());
                                exportDetailRepository.insert(exportDetail);
                            }
                            JOptionPane.showMessageDialog(null, "Insert successfully !!");

                        }
                    }
                });
                exportDialog.addWindowListener(new WindowAdapter() {
                    @Override
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
                int index = view.getTblExport().getSelectedRow();
                Export export = exports.get(index);
                ExportDialog exportDialog = new ExportDialog();
                List<ExportDetail> exportDetails = exportDetailRepository.findByExport(export.getId());
                exportDialog.setVisible(true);
                tableMaterial = (DefaultTableModel) exportDialog.getTblMaterial().getModel();
                tableMaterial.setRowCount(0);
                materialRepository.findAll().forEach(item -> {
                    tableMaterial.addRow(new Object[]{
                        item.getName(),
                        item.getPrice(),});
                });
                tableTempExport = (DefaultTableModel) exportDialog.getTblTempImportDetal().getModel();
                tableTempExport.setRowCount(0);
                exportDetails.forEach(item -> {
                    tableTempExport.addRow(new Object[]{
                        materialRepository.findById(item.getIdMaterial()).getName(),
                        item.getQuantity()
                    });
                });
                exportDialog.getBtnAddTemp().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        int index = exportDialog.getTblMaterial().getSelectedRow();
                        Material material = materials.get(index);
                        tableTempExport.addRow(new Object[]{
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
                        export.setIdUser(user.getId());
                        export.setDate(localDate.toString());
                        exportRepository.edit(export, export.getId());
                        for (int i = 0; i < exportDetails.size(); i++) {
                            Warehouse warehouse = warehouseRepository.findById(exportDetails.get(i).getIdMaterial());
                            warehouse.setIdMaterial(exportDetails.get(i).getIdMaterial());
                            warehouse.setQuantity(warehouse.getQuantity() + exportDetails.get(i).getQuantity());
                            warehouseRepository.edit(warehouse, exportDetails.get(i).getIdMaterial());
                        }
                        exportDetailRepository.removeByIdExport(export.getId());

                        for (int i = 0; i < tableTempExport.getRowCount(); i++) {
                            ExportDetail exportDetail = new ExportDetail();
                            exportDetail.setIdExport(export.getId());
                            exportDetail.setIdMaterial(
                                    materialRepository.findByName(tableTempExport.getValueAt(i, 0).toString()).getId());
                            exportDetail.setQuantity(Integer.parseInt(tableTempExport.getValueAt(i, 1).toString()));
                            Warehouse warehouse = warehouseRepository.findById(
                                    materialRepository.findByName(tableTempExport.getValueAt(i, 0).toString()).getId());
                            warehouse.setIdMaterial(
                                    materialRepository.findByName(tableTempExport.getValueAt(i, 0).toString())
                                            .getId());
                            warehouse.setQuantity(warehouse.getQuantity()
                                    - Long.parseLong(tableTempExport.getValueAt(i, 1).toString()));
                            warehouseRepository.edit(warehouse,
                                    materialRepository.findByName(tableTempExport.getValueAt(i, 0).toString()).getId());
                            exportDetailRepository.insert(exportDetail);
                        }
                    }
                });
                exportDialog.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        show();
                    }
                });
            }
        });
    }

    public void btnRemove() {
        this.view.getBtnRemove().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                int index = view.getTblExport().getSelectedRow();
                Export export = exports.get(index);
                for (int i = 0; i < exportDetails.size(); i++) {
                    Warehouse warehouse = warehouseRepository.findById(exportDetails.get(i).getIdMaterial());
                    warehouse.setIdMaterial(exportDetails.get(i).getIdMaterial());
                    warehouse.setQuantity(warehouse.getQuantity() + exportDetails.get(i).getQuantity());
                    warehouseRepository.edit(warehouse, exportDetails.get(i).getIdMaterial());
                }
                exportDetailRepository.removeByIdExport(export.getId());
                exportRepository.remove(export.getId());
                show();
            }
        });
    }
}
