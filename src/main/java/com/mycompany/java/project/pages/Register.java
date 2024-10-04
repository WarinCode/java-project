package com.mycompany.java.project.pages;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.interfaces.PageHandling;
import com.mycompany.java.project.interfaces.ResetForm;
import com.mycompany.java.project.interfaces.GetUser;
import com.mycompany.java.project.db.Database;
import com.mycompany.java.project.db.Registration;
import com.mycompany.java.project.classes.User;
import com.mycompany.java.project.classes.utils.Helper;

public class Register extends javax.swing.JFrame implements PageHandling, GetUser, ResetForm {

    public Register() {
        initComponents();
        this.setTitle("Register page");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.reset();
        this.display();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        RegisterUsername = new javax.swing.JLabel();
        RegisterUsernameField = new javax.swing.JTextField();
        RegisterBackToLoginButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        RegisterLoginButton = new javax.swing.JButton();
        RegisterPossword = new javax.swing.JLabel();
        RegisterEmail = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setSize(new java.awt.Dimension(432, 313));

        RegisterUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegisterUsername.setText("Username:");

        RegisterUsernameField.setBackground(new java.awt.Color(183, 183, 183));
        RegisterUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterUsernameFieldActionPerformed(evt);
            }
        });

        RegisterBackToLoginButton.setBackground(new java.awt.Color(217, 217, 217));
        RegisterBackToLoginButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RegisterBackToLoginButton.setText("Back to Login page");
        RegisterBackToLoginButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        RegisterBackToLoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterBackToLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBackToLoginButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(27, 26, 26));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Create your account");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        RegisterLoginButton.setBackground(new java.awt.Color(0, 0, 0));
        RegisterLoginButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RegisterLoginButton.setForeground(new java.awt.Color(255, 255, 255));
        RegisterLoginButton.setText("Register");
        RegisterLoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterLoginButtonActionPerformed(evt);
            }
        });

        RegisterPossword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegisterPossword.setText("Password:");

        RegisterEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegisterEmail.setText("Email:");

        jTextField1.setBackground(new java.awt.Color(183, 183, 183));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(183, 183, 183));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegisterUsername)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(RegisterEmail)
                        .addComponent(RegisterPossword)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RegisterUsernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jPasswordField1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegisterBackToLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegisterLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(RegisterUsername))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(RegisterUsernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegisterEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegisterPossword))
                .addGap(18, 18, 18)
                .addComponent(RegisterLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegisterBackToLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }

    private void RegisterUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void RegisterLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Database db = new Database();
            User user = new User(this.getUsername(), this.getPassword(), this.getEmail());
            System.out.println(user);
            Registration.createUser(user);

            if(Registration.isAccountCreated){
                JOptionPane.showMessageDialog(this, "Account created successfully, return to login page.", "Success", JOptionPane.INFORMATION_MESSAGE);
                this.reset();
                this.destroy();
                Login login = new Login();
                return;
            }

            throw new JBookException("Something went wrong!");
        } catch(SQLException | JBookException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            this.reset();
        }
    }

    private void RegisterBackToLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.destroy();
        Login login = new Login();
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {}

    @Override
    public String getUsername() {
        return this.RegisterUsernameField.getText();
    }

    @Override
    public int getUserId() {
        return 0;
    }

    @Override
    public String getPassword() {
        return Helper.getString(this.jPasswordField1.getPassword());
    }

    @Override
    public String getEmail() {
        return this.jTextField1.getText();
    }

    @Override
    public String getGender() {
        return null;
    }

    @Override
    public String getAvatar() {
        return null;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public void display() {
        this.setVisible(true);
    }

    @Override
    public void destroy() {
        this.dispose();
    }

    @Override
    public void reset(){
        this.RegisterUsernameField.setText("");
        this.jPasswordField1.setText("");
        this.jTextField1.setText("");
        this.RegisterUsernameField.grabFocus();
    }

    private javax.swing.JButton RegisterBackToLoginButton;
    private javax.swing.JLabel RegisterEmail;
    private javax.swing.JButton RegisterLoginButton;
    private javax.swing.JLabel RegisterPossword;
    private javax.swing.JLabel RegisterUsername;
    private javax.swing.JTextField RegisterUsernameField;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
}