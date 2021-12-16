package com.kodilla.stream.reference;

public class BeautifierPoemMethods {

    public static String addStars(String poem){
        return "*** " + poem + " ***";
    }

    public static String toUpper(String poem){
        return poem.toUpperCase();
    }

    public static String almostWinter (String poem){
        String result = "*";
        for (int i = 0; i < poem.length(); i ++ ){
            result = poem.charAt(i) + "*";
        }
        return result;
        }
    }

