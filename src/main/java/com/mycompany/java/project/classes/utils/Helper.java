package com.mycompany.java.project.classes.utils;

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
}
