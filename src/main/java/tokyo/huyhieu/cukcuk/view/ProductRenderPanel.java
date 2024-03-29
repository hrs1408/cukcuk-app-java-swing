/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tokyo.huyhieu.cukcuk.view;


import javax.swing.JLabel;
import tokyo.huyhieu.cukcuk.model.Product;

/**
 *
 * @author huyhi
 */
public class ProductRenderPanel extends javax.swing.JPanel {
    private Product prd;

    /**
     * Creates new form ProductRenderPanel
     */
    public ProductRenderPanel() {
        initComponents();
    }

    public JLabel getLblImage() {
        return lblImage;
    }

    public JLabel getLblPrice() {
        return lblPrice;
    }

    public JLabel getLblProductName() {
        return lblProductName;
    }

    public Product getPrd() {
        return prd;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImage = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        lblImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImageMousePressed(evt);
            }
        });

        lblProductName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblProductName.setForeground(new java.awt.Color(0, 114, 188));
        lblProductName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProductName.setText("Chocomint");

        lblPrice.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(0, 114, 188));
        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrice.setText("32000.0VNĐ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblImageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImageMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProductName;
    // End of variables declaration//GEN-END:variables
}
