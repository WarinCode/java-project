package com.mycompany.java.project.pages;
import javax.swing.*;
import java.util.ArrayList;
import java.sql.SQLException;
import com.mycompany.java.project.classes.Book;
import com.mycompany.java.project.interfaces.PageHandling;
import com.mycompany.java.project.interfaces.Callback;
import com.mycompany.java.project.interfaces.GetBook;
import com.mycompany.java.project.interfaces.ResetForm;
import com.mycompany.java.project.interfaces.InstanceProvider;
import com.mycompany.java.project.interfaces.Callback;
import com.mycompany.java.project.classes.utils.Validator;
import static com.mycompany.java.project.classes.utils.Helper.getSingleQuotes;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.db.Database;

public class EditBook extends javax.swing.JFrame implements PageHandling, GetBook, ResetForm, InstanceProvider<EditBook> {
    public EditBook(ArrayList<Book> books, Callback callback) {
        this.books = books;
        this.callback = callback;
        Search search = new Search(books, callback);
    }

    public EditBook(Book book, Callback callback) {
        this.book = book;
        this.callback = callback;

        initComponents();
        this.setLocationRelativeTo(null);
        this.reset();
        this.display();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        GenderField = new javax.swing.JPanel();
        UserField = new javax.swing.JPanel();
        PasswordField = new javax.swing.JPanel();
        AvatarField = new javax.swing.JPanel();
        PasswordField1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        isbn = new javax.swing.JTextField();
        imageUrl = new javax.swing.JTextField();
        remain = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        bookName = new javax.swing.JTextField();
        closeButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        authorName = new javax.swing.JTextField();

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel5.setText("Price:");

        jTextField3.setBackground(new java.awt.Color(183, 183, 183));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField6.setBackground(new java.awt.Color(183, 183, 183));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit book page");
        setResizable(false);
        setSize(new java.awt.Dimension(300, 470));

        GenderField.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout GenderFieldLayout = new javax.swing.GroupLayout(GenderField);
        GenderField.setLayout(GenderFieldLayout);
        GenderFieldLayout.setHorizontalGroup(
            GenderFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        GenderFieldLayout.setVerticalGroup(
            GenderFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        UserField.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout UserFieldLayout = new javax.swing.GroupLayout(UserField);
        UserField.setLayout(UserFieldLayout);
        UserFieldLayout.setHorizontalGroup(
            UserFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        UserFieldLayout.setVerticalGroup(
            UserFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        PasswordField.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout PasswordFieldLayout = new javax.swing.GroupLayout(PasswordField);
        PasswordField.setLayout(PasswordFieldLayout);
        PasswordFieldLayout.setHorizontalGroup(
            PasswordFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PasswordFieldLayout.setVerticalGroup(
            PasswordFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        AvatarField.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout AvatarFieldLayout = new javax.swing.GroupLayout(AvatarField);
        AvatarField.setLayout(AvatarFieldLayout);
        AvatarFieldLayout.setHorizontalGroup(
            AvatarFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        AvatarFieldLayout.setVerticalGroup(
            AvatarFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        PasswordField1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout PasswordField1Layout = new javax.swing.GroupLayout(PasswordField1);
        PasswordField1.setLayout(PasswordField1Layout);
        PasswordField1Layout.setHorizontalGroup(
            PasswordField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PasswordField1Layout.setVerticalGroup(
            PasswordField1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(27, 26, 26));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit Book");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel2.setText("ISBN:");

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel3.setText("Bookname:");

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel4.setText("Price:");

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel6.setText("Image Url:");

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel7.setText("Remain:");

        isbn.setBackground(new java.awt.Color(183, 183, 183));

        imageUrl.setBackground(new java.awt.Color(183, 183, 183));
        imageUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageUrlActionPerformed(evt);
            }
        });

        remain.setBackground(new java.awt.Color(183, 183, 183));
        remain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remainActionPerformed(evt);
            }
        });

        price.setBackground(new java.awt.Color(183, 183, 183));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        bookName.setBackground(new java.awt.Color(183, 183, 183));
        bookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNameActionPerformed(evt);
            }
        });

        closeButton.setBackground(new java.awt.Color(217, 217, 217));
        closeButton.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        closeButton.setText("Close");
        closeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(245, 158, 17));
        editButton.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Edit");
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel8.setText("Author:");

        authorName.setBackground(new java.awt.Color(183, 183, 183));
        authorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(57, 57, 57)))
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(imageUrl)
                    .addComponent(isbn)
                    .addComponent(remain)
                    .addComponent(bookName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(authorName))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(318, 318, 318)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(AvatarField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UserField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GenderField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bookName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(imageUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(remain, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(UserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(80, 80, 80)
                    .addComponent(AvatarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(GenderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(307, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imageUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageUrlActionPerformed
    }//GEN-LAST:event_imageUrlActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void remainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remainActionPerformed

    }//GEN-LAST:event_remainActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed

    }//GEN-LAST:event_priceActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed

    }//GEN-LAST:event_jTextField6ActionPerformed

    private void bookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNameActionPerformed

    }//GEN-LAST:event_bookNameActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.destroy();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        Book book = null;

        try {
            book = new Book();
            book.setBookName(this.getBookName())
                    .setBookId(this.getBookId())
                    .setPrice(this.getPrice())
                    .setIsbn(this.getIsbn())
                    .setAuthorName(this.getAuthorName())
                    .setRemain(this.getRemain())
                    .setImageUrl(this.getImageUrl());

            if(Validator.isExistsBook(book)){
                throw new SQLException("An error occurred. This book already exists in the database!");
            }
        } catch(SQLException | JBookException | NumberFormatException e){
            JOptionPane.showMessageDialog(this.getInstance(), e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            this.reset();
            return;
        }

        try {
            Database db = new Database();
            String query = "UPDATE books SET book_name = " + getSingleQuotes(book.getBookName())
                    + ", price = " + book.getPrice()
                    + ", isbn = " + getSingleQuotes(book.getIsbn())
                    + ", author_name = " + (book.getAuthorName() == null ? "DEFAULT(author_name)" : getSingleQuotes(book.getAuthorName()))
                    + ", image_url = " + getSingleQuotes(book.getImageUrl())
                    + ", remain = " + book.getRemain()
                    + " WHERE book_id = " + book.getBookId();
//             System.out.println(query);
            db.update(query);

            if(db.isChanged){
                if(this.callback != null){
                    this.callback.run();
                }
                JOptionPane.showMessageDialog(this.getInstance(), "Book updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                this.destroy();
                return;
            }

            throw new SQLException("Something went wrong!");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(this.getInstance(), e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            this.reset();
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void authorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorNameActionPerformed

    }//GEN-LAST:event_authorNameActionPerformed

    @Override
    public void display() {
        this.setVisible(true);
    }

    @Override
    public void destroy() {
        this.dispose();
    }

    @Override
    public int getBookId() {
        return this.book.getBookId();
    }

    @Override
    public String getBookName() {
        return this.bookName.getText();
    }

    @Override
    public String getAuthorName() {
        return Validator.isEmptyField(this.authorName) ? null : this.authorName.getText();
    }

    @Override
    public double getPrice() throws NumberFormatException {
        return Double.parseDouble(this.price.getText());
    }

    @Override
    public String getIsbn() {
        return this.isbn.getText();
    }

    @Override
    public String getImageUrl() {
        return this.imageUrl.getText();
    }

    @Override
    public int getRemain() throws NumberFormatException {
        return Integer.parseInt(this.remain.getText());
    }

    @Override
    public EditBook getInstance(){
        return this;
    }

    @Override
    public void reset(){
        this.bookName.setText(this.book.getBookName());
        this.isbn.setText(this.book.getIsbn());
        this.price.setText(Double.toString(this.book.getPrice()));
        this.imageUrl.setText(this.book.getImageUrl());
        this.remain.setText(Integer.toString(this.book.getRemain()));
        this.authorName.setText(this.book.getAuthorName());
        this.bookName.grabFocus();
    }

    private ArrayList<Book> books=  new ArrayList<Book>();
    private Book book = null;
    private Callback callback = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AvatarField;
    private javax.swing.JPanel GenderField;
    private javax.swing.JPanel PasswordField;
    private javax.swing.JPanel PasswordField1;
    private javax.swing.JPanel UserField;
    private javax.swing.JTextField authorName;
    private javax.swing.JTextField bookName;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField imageUrl;
    private javax.swing.JTextField isbn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField price;
    private javax.swing.JTextField remain;
    // End of variables declaration//GEN-END:variables
}
