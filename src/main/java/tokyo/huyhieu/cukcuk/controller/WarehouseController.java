package tokyo.huyhieu.cukcuk.controller;

import java.util.ArrayList;
import java.util.List;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import tokyo.huyhieu.cukcuk.model.Material;
import tokyo.huyhieu.cukcuk.model.Warehouse;
import tokyo.huyhieu.cukcuk.repository.MaterialRepository;
import tokyo.huyhieu.cukcuk.repository.WarehouseRepository;
import tokyo.huyhieu.cukcuk.view.panel.WareHousePanel;

public class WarehouseController {
    private WareHousePanel view;
    private WarehouseRepository warehouseRepository = new WarehouseRepository();
    private MaterialRepository materialRepository = new MaterialRepository();
    DefaultTableModel table = new DefaultTableModel();
    DefaultTableModel table2 = new DefaultTableModel();
    private List<Warehouse> warehouses = new ArrayList<>();
    private List<Material> materials = new ArrayList<>();

    public WarehouseController(WareHousePanel view) {
        this.view = view;
        this.view.setVisible(true);
        listener();
    }

    public void listener() {
        show();
        btnAdd();
        btnEdit();
        btnRemove();
        selectedRow();
    }

    public void show() {
        warehouses = warehouseRepository.findAll();
        materials = materialRepository.findAll();
        table = (DefaultTableModel) this.view.getTblWareHouse().getModel();
        table2 = (DefaultTableModel) this.view.getTblMaterial().getModel();
        table.setRowCount(0);
        warehouses.forEach(item -> {
            Material material = materialRepository.findById(item.getIdMaterial());
            table.addRow(new Object[] {
                    material.getName(),
                    item.getQuantity()
            });
        });
        table2.setRowCount(0);
        materials.forEach(item -> {
            table2.addRow(new Object[] {
                    item.getName(),
                    item.getPrice()
            });
        });
    }

    public void btnAdd() {
        this.view.getBtnAdd().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                Material material = new Material();
                material.setName(view.getTxtName().getText());
                material.setPrice(Double.parseDouble(view.getTxtPrice().getText()));
                materialRepository.insert(material);
                show();
            }
        });
    }

    public void btnEdit() {
        this.view.getBtnEdit().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int index = view.getTblMaterial().getSelectedRow();
                if (index == -1) {
                    JOptionPane.showMessageDialog(view, "Chưa chọn dòng nào");
                } else {
                    int opcion = JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa?", "Xác nhận",
                            JOptionPane.YES_NO_OPTION);
                    if (opcion == 0) {
                        Material material = new Material();
                        material.setName(view.getTxtName().getText());
                        material.setPrice(Double.parseDouble(view.getTxtPrice().getText()));
                        materialRepository.edit(material, materials.get(index).getId());
                        show();
                    } else {
                        show();
                    }
                }
            }
        });
    }

    public void btnRemove() {
        this.view.getBtnRemove().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mouseClicked(e);
                int index = view.getTblMaterial().getSelectedRow();
                if (index == -1) {
                    JOptionPane.showMessageDialog(view, "Chưa chọn dòng nào");
                } else {
                    int opcion = JOptionPane.showConfirmDialog(null, "Bạn có muốn xoá?", "Xác nhận",
                            JOptionPane.YES_NO_OPTION);
                    if (opcion == 0) {
                        materialRepository.remove(materials.get(index).getId());
                        show();
                    } else {
                        show();
                    }
                }
            }
        });
    }

    public void selectedRow() {
        this.view.getTblMaterial().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                materials = materialRepository.findAll();
                int index = view.getTblMaterial().getSelectedRow();
                Material material = materials.get(index);
                view.getTxtIdMaterial().setText(String.valueOf(material.getId()));
                view.getTxtName().setText(material.getName());
                view.getTxtPrice().setText(String.valueOf(material.getPrice()));
            }
        });
    }
}
