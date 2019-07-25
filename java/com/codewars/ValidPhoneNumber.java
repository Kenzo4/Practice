package com.codewars;

import java.util.ArrayList;

public class ValidPhoneNumber {
    public static boolean validPhoneNumber(String phoneNumber) {
        ArrayList<Character> letters = new ArrayList<>();

        for (char letter : phoneNumber.toCharArray()) {
            if (!Character.isDigit(letter)) {
                letters.add(letter);
            }
        }

        boolean isTrue = false;

        if(letters.size() ==4 && letters.get(0).equals('(') &&
                letters.get(letters.indexOf(')')+1).equals(' ')&&
                letters.get(letters.indexOf(' ')+1).equals('-')){
            return true;
        }else {
            return false;
        }
    }
}
