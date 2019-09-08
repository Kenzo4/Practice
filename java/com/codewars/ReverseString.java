package com.codewars;

import java.util.Arrays;

public class ReverseString {
    public static String reverseString (String str){
        int n = str.length() - 1;
        char[] letters = new char[str.length()];
        for(int i = 0 ; i < str.length(); i++){
            letters[n] = str.toLowerCase().charAt(i);
            n--;
        }
        str = new String(letters);
        System.out.println(str);
        return str;
    }
}
