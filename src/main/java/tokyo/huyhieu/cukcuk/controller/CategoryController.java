/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokyo.huyhieu.cukcuk.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import tokyo.huyhieu.cukcuk.model.Category;
import tokyo.huyhieu.cukcuk.repository.CategoryRepository;
import tokyo.huyhieu.cukcuk.view.panel.CategoryPanel;

/**
 *
 * @author huyhi
 */
public class CategoryController {

    private CategoryPanel view;
    private CategoryRepository categoryRepository = new CategoryRepository();
    private List<Category> categories = categoryRepository.findAll();
    DefaultTableModel table = new DefaultTableModel();

    public CategoryController(CategoryPanel view) {
        this.view = view;
        listener();
    }

    public void listener() {
        show();
        selectedRow();
        btnAdd();
        btnEdit();
        btnDelete();
    }

    public void show() {
        categories = categoryRepository.findAll();
        table = (DefaultTableModel) this.view.getTblCategory().getModel();
        table.setRowCount(0);
        categories.forEach(c -> {
            table.addRow(new Object[] {
                    c.getId(),
                    c.getName()
            });
        });
    }

    public void btnAdd() {
        view.getBtnAdd().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Category category = new Category();
                category.setName(view.getTxtName().getText());
                categoryRepository.insert(category);
                show();
            }
        });
    }

    public void btnEdit() {
        view.getBtnEdit().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int index = view.getTblCategory().getSelectedRow();
                if (index == -1) {
                    JOptionPane.showMessageDialog(view, "Chưa chọn dòng nào");
                } else {
                    int opcion = JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa?", "Xác nhận",
                            JOptionPane.YES_NO_OPTION);
                    if (opcion == 0) {
                        Category category = new Category();
                        category.setName(view.getTxtName().getText());
                        categoryRepository.edit(category, categories.get(index).getId());
                        show();
                    } else {
                        show();
                    }
                }
            }
        });
    }

    public void btnDelete() {
        view.getBtnRemove().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int index = view.getTblCategory().getSelectedRow();
                if (index == -1) {
                    JOptionPane.showMessageDialog(view, "Chưa chọn dòng nào");
                } else {
                    int opcion = JOptionPane.showConfirmDialog(null, "Bạn có muốn xoá?", "Xác nhận",
                            JOptionPane.YES_NO_OPTION);
                    if (opcion == 0) {
                        categoryRepository.remove(categories.get(index).getId());
                        show();
                    } else {
                        show();
                    }
                }
            }
        });
    }

    public void selectedRow() {
        this.view.getTblCategory().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int index = view.getTblCategory().getSelectedRow();
                Category cate = categories.get(index);
                view.getTxtId().setText(String.valueOf(cate.getId()));
                view.getTxtName().setText(cate.getName());
            }
        });
    }
}
