/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package tokyo.huyhieu.cukcuk.view.dialog;

import com.k33ptoo.components.KGradientPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import tokyo.huyhieu.cukcuk.controller.SupplierController;
import tokyo.huyhieu.cukcuk.model.Supplier;
import tokyo.huyhieu.cukcuk.view.panel.SupplierPanel;

/**
 *
 * @author huyhi
 */
public class SupplierDialog extends javax.swing.JDialog {
    SupplierController supplierController = new SupplierController(new SupplierPanel());
    private String action;
    private Supplier supplier;

    /**
     * /**
     * Creates new form ProductDialog
     */
    public SupplierDialog(String action, Supplier supplier) {
        this.action = action;
        this.supplier = supplier;
        initComponents();
        setLocationRelativeTo(null);
        if (action == "add") {
            lblTitle.setText("Thêm nhà cung cấp");
            btnSave.setText("Lưu");
        } else if (action == "edit") {
            lblTitle.setText("Sửa nhà cung cấp");
            btnSave.setText("Sửa");
        }
    }
    
    public SupplierDialog(String action) {
        this.action = action;
        initComponents();
        setLocationRelativeTo(null);
        if (action == "add") {
            lblTitle.setText("Thêm nhà cung cấp");
            btnSave.setText("Lưu");
        } else if (action == "edit") {
            lblTitle.setText("Sửa nhà cung cấp");
            btnSave.setText("Sửa");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        lblName = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));

        lblName.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 114, 188));
        lblName.setText("Tên nhà cung cấp");

        lblPhone.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(0, 114, 188));
        lblPhone.setText("Số điện thoại");

        lblAddress.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(0, 114, 188));
        lblAddress.setText("Địa chỉ");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        btnSave.setForeground(new java.awt.Color(0, 114, 188));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokyo/huyhieu/cukcuk/image/icons8_save_26px.png"))); // NOI18N
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setForeground(new java.awt.Color(0, 114, 188));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokyo/huyhieu/cukcuk/image/icons8_cancel_26px.png"))); // NOI18N
        btnCancel.setText("Huỷ bỏ");

        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 114, 188));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokyo/huyhieu/cukcuk/image/supplier_60px.png"))); // NOI18N
        lblTitle.setText("Nhà cung cấp");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblPhone)
                            .addComponent(lblAddress))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(txtAddress)
                            .addComponent(txtName))
                        .addGap(0, 80, Short.MAX_VALUE)))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (action == "add") {
            supplierController.btnSave(action, this);
        } else if (action == "edit") {
            supplierController.btnSave(action, this, supplier);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public JButton getBtnCancel() {
        return btnCancel;
    }

    public JButton getBtnSave() {
        return btnSave;
    }

    public JTextField getTxtAddress() {
        return txtAddress;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    /**
     * @param args the command line arguments
     */
    public JTextField getTxtPhone() {
        return txtPhone;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
