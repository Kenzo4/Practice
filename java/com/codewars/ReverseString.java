package com.codewars;

import java.util.Arrays;

public class ReverseString {
    public static String reverseString (String str){
        int n = 1;
        char[] letters = new char[str.length()];
        for(int i = str.length() ; i > 0; i--){
            letters[i] = str.charAt(n);
            n++;
        }
        System.out.println(Arrays.toString(letters));
        return str;
    }
}
