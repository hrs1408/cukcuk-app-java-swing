package tokyo.huyhieu.cukcuk.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import tokyo.huyhieu.cukcuk.model.Supplier;
import tokyo.huyhieu.cukcuk.repository.SupplierRepository;
import tokyo.huyhieu.cukcuk.view.dialog.SupplierDialog;
import tokyo.huyhieu.cukcuk.view.panel.SupplierPanel;

public class SupplierController {

    private SupplierPanel view;
    private SupplierDialog dialog;
    private SupplierRepository supplierRepository = new SupplierRepository();
    private List<Supplier> suppliers = new ArrayList<>();
    DefaultTableModel table = new DefaultTableModel();

    public SupplierController(SupplierPanel view) {
        this.view = view;
        this.view.setVisible(true);
        this.dialog = dialog;
        listener();
    }

    public void listener() {
        show();
        add();
        edit();
        remove();
    }

    public void show() {
        suppliers = supplierRepository.findAll();
        table = (DefaultTableModel) this.view.getTblSupplier().getModel();
        table.setRowCount(0);
        suppliers.forEach(s -> {
            table.addRow(new Object[]{
                s.getId(),
                s.getName(),
                s.getPhone(),
                s.getAddress()
            });
        });
    }

    public void btnSave(String addOrEdit, SupplierDialog dialog) {
        if (addOrEdit == "add") {
            String name = dialog.getTxtName().getText();
            String phone = dialog.getTxtPhone().getText();
            String address = dialog.getTxtAddress().getText();
            Supplier supplier = new Supplier(name, phone, address);
            supplierRepository.insert(supplier);
            return;
        }
    }

    public void btnSave(String addOrEdit, SupplierDialog dialog, Supplier supplier) {
        if (addOrEdit == "edit") {
            String name = dialog.getTxtName().getText();
            String phone = dialog.getTxtPhone().getText();
            String address = dialog.getTxtAddress().getText();
            Supplier supplierE = new Supplier(name, phone, address);
            supplierRepository.edit(supplierE, supplier.getId());
            return;
        }
    }

    public void btnCancel(SupplierDialog dialog) {
        dialog.getBtnCancel().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                dialog.setVisible(false);
            }
        });
    }

    public void selectedRow() {
        this.view.getTblSupplier().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int index = view.getTblSupplier().getSelectedRow();
                Supplier supplier = suppliers.get(index);
            }
        });
    }

    public void add() {
        this.view.getBtnAdd().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                SupplierDialog dialogA = new SupplierDialog("add");
                dialogA.setVisible(true);
                dialogA.getTxtName().setText("");
                dialogA.getTxtPhone().setText("");
                dialogA.getTxtAddress().setText("");
                btnCancel(dialogA);
                dialogA.addWindowListener(new WindowAdapter() {
                    public void windowClosed(WindowEvent e) {
                        show();
                    }
                });
            }
        });
    }

    public void edit() {
        this.view.getBtnEdit().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int index = view.getTblSupplier().getSelectedRow();
                if (index == -1) {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn nhà cung cấp cần sửa");
                    return;
                } else {
                    Supplier supplier = suppliers.get(index);
                    SupplierDialog dialogE = new SupplierDialog("edit", supplier);
                    dialogE.setVisible(true);
                    dialogE.getTxtName().setText(suppliers.get(view.getTblSupplier().getSelectedRow()).getName());
                    dialogE.getTxtPhone().setText(suppliers.get(view.getTblSupplier().getSelectedRow()).getPhone());
                    dialogE.getTxtAddress().setText(suppliers.get(view.getTblSupplier().getSelectedRow()).getAddress());
                    dialogE.addWindowListener(new WindowAdapter() {
                        public void windowClosed(WindowEvent e) {
                            show();
                        }
                    });
                }
            }
        });
    }

    public void remove() {
        this.view.getBtnRemove().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int opcion = JOptionPane.showConfirmDialog(null, "Bạn có muốn xoá?", "Xác nhận",
                        JOptionPane.YES_NO_OPTION);
                if (opcion == 0) {
                    int indexE = view.getTblSupplier().getSelectedRow();
                    Supplier supplierE = suppliers.get(indexE);
                    supplierRepository.remove(supplierE.getId());
                    show();
                } else {
                    show();
                }
            }
        });
    }
}
