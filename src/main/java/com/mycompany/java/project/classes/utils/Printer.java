package com.mycompany.java.project.classes.utils;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import java.awt.print.PrinterException;
import com.mycompany.java.project.classes.OrderBook;

public final class Printer {
    public static void print(OrderBook orderBook){
        try {
            JTextArea textArea = new JTextArea(getOurline(orderBook));
            textArea.print();
        } catch(PrinterException | SecurityException e){
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static String getOurline(OrderBook orderBook){
        String texts = "";
        texts += "- Receipt -".indent(60) + "\n\n";
        texts += "Date: " + orderBook.getDate().toString() + "\n";
        texts += "Time: " + orderBook.getTime().toString() + "\n";
        texts += "-".repeat(150) + "\n\n";
        texts += "Order List".indent(60);
        texts += "\n";
        texts += "=".repeat(100) + "\n";
        texts += "\n";

        String []items = orderBook.getItems().split(",\n");
        for(int i = 0; i < items.length; i++){
            texts += (i + 1) + ".) " + items[i] + "\n";
        }

        texts += "\n";
        texts += "=".repeat(100) + "\n";
        texts += "\n";
        texts += "Quantity: " + orderBook.getQuantity() + "\n";
        texts += "Money: " + "$" + orderBook.getMoney() + "\n";
        texts += "Change: " + "$" + orderBook.getChange() + "\n";
        texts += "Total: " + "$" + orderBook.getTotal() + "\n\n";
        texts += "-".repeat(150) + "\n";
        return texts;
    }
}
