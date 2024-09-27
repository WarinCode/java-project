package com.mycompany.java.project.classes.utils;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public final class Helper {
    public final static String DEFAULT_IMAGE_URL = "https://cdn3.iconfinder.com/data/icons/avatars-flat/33/man_5-512.png";

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
        try {
            URL url = new URL(imageUrl);
            image = ImageIO.read(url);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException iox) {
            iox.printStackTrace();
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
