package com.mycompany.java.project.pages;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import com.mycompany.java.project.classes.OrderBook;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.classes.utils.Printer;
import com.mycompany.java.project.db.controllers.OrderBookController;
import com.mycompany.java.project.interfaces.PageHandling;
import com.mycompany.java.project.interfaces.InstanceProvider;

public class SalesHistory extends javax.swing.JFrame implements PageHandling, InstanceProvider<SalesHistory> {
    public SalesHistory() {
        initComponents();
        this.setLocationRelativeTo(null);

        try {
            OrderBookController orderBookController = new OrderBookController();
            this.orderBooks = orderBookController.getOrderBooks("SELECT * FROM sales_history");
        } catch(SQLException | JBookException e){
            JOptionPane.showMessageDialog(this.getInstance(), e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            this.destroy();
        }

        String [][]data = new String[this.orderBooks.size()][7];
        for(int i = 0; i < this.orderBooks.size(); i++){
            data[i][0] = Integer.toString(i + 1);
            data[i][1] = this.orderBooks.get(i).getDate().toString();
            data[i][2] = this.orderBooks.get(i).getTime().toString();
            data[i][3] = this.orderBooks.get(i).getItems();
            data[i][4] = Integer.toString(this.orderBooks.get(i).getQuantity());
            data[i][5] = Double.toString(this.orderBooks.get(i).getTotal());
            data[i][6] = Double.toString(this.orderBooks.get(i).getChange());
        }
        this.table.setModel(new DefaultTableModel(data, this.columns){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        });
        this.table.setRowHeight(45);
        this.table.setColumnSelectionAllowed(false);
        this.table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.display();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        printButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sales histroy page");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(27, 26, 26));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sales History Table");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Date", "Time", "Items", "Quantity", "Total", "Change"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(5).setResizable(false);
            table.getColumnModel().getColumn(6).setResizable(false);
        }

        printButton.setBackground(new java.awt.Color(0, 0, 0));
        printButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        printButton.setForeground(new java.awt.Color(255, 255, 255));
        printButton.setText("Print receipt");
        printButton.setBorder(null);
        printButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        boolean isSelected = false;
        int index = 0;
        for(int i = 0; i < this.table.getRowCount(); i++){
            if(this.table.isRowSelected(i)){
                isSelected = true;
                index = i;
                break;
            }
        }

        if(isSelected){
            Printer.print(this.orderBooks.get(index).getInstance(), this.getInstance());
            this.destroy();
        } else {
            JOptionPane.showMessageDialog(this.getInstance(), "Please select a row to print reciept", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_printButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.destroy();
    }//GEN-LAST:event_closeButtonActionPerformed

    @Override
    public void display(){
        this.setVisible(true);
    }

    @Override
    public void destroy(){
        this.dispose();
    }

    @Override
    public SalesHistory getInstance(){
        return this;
    }

    private ArrayList<OrderBook> orderBooks = new ArrayList<OrderBook>();
    private final String []columns = { "Number", "Date", "Time", "Items", "Quantity", "Total", "Change" };
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printButton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
