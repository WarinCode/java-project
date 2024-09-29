package com.mycompany.java.project.interfaces;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public interface ImageConstants {
    public final static String DEFAULT_IMAGE_URL = "https://media.istockphoto.com/id/183890264/photo/upright-red-book-with-clipping-path.jpg?s=612x612&w=0&k=20&c=zm6sEPnc4zK4MNj307pm3tzgxTbex2sOnb1Ip5hglaA=";
    public final static String DEFAULT_IMAGE_NOT_AVALIBLE = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9VikAOE2G2gjohpGNr_thh_7XSL1kZV7udA&s";

    public static void addImage(String imageUrl, JPanel panel){
        Image image = null;
        URL url = null;
        try {
            url = new URL(imageUrl);
            image = ImageIO.read(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            panel.removeAll();
            addImage(DEFAULT_IMAGE_NOT_AVALIBLE, panel);
            return;
        } catch (IOException e) {
            e.printStackTrace();
            panel.removeAll();
            addImage(DEFAULT_IMAGE_NOT_AVALIBLE, panel);
            return;
        } catch(Exception e){
            e.printStackTrace();
            panel.removeAll();
            addImage(DEFAULT_IMAGE_NOT_AVALIBLE, panel);
            return;
        }

        if (image != null) {
            Image scaledImage = image.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
            JLabel label = new JLabel(new ImageIcon(scaledImage));
            panel.setLayout(new BorderLayout());
            panel.add(label, BorderLayout.CENTER);
            panel.revalidate();
        } else {
            System.out.println("Failed to load image");
            addImage(DEFAULT_IMAGE_NOT_AVALIBLE, panel);
            return;
        }
    }
}
