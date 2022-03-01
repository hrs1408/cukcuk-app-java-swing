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
import tokyo.huyhieu.cukcuk.view.panel.DashBoardPanel;
import tokyo.huyhieu.cukcuk.view.panel.ProductPanel;

/**
 *
 * @author huyhi
 */
public class AdminController {

    private AdminFrame view;
    ProductPanel productPanel = new ProductPanel();
    DashBoardPanel dashBoardPanel = new DashBoardPanel();

    public AdminController(AdminFrame view) {
        this.view = view;
        this.view.setVisible(true);
        this.view.add(productPanel);
        this.view.add(dashBoardPanel);
        listener();
    }

    public void listener() {
        btnDashBoard();
        btnProduct();
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

    public void switchPanel(JPanel panel) {
        List<JPanel> list = new ArrayList<>() {
            {
                add(dashBoardPanel);
                add(productPanel);
            }
        };
        list.forEach(item -> {
            item.setVisible(false);
        });
        this.view.getPanelRender().add(panel);
        panel.setVisible(true);
    }
}
