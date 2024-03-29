/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tokyo.huyhieu.cukcuk.view;

import com.k33ptoo.components.KButton;
import com.k33ptoo.components.KGradientPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author huyhi
 */
public class StaffFrame extends javax.swing.JFrame {

    /**
     * Creates new form StaffFrame
     */
    public StaffFrame() {      
        initComponents();
        setLocationRelativeTo(null);
    }
    

    public JLabel getLblFullName() {
        return lblFullName;
    }

    public KButton getBtnExport() {
        return btnExport;
    }

    public KButton getBtnImport() {
        return btnImport;
    }

    public JLabel getBtnSearch() {
        return btnSearch;
    }

    public JTextField getTxtNameSearch() {
        return txtNameSearch;
    }
    
    

    public KGradientPanel getPanel() {
        return panel;
    }

    public KButton getBtnCheckMoney1() {
        return btnImport;
    }

    public KButton getBtnCheckMoney2() {
        return btnExport;
    }

    public KButton getBtnPay() {
        return btnPay;
    }
    
    

    public KButton getBtnCancel() {
        return btnCancel;
    }

    public KButton getBtnCheckMoney() {
        return btnCheckMoney;
    }

    public KButton getBtnCreateOrderTab() {
        return btnCreateOrderTab;
    }

    public KButton getBtnLogout() {
        return btnLogout;
    }

    public KButton getBtnOrderList() {
        return btnOrderList;
    }

    public KButton getBtnSaveOrder() {
        return btnSaveOrder;
    }

    public JLabel getBtnVoucher() {
        return btnVoucher;
    }

    public JLabel getLblUserName() {
        return lblFullName;
    }

    public KGradientPanel getPanelRenderMenu() {
        return panelRenderMenu;
    }

    public JTable getTblOrder() {
        return tblOrder;
    }

    public JTable getTblVoucher() {
        return tblVoucher;
    }

    public JLabel getLblTotal() {
        return lblTotal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new com.k33ptoo.components.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnSaveOrder = new com.k33ptoo.components.KButton();
        btnPay = new com.k33ptoo.components.KButton();
        btnCancel = new com.k33ptoo.components.KButton();
        btnVoucher = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        txtNameSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        btnCreateOrderTab = new com.k33ptoo.components.KButton();
        btnOrderList = new com.k33ptoo.components.KButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVoucher = new javax.swing.JTable();
        btnCheckMoney = new com.k33ptoo.components.KButton();
        btnLogout = new com.k33ptoo.components.KButton();
        btnImport = new com.k33ptoo.components.KButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        panelRenderMenu = new com.k33ptoo.components.KGradientPanel();
        jButton1 = new javax.swing.JButton();
        btnExport = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1290, 740));
        setResizable(false);

        panel.setkEndColor(new java.awt.Color(255, 255, 255));
        panel.setkStartColor(new java.awt.Color(255, 255, 255));
        panel.setPreferredSize(new java.awt.Dimension(1270, 750));

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tên món", "Số lượng", "Thành tiền"
            }
        ));
        tblOrder.setPreferredSize(new java.awt.Dimension(419, 289));
        jScrollPane1.setViewportView(tblOrder);
        if (tblOrder.getColumnModel().getColumnCount() > 0) {
            tblOrder.getColumnModel().getColumn(1).setMinWidth(70);
            tblOrder.getColumnModel().getColumn(1).setMaxWidth(70);
            tblOrder.getColumnModel().getColumn(2).setResizable(false);
        }

        btnSaveOrder.setText("Lưu hoá đơn");
        btnSaveOrder.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSaveOrder.setkEndColor(new java.awt.Color(0, 114, 188));
        btnSaveOrder.setkStartColor(new java.awt.Color(0, 114, 188));

        btnPay.setText("Thanh toán");
        btnPay.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPay.setkEndColor(new java.awt.Color(0, 114, 188));
        btnPay.setkStartColor(new java.awt.Color(0, 114, 188));

        btnCancel.setText("Huỷ bỏ");
        btnCancel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCancel.setkEndColor(new java.awt.Color(255, 51, 51));
        btnCancel.setkHoverEndColor(new java.awt.Color(255, 0, 51));
        btnCancel.setkHoverForeGround(new java.awt.Color(255, 0, 51));
        btnCancel.setkHoverStartColor(new java.awt.Color(255, 0, 51));
        btnCancel.setkSelectedColor(new java.awt.Color(255, 0, 51));
        btnCancel.setkStartColor(new java.awt.Color(255, 0, 51));

        btnVoucher.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnVoucher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokyo/huyhieu/cukcuk/image/add.png"))); // NOI18N
        btnVoucher.setText("Voucher");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Tổng tiền: ");

        lblTotal.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("0VNĐ");

        kGradientPanel2.setkBorderRadius(15);
        kGradientPanel2.setkEndColor(new java.awt.Color(0, 114, 188));
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 114, 188));

        txtNameSearch.setBackground(new java.awt.Color(0, 114, 188));
        txtNameSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtNameSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokyo/huyhieu/cukcuk/image/icons8_search_24px_1.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txtNameSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSearch)
                    .addComponent(txtNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokyo/huyhieu/cukcuk/image/LOGOCUKCUKJ.png"))); // NOI18N

        lblFullName.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblFullName.setForeground(new java.awt.Color(0, 114, 188));
        lblFullName.setText("Nguyễn Phan Huy Hiếu");

        btnCreateOrderTab.setBorder(null);
        btnCreateOrderTab.setText("ORDER");
        btnCreateOrderTab.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCreateOrderTab.setkEndColor(new java.awt.Color(0, 114, 188));
        btnCreateOrderTab.setkStartColor(new java.awt.Color(0, 114, 188));

        btnOrderList.setBorder(null);
        btnOrderList.setText("HOÁ ĐƠN");
        btnOrderList.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnOrderList.setkEndColor(new java.awt.Color(0, 114, 188));
        btnOrderList.setkStartColor(new java.awt.Color(0, 114, 188));
        btnOrderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderListActionPerformed(evt);
            }
        });

        tblVoucher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Voucher", "Giảm %"
            }
        ));
        jScrollPane2.setViewportView(tblVoucher);

        btnCheckMoney.setBorder(null);
        btnCheckMoney.setText("KIỂM TIỀN");
        btnCheckMoney.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCheckMoney.setkEndColor(new java.awt.Color(0, 114, 188));
        btnCheckMoney.setkStartColor(new java.awt.Color(0, 114, 188));

        btnLogout.setText("Đăng xuất");
        btnLogout.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnLogout.setkEndColor(new java.awt.Color(0, 114, 188));
        btnLogout.setkHoverEndColor(new java.awt.Color(0, 114, 188));
        btnLogout.setkHoverForeGround(new java.awt.Color(0, 114, 188));
        btnLogout.setkHoverStartColor(new java.awt.Color(0, 114, 188));
        btnLogout.setkSelectedColor(new java.awt.Color(0, 114, 188));
        btnLogout.setkStartColor(new java.awt.Color(0, 114, 188));

        btnImport.setBorder(null);
        btnImport.setText("NHẬP KHO");
        btnImport.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnImport.setkEndColor(new java.awt.Color(0, 114, 188));
        btnImport.setkStartColor(new java.awt.Color(0, 114, 188));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelRenderMenu.setkEndColor(new java.awt.Color(255, 255, 255));
        panelRenderMenu.setkStartColor(new java.awt.Color(255, 255, 255));
        panelRenderMenu.setPreferredSize(new java.awt.Dimension(813, 1000));
        jScrollPane3.setViewportView(panelRenderMenu);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokyo/huyhieu/cukcuk/image/icons8_sync_24px.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(45, 45));

        btnExport.setBorder(null);
        btnExport.setText("XUẤT KHO");
        btnExport.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnExport.setkEndColor(new java.awt.Color(0, 114, 188));
        btnExport.setkStartColor(new java.awt.Color(0, 114, 188));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(btnCreateOrderTab, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOrderList, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCheckMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(btnVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(panelLayout.createSequentialGroup()
                                            .addComponent(btnSaveOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 8, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFullName)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCreateOrderTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnOrderList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCheckMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVoucher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(lblTotal))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSaveOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrderListActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnCancel;
    private com.k33ptoo.components.KButton btnCheckMoney;
    private com.k33ptoo.components.KButton btnCreateOrderTab;
    private com.k33ptoo.components.KButton btnExport;
    private com.k33ptoo.components.KButton btnImport;
    private com.k33ptoo.components.KButton btnLogout;
    private com.k33ptoo.components.KButton btnOrderList;
    private com.k33ptoo.components.KButton btnPay;
    private com.k33ptoo.components.KButton btnSaveOrder;
    private javax.swing.JLabel btnSearch;
    private javax.swing.JLabel btnVoucher;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblTotal;
    private com.k33ptoo.components.KGradientPanel panel;
    private com.k33ptoo.components.KGradientPanel panelRenderMenu;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblVoucher;
    private javax.swing.JTextField txtNameSearch;
    // End of variables declaration//GEN-END:variables
}
