package com.mycompany.java.project.pages;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.*;
import com.mycompany.java.project.classes.OrderBook;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import static com.mycompany.java.project.classes.utils.Helper.getSingleQuotes;
import com.mycompany.java.project.db.Database;
import com.mycompany.java.project.interfaces.InstanceProvider;
import com.mycompany.java.project.interfaces.PageHandling;
import com.mycompany.java.project.interfaces.Callback;
import com.mycompany.java.project.interfaces.ResetForm;

public class Payment extends javax.swing.JFrame implements PageHandling, InstanceProvider<Payment>, ResetForm {
    public Payment(JList<String> bookList, ArrayList<OrderBook> orderBooks, Callback callback) {
        initComponents();
        this.setLocationRelativeTo(null);

        this.bookList.setModel(bookList.getModel());
        this.orderBooks = orderBooks;
        this.callback = callback;

        try {
            for(OrderBook orderBook : this.orderBooks){
                orderBook.setTotal();
                this.totalPrice += orderBook.getTotal();
            }
        } catch(JBookException e){
            e.printStackTrace();
            this.destroy();
        }

        this.jLabel1.setText("Total price: " + this.totalPrice);
        this.reset();
        this.display();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookList = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        money = new javax.swing.JTextField();
        payButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Payment page");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(27, 26, 26));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Payment");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel2)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Total Price :");

        bookList.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return 0; }
            public String getElementAt(int i) { return null; }
        });
        jScrollPane1.setViewportView(bookList);

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel3.setText("Money:");

        money.setBackground(new java.awt.Color(183, 183, 183));
        money.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N

        payButton.setBackground(new java.awt.Color(0, 0, 0));
        payButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        payButton.setForeground(new java.awt.Color(255, 255, 255));
        payButton.setText("Pay");
        payButton.setBorder(null);
        payButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        closeButton.setBackground(new java.awt.Color(217, 217, 217));
        closeButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        closeButton.setText("Close");
        closeButton.setBorder(null);
        closeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(money, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(money, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        try {
            OrderBook orderBook = new OrderBook();
            orderBook.setMoney(this.getMoney());

            if(orderBook.getMoney() < this.totalPrice){
                throw new JBookException("Invalid money!");
            }

            for(int i = 0; i < this.bookList.getModel().getSize(); i++){
                orderBook.setItems((orderBook.getItems() == null ? "" : orderBook.getItems()) + this.bookList.getModel().getElementAt(i) + ",\n");
            }
            orderBook.setItems(orderBook.getItems().substring(0, orderBook.getItems().length() - 2));
            String dateTime = String.join(" ", LocalDateTime.now().toString().split("T"));

            for(OrderBook temp : this.orderBooks){
                orderBook.setQuantity(orderBook.getQuantity() + temp.getQuantity());
                temp.setTotal();
                orderBook.setTotal(orderBook.getTotal() + temp.getTotal());
            }
            orderBook.setChange(orderBook.getMoney() - orderBook.getTotal());

            Database db = new Database();
            String query = "INSERT INTO sales_history VALUES(DEFAULT(id), "
                    + getSingleQuotes(dateTime) + ", "
                    + getSingleQuotes(orderBook.getItems()) + ", "
                    + orderBook.getQuantity() + ", "
                    + orderBook.getMoney() + ", "
                    + orderBook.getTotal() + ", "
                    + orderBook.getChange() + ")";
//            System.out.println(query);
            db.insert(query);

            if(!db.isChanged){
                throw new SQLException("An error occurred and payment could not be completed!");
            }
            db.isChanged = false;

            int rowsChanged = 0;
            for(int i = 0; i < orderBooks.size(); i++){
                query = "UPDATE books SET remain = " + orderBooks.get(i).getRemain() + " WHERE book_id = " + orderBooks.get(i).getBookId();
                db.update(query);
                if(db.isChanged){
                    rowsChanged++;
                    db.isChanged = false;
                } else {
                    throw new SQLException("Something went wrong!");
                }
            }

            if(rowsChanged == orderBooks.size()){
                JOptionPane.showMessageDialog(this.getInstance(), "Payment completed successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                this.destroy();
                if(this.callback != null){
                    this.callback.run();
                }
                return;
            }

            throw new SQLException("Something went wrong!");
        } catch(SQLException | JBookException | NumberFormatException | NullPointerException e){
            JOptionPane.showMessageDialog(this.getInstance(), e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            this.reset();
        }
    }//GEN-LAST:event_payButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.destroy();
    }//GEN-LAST:event_closeButtonActionPerformed

    private double getMoney() throws NumberFormatException, NullPointerException {
        return Double.parseDouble(this.money.getText());
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
    public Payment getInstance(){
        return this;
    }

    @Override
    public void reset(){
        this.money.setText("");
        this.money.grabFocus();
    }

    private Callback callback = null;
    private ArrayList<OrderBook> orderBooks = new ArrayList<OrderBook>();
    private double totalPrice;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> bookList;
    private javax.swing.JButton closeButton;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTextField money;
    private javax.swing.JButton payButton;
    // End of variables declaration//GEN-END:variables
}
