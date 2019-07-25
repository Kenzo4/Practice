package com.codewars;

public class CharConsec {
    public static String characterConsecutive(String seq){
        int count = 0;
        int maxCount = 0;
        char prevChar = ' ';
        char maxChar = ' ';

        char[] charsSeq = seq.toCharArray();

        for(char ch : charsSeq){
            if(prevChar == ch)
                count += 1;
            else
                count = 1;
            if(count > maxCount){
                maxCount = count;
                maxChar = ch;
            }
            prevChar = ch;
        }
        return Character.toString(maxChar).concat(" : ") + Integer.toString(maxCount);
    }
}