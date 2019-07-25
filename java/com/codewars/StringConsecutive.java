package com.codewars;

public class StringConsecutive {
    public static String longestConsecutive(String[] strarr, int k) {
        String longestSeq = "";
        for(int i = 0; i <= strarr.length - k; i++){
            StringBuilder current = new StringBuilder();
            for(int j = 0; j < k; j++){
                current.append(strarr[i+j]);
            }
            if(current.length() > longestSeq.length()){
                longestSeq = current.toString();
            }
        }
        return longestSeq;
    }
}
