/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokyo.huyhieu.cukcuk.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import tokyo.huyhieu.cukcuk.model.Category;
import tokyo.huyhieu.cukcuk.model.Product;
import tokyo.huyhieu.cukcuk.repository.CategoryRepository;
import tokyo.huyhieu.cukcuk.repository.ProductRepository;
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
    
    public ProductController(ProductPanel view)  {
        this.view = view;
        this.view.setVisible(true);
        listener();
    }

    public void listener()  {
        show();
//        selectedRow();
//        add();
//        edit();
//        remove();
    }

    public void show() {
        System.out.println("show");
        products = productRepository.findAll();
        categories = categoryRepository.findAll();
        table = (DefaultTableModel) this.view.getTblProduct().getModel();
        table.setRowCount(0);
        products.forEach(p -> {
            table.addRow(new Object[] {
                p.getId(),
                p.getName(),
                p.getPrice()
            });
        });
    }
    
//    public void add(){
//        this.view.getBtnAdd().addActionListener((e) -> {
//            String name = this.view.getTxtName().getText();
//            Double price = Double.parseDouble(this.view.getTxtName().getText());
//            Product product = new Product(name, price);
//            productRepository.insert(product);
//            show();
//        });
//    }
//    
//    public void selectedRow() {
//        this.view.getTblProduct().addMouseListener(new MouseAdapter(){
//            @Override
//            public void mousePressed(MouseEvent e) {
//                int index = view.getTblProduct().getSelectedRow();
//                Product prd = products.get(index);
//                 //To change body of generated methods, choose Tools | Templates.
//            }
//        });
//    }
//    
//    public void edit() {
//        this.view.getBtnEdit().addActionListener((e) -> {
//            int index = view.getTblProduct().getSelectedRow();
//            Product prd = products.get(index);
//            Long id = prd.getId();
//            String name = view.getTxtName().getText();
//            Double price = Double.parseDouble(this.view.getTxtPrice().getText());
//            prd.setName(name);
//            prd.setPrice(price);
//            productRepository.edit(prd, id);
//            show();
//        });
//    }
//    
//    public void remove() {
//        this.view.getBtnRemove().addActionListener((e) -> {
//            int index = view.getTbProduct().getSelectedRow();
//            Product prd = products.get(index);
//            productRepository.remove(prd.getId());
//            show();
//        });
//    }
}
