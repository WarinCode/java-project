/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.java.project.pages;
import javax.swing.*;
import com.mycompany.java.project.classes.User;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.classes.utils.Validator;
import com.mycompany.java.project.interfaces.PageHandling;
import com.mycompany.java.project.interfaces.GetUser;
import com.mycompany.java.project.db.Database;
import static com.mycompany.java.project.classes.utils.Helper.getString;
import static com.mycompany.java.project.classes.utils.Helper.getSingleQuotes;


import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class Usersetting extends javax.swing.JFrame implements PageHandling, GetUser{

    /**
     * Creates new form Usersetting
     */
    public Usersetting(User user) {
        this.user = user;
        initComponents();
        this.setTitle("User settings");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setResizable(false);

        this.UserUsernameField.setText(this.user.getUsername());
        this.UserEmailField.setText(this.user.getEmail());
        this.jPasswordField1.setText(this.user.getPassword());
        this.UserGenderField.setText(this.user.getGender());
        this.UserAvatarField.setText(this.user.getAvatar());
        this.UserAgeField.setText(Integer.toString(this.user.getAge()));

        this.display();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UserLable0 = new javax.swing.JLabel();
        UserField = new javax.swing.JPanel();
        UserUsernameField = new javax.swing.JTextField();
        EmailField = new javax.swing.JPanel();
        UserEmailField = new javax.swing.JTextField();
        AvatarField = new javax.swing.JPanel();
        UserAvatarField = new javax.swing.JTextField();
        SettingCloseData = new javax.swing.JButton();
        UserLable4 = new javax.swing.JLabel();
        UserLabel1 = new javax.swing.JLabel();
        UserLable2 = new javax.swing.JLabel();
        UserLable3 = new javax.swing.JLabel();
        GenderField = new javax.swing.JPanel();
        UserGenderField = new javax.swing.JTextField();
        UserLable5 = new javax.swing.JLabel();
        AgeField = new javax.swing.JPanel();
        UserAgeField = new javax.swing.JTextField();
        UserLable6 = new javax.swing.JLabel();
        SettingUpdateData = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(350, 530));
        setSize(new java.awt.Dimension(350, 530));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        UserLable0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UserLable0.setForeground(new java.awt.Color(255, 255, 255));
        UserLable0.setText("             User settings");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserLable0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UserLable0, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        UserField.setBackground(new java.awt.Color(204, 204, 204));

        UserUsernameField.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout UserFieldLayout = new javax.swing.GroupLayout(UserField);
        UserField.setLayout(UserFieldLayout);
        UserFieldLayout.setHorizontalGroup(
            UserFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserUsernameField)
        );
        UserFieldLayout.setVerticalGroup(
            UserFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserUsernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        EmailField.setBackground(new java.awt.Color(204, 204, 204));

        UserEmailField.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout EmailFieldLayout = new javax.swing.GroupLayout(EmailField);
        EmailField.setLayout(EmailFieldLayout);
        EmailFieldLayout.setHorizontalGroup(
            EmailFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserEmailField, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
        );
        EmailFieldLayout.setVerticalGroup(
            EmailFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserEmailField, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        AvatarField.setBackground(new java.awt.Color(204, 204, 204));

        UserAvatarField.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout AvatarFieldLayout = new javax.swing.GroupLayout(AvatarField);
        AvatarField.setLayout(AvatarFieldLayout);
        AvatarFieldLayout.setHorizontalGroup(
            AvatarFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserAvatarField)
        );
        AvatarFieldLayout.setVerticalGroup(
            AvatarFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserAvatarField, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        SettingCloseData.setBackground(new java.awt.Color(242, 242, 242));
        SettingCloseData.setText("Close");
        SettingCloseData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingCloseDataActionPerformed(evt);
            }
        });

        UserLable4.setText("Avatar:");

        UserLabel1.setText("Username:");

        UserLable2.setText("Email:");

        UserLable3.setText("Password:");

        GenderField.setBackground(new java.awt.Color(204, 204, 204));

        UserGenderField.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout GenderFieldLayout = new javax.swing.GroupLayout(GenderField);
        GenderField.setLayout(GenderFieldLayout);
        GenderFieldLayout.setHorizontalGroup(
            GenderFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserGenderField)
        );
        GenderFieldLayout.setVerticalGroup(
            GenderFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserGenderField, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        UserLable5.setText("Gender :");

        AgeField.setBackground(new java.awt.Color(204, 204, 204));

        UserAgeField.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout AgeFieldLayout = new javax.swing.GroupLayout(AgeField);
        AgeField.setLayout(AgeFieldLayout);
        AgeFieldLayout.setHorizontalGroup(
            AgeFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserAgeField, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
        );
        AgeFieldLayout.setVerticalGroup(
            AgeFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserAgeField, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        UserLable6.setText("Age:");

        SettingUpdateData.setBackground(new java.awt.Color(0, 0, 0));
        SettingUpdateData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SettingUpdateData.setForeground(new java.awt.Color(255, 255, 255));
        SettingUpdateData.setText("Update data");
        SettingUpdateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingUpdateDataActionPerformed(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserLable2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserLable3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EmailField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordField1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserLable4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(UserLable5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UserLable6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(AvatarField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UserField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GenderField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(SettingUpdateData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                .addComponent(SettingCloseData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserLable2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserLable3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AvatarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserLable4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UserLable5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GenderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(UserLable6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(SettingUpdateData, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SettingCloseData, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SettingCloseDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingCloseDataActionPerformed
        // TODO add your handling code here:
        this.destroy();
    }//GEN-LAST:event_SettingCloseDataActionPerformed

    private void SettingUpdateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingUpdateDataActionPerformed
        // TODO add your handling code here:
        User user = null;
        try {

            user = new User()
                    .setUserId(this.getUserId())
                    .setUsername(this.getUsername())
                    .setPassword(this.getPassword())
                    .setEmail(this.getEmail())
                    .setAge(this.getAge())
                    .setAvatar(this.getAvatar())
                    .setGender(this.getGender())
                    .getInstance();

            if(Validator.isDuplicateUser(user.getUserId(), user.getUsername(), user.getEmail())){
                throw new SQLException("An error occurred. This user is already in use!");
            }
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Please enter your age field.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } catch(SQLException | JBookException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        System.out.println(user);

        try {
            Database db = new Database();
            String query = "UPDATE users SET username = " + getSingleQuotes(user.getUsername()) + ", password = " + getSingleQuotes(user.getPassword()) +
                    ", email = " + getSingleQuotes(user.getEmail()) + ", gender = " + getSingleQuotes(user.getGender()) +
                    ", avatar = " + getSingleQuotes(user.getAvatar()) + ", age = " + user.getAge() +
                    " WHERE user_id = " + user.getUserId();
            int result = db.update(query);
            if(result == 1){
                JOptionPane.showMessageDialog(this, "Updated user settings", "Success", JOptionPane.INFORMATION_MESSAGE);
                this.destroy();
                this.user = user;
                return;
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SettingUpdateDataActionPerformed


    private User user = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgeField;
    private javax.swing.JPanel AvatarField;
    private javax.swing.JPanel EmailField;
    private javax.swing.JPanel GenderField;
    private javax.swing.JButton SettingCloseData;
    private javax.swing.JButton SettingUpdateData;
    private javax.swing.JTextField UserAgeField;
    private javax.swing.JTextField UserAvatarField;
    private javax.swing.JTextField UserEmailField;
    private javax.swing.JPanel UserField;
    private javax.swing.JTextField UserGenderField;
    private javax.swing.JLabel UserLabel1;
    private javax.swing.JLabel UserLable0;
    private javax.swing.JLabel UserLable2;
    private javax.swing.JLabel UserLable3;
    private javax.swing.JLabel UserLable4;
    private javax.swing.JLabel UserLable5;
    private javax.swing.JLabel UserLable6;
    private javax.swing.JTextField UserUsernameField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables


    @Override
    public String getUsername() {
        return this.UserUsernameField.getText();
    }

    @Override
    public int getUserId() {
        return this.user.getUserId();
    }

    @Override
    public String getPassword() {
        return getString(this.jPasswordField1.getPassword());
    }

    @Override
    public String getEmail() {
        return this.UserEmailField.getText();
    }

    @Override
    public String getGender() {
        return this.UserGenderField.getText() == null ? null : this.UserGenderField.getText();
    }

    @Override
    public String getAvatar() {
        return this.UserAvatarField.getText() == null ? null : this.UserAvatarField.getText();
    }

    @Override
    public int getAge() throws NumberFormatException {
        return Integer.parseInt(this.UserAgeField.getText().isEmpty() ? "0" : this.UserAgeField.getText());
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
