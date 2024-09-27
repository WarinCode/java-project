package com.mycompany.java.project.classes.utils;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public final class Helper {
    public final static String DEFAULT_IMAGE_URL = "https://cdn3.iconfinder.com/data/icons/avatars-flat/33/man_5-512.png";
    public final static String DEFAULT_IMAGE_NOT_AVALIBLE = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9VikAOE2G2gjohpGNr_thh_7XSL1kZV7udA&s";

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
