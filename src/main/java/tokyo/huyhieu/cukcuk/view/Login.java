/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tokyo.huyhieu.cukcuk.view;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author huyhi
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnLogin = new com.k33ptoo.components.KButton();
        lblForgotPassword = new javax.swing.JLabel();
        lblSupport = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        logoMisa = new javax.swing.JLabel();
        slogan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        kGradientPanel1.setkBorderRadius(20);
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokyo/huyhieu/cukcuk/image/banner-login-cukcuk1.jpg"))); // NOI18N

        txtUsername.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 114, 188));
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 114, 188)));

        txtPassword.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 114, 188));
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 114, 188)));

        lblUserName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokyo/huyhieu/cukcuk/image/icons8_user_32px.png"))); // NOI18N

        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokyo/huyhieu/cukcuk/image/icons8_password_32px.png"))); // NOI18N

        btnLogin.setBorder(null);
        btnLogin.setText("Đăng nhập");
        btnLogin.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnLogin.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        btnLogin.setkBorderRadius(20);
        btnLogin.setkEndColor(new java.awt.Color(0, 114, 188));
        btnLogin.setkHoverEndColor(new java.awt.Color(0, 114, 188));
        btnLogin.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnLogin.setkHoverStartColor(new java.awt.Color(0, 114, 188));
        btnLogin.setkSelectedColor(new java.awt.Color(0, 114, 188));
        btnLogin.setkStartColor(new java.awt.Color(0, 114, 188));

        lblForgotPassword.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblForgotPassword.setForeground(new java.awt.Color(0, 114, 188));
        lblForgotPassword.setText("Quên mật khẩu?");

        lblSupport.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblSupport.setForeground(new java.awt.Color(0, 114, 188));
        lblSupport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokyo/huyhieu/cukcuk/image/icons8_technical_support_24px_1.png"))); // NOI18N
        lblSupport.setText("Tổng đài: 1900 8677");

        lblEmail.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 114, 188));
        lblEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokyo/huyhieu/cukcuk/image/icons8_circled_envelope_24px.png"))); // NOI18N
        lblEmail.setText("Email: support@misa");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        logoMisa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoMisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokyo/huyhieu/cukcuk/image/Logo_MISA.svg.png"))); // NOI18N

        slogan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        slogan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slogan.setText("Đăng nhập để làm việc với MISA CukCuk");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoMisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(slogan, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPassword)
                                    .addComponent(lblUserName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblForgotPassword)
                                        .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(lblSupport, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEmail)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(logoMisa, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(slogan)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblForgotPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSupport))
                .addGap(64, 64, 64))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnLogin;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblForgotPassword;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSupport;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel logoMisa;
    private javax.swing.JLabel slogan;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
