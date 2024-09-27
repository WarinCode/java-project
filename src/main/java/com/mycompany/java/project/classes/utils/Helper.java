package com.mycompany.java.project.classes.utils;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public final class Helper {
    public static String getSingleQuotes(String value){
        return "'" + value + "'";
    }

    public static String getDoubleQuotes(String value){
        return "\"" + value + "\"";
    }

    public static String getString(char []characters){
        String temp = "";
        for(char character : characters){
            temp += character;
        }
        return temp;
    }

    public static void addImage(String imageUrl, JPanel panel){
        Image image = null;
        URL url = null;
        try {
            url = new URL(imageUrl);
            image = ImageIO.read(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (image != null) {
            Image scaledImage = image.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
            JLabel label = new JLabel(new ImageIcon(scaledImage));
            panel.setLayout(new BorderLayout());
            panel.add(label, BorderLayout.CENTER);
            panel.revalidate();
        } else {
            System.out.println("Failed to load image");
        }
    }
}
