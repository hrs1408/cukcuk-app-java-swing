package tokyo.huyhieu.cukcuk.controller;

import tokyo.huyhieu.cukcuk.model.User;
import tokyo.huyhieu.cukcuk.repository.UserRepository;
import tokyo.huyhieu.cukcuk.view.dialog.StaffDialog;
import tokyo.huyhieu.cukcuk.view.panel.StaffPanel;
import java.awt.Dialog;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmployeeController {

    private StaffPanel view;
    private StaffDialog dialog;
    private UserRepository userRepo = new UserRepository();
    private List<User> users = new ArrayList<>();
    DefaultTableModel table = new DefaultTableModel();

    public EmployeeController(StaffPanel view) {
        this.view = view;
        this.view.setVisible(true);
        listener();
    }

    public void listener() {
        show();
        handleAdd();
        handleEdit();
        handleDelete();
        selectedRow();
    }

    public void show() {
        users = userRepo.findAll();
        table = (DefaultTableModel) this.view.getTblStaff().getModel();
        table.setRowCount(0);
        users.forEach(u -> {
            String role = "";
            if (u.getRole()) {
                role = "Admin";
            } else {
                role = "Staff";
            }
            table.addRow(new Object[] {
                    u.getFullName(),
                    u.getUserName(),
                    role,
                    u.getPhone()
            });
        });
    }

    public void btnSave(String addOrEdit, StaffDialog dialog) {
        boolean role;
        if (dialog.getCbRole().getSelectedItem().toString() == "Quản lý") {
            role = true;
        } else {
            role = false;
        }
        String fullName = dialog.getTxtName().getText();
        String userName = dialog.getTxtUserName().getText();
        String password = dialog.getTxtPassword().getText();
        String phone = dialog.getTxtPhone().getText();
        User user = new User(fullName, userName, password, role, phone);
        if (addOrEdit == "add") {
            if (dialog.getTxtName().getText().equals("") || dialog.getTxtUserName().getText().equals("")
                    || dialog.getTxtPassword().getText().equals("") || dialog.getTxtPhone().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill in all fields");
            } else {
                userRepo.insert(user);
                show();
            }
        } else if (addOrEdit == "edit") {
            int indexE = view.getTblStaff().getSelectedRow();
            User userE = users.get(indexE);
            userRepo.edit(user, userE.getId());
            show();
        }
    }

    public void btnSave(String addOrEdit, StaffDialog dialog, User userE) {
        boolean role;
        if (dialog.getCbRole().getSelectedItem().toString() == "Quản lý") {
            role = true;
        } else {
            role = false;
        }
        String fullName = dialog.getTxtName().getText();
        String userName = dialog.getTxtUserName().getText();
        String password = dialog.getTxtPassword().getText();
        String phone = dialog.getTxtPhone().getText();
        User user = new User(fullName, userName, password, role, phone);
        userRepo.edit(user, userE.getId());
    }

    public void btnCancel(StaffDialog dialog) {
        dialog.getBtnCancel().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                dialog.setVisible(false);
            }
        });
    }

    public void handleAdd() {
        this.view.getBtnAdd().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                StaffDialog dialogA = new StaffDialog("add");
                dialogA.setVisible(true);
                dialogA.setVisible(true);
                dialogA.getTxtName().setText("");
                dialogA.getTxtUserName().setText("");
                dialogA.getTxtPassword().setText("");
                dialogA.getCbRole().setSelectedIndex(-1);
                dialogA.getTxtPhone().setText("");
                btnCancel(dialogA);
                dialogA.addWindowListener(new WindowAdapter() {
                    public void windowClosed(WindowEvent e) {
                        show();
                    }
                });
            }
        });
    }

    public void handleEdit() {
        this.view.getBtnEdit().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int indexE = view.getTblStaff().getSelectedRow();
                if (indexE == -1) {
                    JOptionPane.showMessageDialog(null, "Please select a row");
                } else {
                    User user = users.get(indexE);
                    StaffDialog dialogE = new StaffDialog("edit", user);
                    dialogE.setVisible(true);
                    dialogE.getTxtName().setText(user.getFullName());
                    dialogE.getTxtUserName().setText(user.getUserName());
                    dialogE.getTxtPassword().setText(user.getPassword());
                    if (user.getRole()) {
                        dialogE.getCbRole().setSelectedItem("Quản lý");
                    } else {
                        dialogE.getCbRole().setSelectedItem("Nhân viên");
                    }
                    dialogE.getTxtPhone().setText(user.getPhone());
                    btnCancel(dialogE);
                    dialogE.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosing(WindowEvent e) {
                            show();
                        }
                    });
                }
            }
        });
    }

    public void handleDelete() {
        this.view.getBtnRemove().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int opcion = JOptionPane.showConfirmDialog(null, "Bạn có muốn xoá?", "Xác nhận",
                        JOptionPane.YES_NO_OPTION);
                if (opcion == 0) {
                    int index = view.getTblStaff().getSelectedRow();
                    User user = users.get(index);
                    userRepo.remove(user.getId());
                    show();
                } else {
                    show();
                }
            }
        });
    }

    public void selectedRow() {
        this.view.getTblStaff().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int index = view.getTblStaff().getSelectedRow();
                User user = users.get(index);

                view.getTxtName().setText(user.getFullName());
                view.getTxtUserName().setText(user.getUserName());
                view.getTxtPhone().setText(user.getPhone());
                if (user.getRole()) {
                    view.getTxtRole().setText("Quản lý");
                } else {
                    view.getTxtRole().setText("Nhân viên");
                }
            }
        });
    }
}
