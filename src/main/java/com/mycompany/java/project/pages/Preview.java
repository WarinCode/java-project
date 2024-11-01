package com.mycompany.java.project.pages;
import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import com.mycompany.java.project.classes.utils.Validator;
import com.mycompany.java.project.interfaces.PageHandling;
import com.mycompany.java.project.interfaces.ImageConstants;
import com.mycompany.java.project.interfaces.Callback;
import com.mycompany.java.project.interfaces.InstanceProvider;
import com.mycompany.java.project.classes.Book;
import com.mycompany.java.project.db.controllers.BookController;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import static com.mycompany.java.project.classes.utils.Helper.getSingleQuotes;

public class Preview extends javax.swing.JDialog implements PageHandling, InstanceProvider<Preview> {
    public Preview(Book book, Callback callback) {
        super(JOptionPane.getRootFrame(), true);
        this.book = book;
        this.callback = callback;

        initComponents();
        this.setTitle(this.book.getBookName());
        this.setLocationRelativeTo(null);
        ImageConstants.addImage(this.book.getImageUrl(), this.bookImage, ImageConstants.DEFAULT_IMAGE_NOT_AVALIBLE);

        this.jLabel2.setText("Bookname: " + this.book.getBookName());
        this.jLabel3.setText("ISBN: " + this.book.getIsbn());
        this.jLabel4.setText("Price: " + this.book.getPrice());
        this.jLabel5.setText("Remain: " + this.book.getRemain());
        this.jLabel6.setText("Author: " + (this.book.getAuthorName() == null ? "-" : book.getAuthorName()));
        this.display();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookImage = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        bookImage.setBackground(new java.awt.Color(174, 174, 174));
        bookImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        bookImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookImage.setPreferredSize(new java.awt.Dimension(218, 130));

        javax.swing.GroupLayout bookImageLayout = new javax.swing.GroupLayout(bookImage);
        bookImage.setLayout(bookImageLayout);
        bookImageLayout.setHorizontalGroup(
            bookImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        bookImageLayout.setVerticalGroup(
            bookImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Preview Book");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(196, 196, 196))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel2.setText("Bookname:");

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel3.setText("ISBN:");

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel4.setText("Price:");

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel5.setText("Remain:");

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel6.setText("Author:");

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

        closeButton.setBackground(new java.awt.Color(217, 217, 217));
        closeButton.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        closeButton.setText("Close");
        closeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 0, 0));
        deleteButton.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
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
                        .addGap(36, 36, 36)
                        .addComponent(bookImage, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bookImage, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        this.destroy();
        EditBook editBook = new EditBook(this.book, this.callback);
    }//GEN-LAST:event_editButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.destroy();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int result = JOptionPane.showConfirmDialog(this.getInstance(), "Are you sure you want to delete this book?", "Delete this book", JOptionPane.YES_NO_OPTION);
        if(result == 1){
            return;
        }

        try {
            BookController bookController = new BookController();
            String query = "DELETE FROM books WHERE book_id = " + this.book.getBookId();
//            System.out.println(query);
            bookController.delete(query);

            if(bookController.isChanged){
                if(this.callback != null){
                    this.callback.run();
                }
                JOptionPane.showMessageDialog(this.getInstance(), "Deleted book successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                this.destroy();
                return;
            }

            throw new SQLException("An error occurred. This book was not found in the database!");
        } catch(SQLException e){
            JOptionPane.showMessageDialog(this.getInstance(), e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    public static void showPreview(int index, Book book, ArrayList<Book> books, Callback callback){
        if(books.get(index).equals(book)){
            Preview preview = new Preview(book.getInstance(), callback);
        } else {
            try {
                BookController bookController = new BookController();
                books.set(index, bookController.getBook("SELECT * FROM books WHERE book_id = " + book.getBookId() + " LIMIT 1"));
                book = books.get(index);
            } catch(SQLException | JBookException e) {
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Preview preview = new Preview(book.getInstance(), callback);
        }
    }

    @Override
    public void display(){
        this.setVisible(true);
    }

    @Override
    public void destroy(){
        this.dispose();
    }

    @Override
    public Preview getInstance(){
        return this;
    }

    private Book book = null;
    private Callback callback = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bookImage;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
