package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        String myName = formatName("Yuliia", "Mozhchil");
        System.out.println(myName);
    }
    public static String formatName(String first, String last){
        return last + ", " + first;
    }
}
