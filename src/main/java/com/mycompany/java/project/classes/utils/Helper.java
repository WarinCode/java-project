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

    public static String getSingleQuotes(int value){
        return getSingleQuotes(Integer.toString(value));
    }

    public static String getSingleQuotes(double value){
        return getSingleQuotes(Double.toString(value));
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
}
