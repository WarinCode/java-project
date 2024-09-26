package com.mycompany.java.project.pages;
import com.mycompany.java.project.classes.User;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.interfaces.SetUser;
import com.mycompany.java.project.interfaces.GetUser;
import com.mycompany.java.project.interfaces.PageHandling;

public class Usersetting extends javax.swing.JFrame implements PageHandling, GetUser, SetUser{
    public Usersetting() {
        initComponents();
        this.setTitle("User settings");
//        this.setResizable(false);
        this.display();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UserLable0 = new javax.swing.JLabel();
        UserField = new javax.swing.JPanel();
        UserUsernameField = new javax.swing.JTextField();
        EmailField = new javax.swing.JPanel();
        UserEmailField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPanel();
        UserPasswordField = new javax.swing.JTextField();
        AvatarField = new javax.swing.JPanel();
        UserAvatarField = new javax.swing.JTextField();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(300, 470));
        setSize(new java.awt.Dimension(300, 470));

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UserLable0, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        UserField.setBackground(new java.awt.Color(204, 204, 204));

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

        PasswordField.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout PasswordFieldLayout = new javax.swing.GroupLayout(PasswordField);
        PasswordField.setLayout(PasswordFieldLayout);
        PasswordFieldLayout.setHorizontalGroup(
            PasswordFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
        );
        PasswordFieldLayout.setVerticalGroup(
            PasswordFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        AvatarField.setBackground(new java.awt.Color(204, 204, 204));

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

        UserLable4.setText("Avatar:");

        UserLabel1.setText("Username:");

        UserLable2.setText("Email:");

        UserLable3.setText("Password:");

        GenderField.setBackground(new java.awt.Color(204, 204, 204));

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

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Close");

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
                            .addComponent(UserLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserLable4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(UserLable5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UserLable6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AvatarField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UserField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GenderField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserLable2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserLable3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmailField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserLable2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserLable3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AvatarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserLable4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UserLable5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GenderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(UserLable6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        Usersetting usersetting = new Usersetting();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgeField;
    private javax.swing.JPanel AvatarField;
    private javax.swing.JPanel EmailField;
    private javax.swing.JPanel GenderField;
    private javax.swing.JPanel PasswordField;
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
    private javax.swing.JTextField UserPasswordField;
    private javax.swing.JTextField UserUsernameField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;

    @Override
    public String getUsername() {
        return "";
    }

    @Override
    public int getUserId() {
        return 0;
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getEmail() {
        return "";
    }

    @Override
    public String getGender() {
        return "";
    }

    @Override
    public void display() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public User setUserId(int userId) throws JBookException {
        return null;
    }

    @Override
    public User setUsername(String username) throws JBookException {
        return null;
    }

    @Override
    public User setPassword(String password) throws JBookException {
        return null;
    }

    @Override
    public User setEmail(String email) throws JBookException {
        return null;
    }

    @Override
    public User setGender(String gender) throws JBookException {
        return null;
    }
    // End of variables declaration//GEN-END:variables
}
