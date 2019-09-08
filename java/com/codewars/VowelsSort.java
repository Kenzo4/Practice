package com.codewars;

import java.util.ArrayList;

public class VowelsSort {
    public static ArrayList<ArrayList<Character>> sort(String word){
        char[] letters = word.toCharArray();

        ArrayList<ArrayList<Character>> sorted = new ArrayList<>();

        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> others = new ArrayList<>();

        for(int i = 0; i < letters.length; i++){
            if(letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i'
                    || letters[i] == 'o' || letters[i] == 'u'){
                vowels.add(letters[i]);
            }else{
                others.add(letters[i]);
            }
        }
        sorted.add(vowels);
        sorted.add(others);

        System.out.println(sorted);

        return sorted;
    }
}
