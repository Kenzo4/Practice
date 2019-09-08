package com.codewars;

import java.util.ArrayList;

public class LastCharSort {
    public static ArrayList<String> sort (ArrayList<String> strArray) {
        final int arrayLength = strArray.size();
        boolean isSort = false;
        ArrayList<String> sorted = new ArrayList<>();

        sorted.add(strArray.get(0));

        char character = strArray.get(0).charAt(strArray.get(0).length() - 1);

        while (!isSort) {
            for (int i = 1; i < strArray.size(); i++) {
                char nextChar = strArray.get(i).toLowerCase().charAt(0);
                if (character == nextChar) {
                    sorted.add(strArray.get(i));
                    character = strArray.get(i).charAt(strArray.get(i).length() - 1);
                    strArray.remove(i);
                }
            }
            if (sorted.size() == arrayLength) {
                isSort = true;
            }
        }
        return sorted;
    }
}
