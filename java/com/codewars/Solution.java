package com.codewars;

public class Solution {
    public static String toCamelCase(String s){
        int count = 0;
        int length = s.length();
        char[] letters = s.toCharArray();

        int res_ind = 0;

        for(int i = 0; i < length; i++){

            //Check spaces in the sentence
            if(letters[i] == '-'){
                count++;
                letters[i + 1] = Character.toUpperCase(letters[i + 1]);
                continue;
            }else if(letters[i] == '_'){
                count++;
                letters[i + 1] = Character.toUpperCase(letters[i + 1]);
                continue;
            }else if(letters[i] == ' '){
                count++;
                letters[i + 1] = Character.toUpperCase(letters[i + 1]);
                continue;
                //If not space copy value
            }else{
                letters[res_ind++] = letters[i];
            }
        }
        return String.valueOf(letters,0,length - count);
    }
}