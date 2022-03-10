/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokyo.huyhieu.cukcuk.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.Image;

import javax.swing.ImageIcon;
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
    private ProductRepository productRepository = new ProductRepository();
    private CategoryRepository categoryRepository = new CategoryRepository();
    private List<Product> products = new ArrayList<>();
    private List<Category> categories = new ArrayList<>();
    DefaultTableModel table = new DefaultTableModel();

    public ProductController(ProductPanel view) {
        this.view = view;
        this.view.setVisible(true);
        listener();
    }

    public void listener() {
        show();
        add();
        edit();
        remove();
        search();
        reload();
    }

    public void show() {
        products = productRepository.findAll();
        DefaultTableModel table = (DefaultTableModel) this.view.getTblProduct().getModel();
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

    public void btnSave(String addOrEdit, ProductDialog dialog, Product prd) {
        int index = dialog.getCbCategory().getSelectedIndex();
        categories = categoryRepository.findAll();
        Category category = categories.get(index);
        long idCategory = category.getId();
        String name = dialog.getTxtName().getText();
        Double price = Double.parseDouble(dialog.getTxtPrice().getText());
        String image = dialog.getTxtUrlImage().getText();
        Product product = new Product(idCategory, name, price, image);
        if (addOrEdit == ("edit")) {
            productRepository.edit(product, prd.getId());
            return;
        }
    };

    public void btnSave(String addOrEdit, ProductDialog dialog) {
        int index = dialog.getCbCategory().getSelectedIndex();
        categories = categoryRepository.findAll();
        Category category = categories.get(index);
        long idCategory = category.getId();
        String name = dialog.getTxtName().getText();
        Double price = Double.parseDouble(dialog.getTxtPrice().getText());
        String image = dialog.getTxtUrlImage().getText();
        Product product = new Product(idCategory, name, price, image);
        if (addOrEdit == "add") {
            productRepository.insert(product);
            return;
        }
    };

    public void btnCancel(ProductDialog dialog) {
        dialog.getBtnCancel().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                dialog.setVisible(false);
            }
        });
    }

    public void add() {
        this.view.getBtnAdd().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                ProductDialog dialogA = new ProductDialog("add");
                dialogA.setVisible(true);
                dialogA.getTxtName().setText("");
                dialogA.getTxtPrice().setText("");
                dialogA.getTxtUrlImage().setText("");
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
                int index = view.getTblProduct().getSelectedRow();
                if (index == -1) {
                    JOptionPane.showMessageDialog(null, "Chưa chọn sản phẩm");
                    return;
                } else {
                    Product prd = products.get(index);
                    ProductDialog dialogE = new ProductDialog("edit", prd);
                    dialogE.setVisible(true);
                    dialogE.getCbCategory().setSelectedItem(prd.getIdCategory());
                    dialogE.getTxtName().setText(prd.getName());
                    dialogE.getTxtPrice().setText(prd.getPrice().toString());
                    dialogE.getTxtUrlImage().setText(prd.getImage());
                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(prd.getImage()).getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
                    dialogE.getLblShowImage().setIcon(imageIcon);
                    btnCancel(dialogE);
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
                    int index = view.getTblProduct().getSelectedRow();
                    Product prd = products.get(index);
                    productRepository.remove(prd.getId());
                    show();
                } else {
                    show();
                }
            }
        });
    }

    public void reload() {
        this.view.getBtnReload().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                show();
            }
        });
    }

    public void search() {
        this.view.getBtnSearch().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                String name = view.getTxtSearch().getText();
                if (name == "") {
                    show();
                } else {
                    products = productRepository.findByName(name);
                    DefaultTableModel table = (DefaultTableModel) view.getTblProduct().getModel();
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
            }
        });
    }
}
