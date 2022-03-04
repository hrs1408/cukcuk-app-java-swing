/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokyo.huyhieu.cukcuk.controller;

import java.awt.Dialog;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tokyo.huyhieu.cukcuk.model.Category;
import tokyo.huyhieu.cukcuk.model.Product;
import tokyo.huyhieu.cukcuk.repository.CategoryRepository;
import tokyo.huyhieu.cukcuk.repository.ProductRepository;
import tokyo.huyhieu.cukcuk.view.dialog.ProductDialog;
import tokyo.huyhieu.cukcuk.view.panel.ProductPanel;

/**
 *
 * @author huyhi
 */
public class ProductController {

    private ProductPanel view;
    private ProductDialog dialog;
    private ProductRepository productRepository = new ProductRepository();
    private CategoryRepository categoryRepository = new CategoryRepository();
    private List<Product> products = new ArrayList<>();
    private List<Category> categories = new ArrayList<>();
    DefaultTableModel table = new DefaultTableModel();

    public ProductController(ProductPanel view, ProductDialog dialog) {
        this.view = view;
        this.dialog = dialog;
        this.view.setVisible(true);
        listener();
    }

    public void listener() {
        show();
        add();
        edit();
        remove();
        
    }

    public void show() {
        products = productRepository.findAll();
        table = (DefaultTableModel) this.view.getTblProduct().getModel();
        table.setRowCount(0);
        products.forEach(p -> {
            Category category = categoryRepository.findById(p.getIdCategory());
            table.addRow(new Object[] {
                    category.getName(),
                    p.getName(),
                    p.getPrice(),
                    p.getImage()
            });
        });
    }

    public void add() {
        categories = categoryRepository.findAll();
        this.view.getBtnAdd().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                dialog.setVisible(true);
                btnSave("add");
            }
        });
    }

    public void btnSave(String addOrEdit) {
        this.dialog.getBtnSave().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int index = dialog.getCbCategory().getSelectedIndex();
                Category category = categories.get(index);
                long idCategory = category.getId();
                String name = dialog.getTxtName().getText();
                Double price = Double.parseDouble(dialog.getTxtPrice().getText());
                String image = dialog.getTxtUrlImage().getText();
                Product product = new Product(idCategory, name, price, image);
                if (addOrEdit == "add") {
                    productRepository.insert(product);
                } else {
                    int indexE = view.getTblProduct().getSelectedRow();
                    Product prd = products.get(indexE);
                    productRepository.edit(product, prd.getId());
                }
                show();
            }
        });
    }

    public void btnCancel() {
        this.dialog.getBtnCancel().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                dialog.setVisible(false);
            }
        });
    }

    public void selectedRow() {
        this.view.getTblProduct().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int index = view.getTblProduct().getSelectedRow();
                Product prd = products.get(index);
            }
        });
    }

    public void edit() {
        this.view.getBtnEdit().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int index = view.getTblProduct().getSelectedRow();
                Product prd = products.get(index);
                dialog.setVisible(true);
                dialog.getTxtName().setText(prd.getName());
                dialog.getTxtPrice().setText(prd.getPrice().toString());
                dialog.getTxtUrlImage().setText(prd.getImage());
                btnSave("edit");
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
                    int index = view.getTblProduct().getSelectedRow();
                    Product prd = products.get(index);
                    productRepository.remove(prd.getId());
                    show();
                } else {
                    System.out.print("no");
                }
            }
        });
    }
}
