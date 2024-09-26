package com.mycompany.java.project.pages;
import javax.swing.*;
import java.sql.SQLException;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.db.Database;
import com.mycompany.java.project.db.Authorization;
import com.mycompany.java.project.classes.User;
import com.mycompany.java.project.interfaces.GetUser;
import com.mycompany.java.project.interfaces.PageHandling;
import com.mycompany.java.project.classes.utils.Helper;

public class Login extends javax.swing.JFrame implements PageHandling, GetUser {
    public Login() {
        initComponents();
        this.setTitle("Login page");
        this.setResizable(false);
        this.LoginUsernameField.grabFocus();
        this.display();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LoginUsernameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        LoginPasswordField = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        LoginloginField = new javax.swing.JButton();
        LoginRegisterField = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(217, 217, 217));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Username or Email:");

        LoginUsernameField.setBackground(new java.awt.Color(183, 183, 183));
        LoginUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginUsernameFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Password:");

        LoginPasswordField.setBackground(new java.awt.Color(183, 183, 183));
        LoginPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginPasswordFieldActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Login to JBook");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        LoginloginField.setBackground(new java.awt.Color(0, 0, 0));
        LoginloginField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LoginloginField.setForeground(new java.awt.Color(255, 255, 255));
        LoginloginField.setText("Login");
        LoginloginField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginloginField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginloginFieldActionPerformed(evt);
            }
        });

        LoginRegisterField.setBackground(new java.awt.Color(217, 217, 217));
        LoginRegisterField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LoginRegisterField.setText("Register");
        LoginRegisterField.setBorder(null);
        LoginRegisterField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginRegisterField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginRegisterFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLabel2)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LoginPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(LoginUsernameField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LoginloginField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginRegisterField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addComponent(LoginloginField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginRegisterField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginUsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginUsernameFieldActionPerformed

    private void LoginPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginPasswordFieldActionPerformed

    private void LoginloginFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginloginFieldActionPerformed
        // TODO add your handling code here:
        try {
            Database db = new Database();
            User checkUser = new User(this.getUsername(), this.getPassword());

            if(Authorization.isAuthorized(checkUser)){
                User user = db.getUser("SELECT * FROM users WHERE user_id = " + Authorization.authorizedUserId);
                this.destroy();
                Home home = new Home(user);
                return;
            }

            throw new JBookException("Login failed!");
        } catch(SQLException | JBookException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            this.LoginUsernameField.setText("");
            this.LoginPasswordField.setText("");
            this.LoginUsernameField.grabFocus();
        }
    }//GEN-LAST:event_LoginloginFieldActionPerformed

    private void LoginRegisterFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginRegisterFieldActionPerformed
        // TODO add your handling code here:
        this.destroy();
        Register register = new Register();
    }//GEN-LAST:event_LoginRegisterFieldActionPerformed

    public static void main(String args[]) {
        Login login = new Login();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField LoginPasswordField;
    private javax.swing.JButton LoginRegisterField;
    private javax.swing.JTextField LoginUsernameField;
    private javax.swing.JButton LoginloginField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public String getUsername() {
        return this.LoginUsernameField.getText();
    }

    @Override
    public int getUserId() {
        return 0;
    }

    @Override
    public String getPassword() {
        return Helper.getString(this.LoginPasswordField.getPassword());
    }

    @Override
    public String getEmail() {
        return this.getUsername();
    }

    @Override
    public String getGender() {
        return null;
    }

    @Override
    public void display() {
        this.setVisible(true);
    }

    @Override
    public void destroy() {
        this.dispose();
    }
}
