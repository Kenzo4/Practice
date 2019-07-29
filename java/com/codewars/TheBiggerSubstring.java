package com.codewars;

public class TheBiggerSubstring {
    public static int[] biggerSubstring(int[] array){
        int fSum = array[0] + array[1];
        int[] biggestSubstring = new int[2];

        for(int i = 1; i < array.length - 1; i++){
            for(int j = i + 1; j < i + 2; j++){
                if(fSum < array[i] + array[j]){
                    fSum = array[i] + array[j];
                    biggestSubstring[0] = array[i];
                    biggestSubstring[1] = array[j];
                }
            }
        }
        return biggestSubstring;
    }
}
