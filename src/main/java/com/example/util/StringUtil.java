package com.example.util;

public class StringUtil
{
    public static String repeat(String str, int times) throws IllegalAccessException{
        if (times<0) {throw new IllegalAccessException("negative times not allowed");}
        String result = "";
        for (int i = 0; i < times; i++) {result += str;}
        return result;
    }

    public static boolean isEmpty(String str)
    {
        if (str == null) {return true;}
        else {return str.trim().isEmpty();}
    }
}
