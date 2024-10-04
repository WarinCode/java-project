package com.mycompany.java.project.pages;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import java.time.LocalDateTime;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.interfaces.PageHandling;
import com.mycompany.java.project.classes.Book;
import com.mycompany.java.project.classes.OrderBook;
import com.mycompany.java.project.db.Database;
import com.mycompany.java.project.interfaces.ResetForm;
import com.mycompany.java.project.interfaces.ImageConstants;
import com.mycompany.java.project.interfaces.Callback;
import com.mycompany.java.project.interfaces.InstanceProvider;
import static com.mycompany.java.project.classes.utils.Helper.getSingleQuotes;

public class Sale extends javax.swing.JFrame implements PageHandling, InstanceProvider<Sale> {

    public Sale(ArrayList<Book> books, Callback callback) {
        this.books = books;
        this.callback = callback;

        initComponents();
        this.setTitle("Sale page");
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        for(Book book : this.books){
            this.comboBox.addItem(book.getBookName());
        }
        this.comboBox.addItemListener((ItemEvent e) -> {
            this.bookImage.removeAll();
            this.remain.setText("Remain: " + Integer.toString(this.books.get(this.comboBox.getSelectedIndex()).getRemain()));
            ImageConstants.addImage(this.books.get(this.comboBox.getSelectedIndex()).getImageUrl(), this.bookImage);
            this.bookImage.setToolTipText(this.books.get(this.comboBox.getSelectedIndex()).getBookName() + " $" + this.books.get(this.comboBox.getSelectedIndex()).getPrice());
        });

        this.bookImage.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Preview.showPreview(comboBox.getSelectedIndex(), books.get(comboBox.getSelectedIndex()), books, () -> {
                    callback.run();
                    destroy();
                });
            }
        });

        this.setQuantity();
        this.comboBox.setSelectedIndex(0);
        this.setRemain();
        ImageConstants.addImage(this.books.get(0).getImageUrl(), this.bookImage);
        this.display();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        bookImage = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookList = new javax.swing.JList<>();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        remain = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sale");
        setBackground(new java.awt.Color(217, 217, 217));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel4.setBackground(new java.awt.Color(27, 26, 26));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sale Book");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel1.setText("Select book:");

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel2.setText("Quantity:");

        quantity.setBackground(new java.awt.Color(204, 204, 204));
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        bookImage.setBackground(new java.awt.Color(174, 174, 174));
        bookImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        bookImage.setToolTipText("");
        bookImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        bookList.setModel(new javax.swing.AbstractListModel<String>() {

            public int getSize() { return 0; }
            public String getElementAt(int i) { return ""; }
        });
        jScrollPane1.setViewportView(bookList);

        addButton.setBackground(new java.awt.Color(0, 0, 0));
        addButton.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(0, 0, 0));
        clearButton.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        orderButton.setBackground(new java.awt.Color(0, 0, 0));
        orderButton.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        orderButton.setForeground(new java.awt.Color(255, 255, 255));
        orderButton.setText("Order");
        orderButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
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

        remain.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        remain.setText("Remain: ");

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bookImage, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(remain)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity))
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(orderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(remain)
                            .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );

        add(bookImage, BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {}

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            Book selectedBook = this.books.get(this.comboBox.getSelectedIndex());
            OrderBook orderBook = new OrderBook(selectedBook);

            if(this.getQuantity() <= 0){
                throw new JBookException("Invalid quantity!");
            }

            if(this.getQuantity() > selectedBook.getRemain() || selectedBook.getRemain() < 0){
                throw new JBookException("An error occurred. The number of books selected exceeds the number of items remaining!");
            }

            orderBook.setQuantity(this.getQuantity());
            selectedBook.setRemain(selectedBook.getRemain() - this.getQuantity());
            orderBook.setRemain(selectedBook.getRemain());
            this.books.set(this.comboBox.getSelectedIndex(), selectedBook);

            if(this.isDuplicateOrderBook(selectedBook.getBookName())){
                for(int i = 0; i < this.bookModel.getSize(); i++){
                    String []words = this.bookModel.elementAt(i).split(",");
                    if(words[0].toLowerCase().equals(selectedBook.getBookName().toLowerCase())){
                        this.orderBooks.set(i, this.orderBooks.get(i)
                                .setQuantity(this.orderBooks.get(i).getQuantity() + orderBook.getQuantity())
                                .setRemain(this.orderBooks.get(i).getRemain() - orderBook.getQuantity())
                                .getInstance());
                        this.orderBooks.get(i).setTotal();
                        this.bookModel.setElementAt(String.join(",", words[0],
                                " $" + this.orderBooks.get(i).getTotal(),
                                " " + this.orderBooks.get(i).getQuantity() + this.getUnit(this.orderBooks.get(i).getQuantity()))
                                , i);
                        break;
                    }
                }
            } else {
                this.bookModel.addElement(String.join(",", selectedBook.getBookName(), " $" + (selectedBook.getPrice() * this.getQuantity())
                        , " " + this.getQuantity() + this.getUnit()));
                this.orderBooks.add(orderBook.getInstance());
            }
            this.bookList.setModel(this.bookModel);
            this.setRemain();

        } catch(JBookException | NumberFormatException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            this.setQuantity();
        }
    }

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if(this.orderBooks.size() > 0){
            this.orderBooks.clear();
        }
        this.bookModel.removeAllElements();
        this.bookList.removeAll();

        try {
            Database db = new Database();
            this.books = db.getBooks("SELECT * FROM books");
        } catch(SQLException | JBookException e){
            JOptionPane.showMessageDialog(this.getInstance(), e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        this.setRemain();
    }

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double money = 1000;
            String items = "";

            for(int i = 0; i < this.bookList.getModel().getSize(); i++){
                items += this.bookList.getModel().getElementAt(i) + ",\n";
            }

            items = items.substring(0, items.length() - 2);
            String dateTime = String.join(" ", LocalDateTime.now().toString().split("T"));

            int quantity = 0;
            double total = 0;
            for(OrderBook orderBook : this.orderBooks){
                quantity += orderBook.getQuantity();
                orderBook.setTotal();
                total += orderBook.getTotal();
            }
            double change = money - total;

            Database db = new Database();
            String query = "INSERT INTO sales_history VALUES(DEFAULT(id), "
                    + getSingleQuotes(dateTime) + ", "
                    + getSingleQuotes(items) + ", "
                    + quantity + ", "
                    + money + ", "
                    + total + ", "
                    + change + ")";
//            System.out.println(query);
//            System.out.println(this.orderBooks);
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
                return;
            }

            throw new SQLException("Something went wrong!");
        } catch(SQLException | JBookException e){
            JOptionPane.showMessageDialog(this.getInstance(), e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.destroy();
    }

    @Override
    public void display() {
        this.setVisible(true);
    }

    @Override
    public void destroy() {
        this.dispose();
        this.callback.run();
    }

    public void setRemain(){
        this.remain.setText("Remain: " + Integer.toString(this.books.get(this.comboBox.getSelectedIndex()).getRemain()));
    }

    public void reset(ArrayList<Book> books){
        this.books = books;
    }

    private int getQuantity() throws NumberFormatException {
        return Integer.parseInt(this.quantity.getText());
    }

    private void setQuantity(){
        this.quantity.setText("1");
    }

    private boolean isDuplicateOrderBook(String bookName){
        for(Book orderBook : this.orderBooks){
            if(orderBook.getBookName().toLowerCase().equals(bookName.toLowerCase())){
                return true;
            }
        }
        return false;
    }

    private String getUnit(){
        return this.getQuantity() > 1 ? " books" : " book";
    }

    private String getUnit(int value){
        return value > 1 ? " books" : " book";
    }

    @Override
    public Sale getInstance(){
        return this;
    }

    private DefaultListModel<String> bookModel = new DefaultListModel<String>();
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<OrderBook> orderBooks = new ArrayList<OrderBook>();
    private Callback callback = null;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel bookImage;
    private javax.swing.JList<String> bookList;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton orderButton;
    private javax.swing.JTextField quantity;
    private javax.swing.JLabel remain;
}