/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokyo.huyhieu.cukcuk.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import tokyo.huyhieu.cukcuk.view.AdminFrame;
import tokyo.huyhieu.cukcuk.view.panel.CategoryPanel;
import tokyo.huyhieu.cukcuk.view.panel.DashBoardPanel;
import tokyo.huyhieu.cukcuk.view.panel.ExportPanel;
import tokyo.huyhieu.cukcuk.view.panel.ImportPanel;
import tokyo.huyhieu.cukcuk.view.panel.ProductPanel;
import tokyo.huyhieu.cukcuk.view.panel.StaffPanel;
import tokyo.huyhieu.cukcuk.view.panel.SupplierPanel;
import tokyo.huyhieu.cukcuk.view.panel.VoucherPanel;
import tokyo.huyhieu.cukcuk.view.panel.WareHousePanel;

/**
 *
 * @author huyhi
 */
public class AdminController {

    private AdminFrame view;
    ProductPanel productPanel = new ProductPanel();
    DashBoardPanel dashBoardPanel = new DashBoardPanel();
    CategoryPanel categoryPanel = new CategoryPanel();
    WareHousePanel warehousePanel = new WareHousePanel();
    VoucherPanel voucherPanel = new VoucherPanel();
    SupplierPanel supplierPanel = new SupplierPanel();
    StaffPanel staffPanel = new StaffPanel();
    ImportPanel importPanel = new ImportPanel();
    ExportPanel exportPanel = new ExportPanel();
    

    public AdminController(AdminFrame view) {
        this.view = view;
        this.view.setVisible(true);
        this.view.add(productPanel);
        this.view.add(dashBoardPanel);
        this.view.add(categoryPanel);
        this.view.add(warehousePanel);
        this.view.add(voucherPanel);
        this.view.add(supplierPanel);
        this.view.add(staffPanel);
        this.view.add(importPanel);
        this.view.add(exportPanel);
        listener();
    }

    public void listener() {
        btnDashBoard();
        btnProduct();
        btnCategory();
        btnWareHouse();
        btnVoucher();
        btnSupplier();
        btnStaff();
    }

    public void btnDashBoard() {
        this.view.getBtnDashboard().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switchPanel(dashBoardPanel);
            }
        });
    }

    public void btnProduct() {
        this.view.getBtnMenu().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switchPanel(productPanel);
            }
        });
    }

    public void btnCategory() {
        this.view.getBtnCategory().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switchPanel(categoryPanel);
            }
        });
    }

    public void btnWareHouse() {
        this.view.getBtnWareHouse().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switchPanel(warehousePanel);
            }
        });
    }

    public void btnVoucher() {
        this.view.getBtnVoucher().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switchPanel(voucherPanel);
            }
        });
    }

    public void btnSupplier() {
        this.view.getBtnSupplier().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switchPanel(supplierPanel);
            }
        });
    }
    
    public void btnStaff() {
        this.view.getBtnStaff().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switchPanel(staffPanel);
            }
        });
    }

    public void btnImport() {
        this.view.getBtnImport().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switchPanel(importPanel);
            }
        });
    }

    public void btnExport() {
        this.view.getBtnExport().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switchPanel(exportPanel);
            }
        });
    }

    public void switchPanel(JPanel panel) {
        List<JPanel> list = new ArrayList<>() {
            {
                add(dashBoardPanel);
                add(productPanel);
                add(categoryPanel);
                add(warehousePanel);
                add(voucherPanel);
                add(supplierPanel);
                add(staffPanel);
                add(importPanel);
                add(exportPanel);
            }
        };
        list.forEach(item -> {
            item.setVisible(false);
        });
        this.view.getPanelRender().add(panel);
        panel.setVisible(true);
    }
}
