package com.codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseSort {
    public static int[] reverseSort(int[] array){
        List<Integer> int_array = new ArrayList<>();

        for(int i : array){
            int_array.add(i);
        }

        Collections.sort(int_array, Collections.reverseOrder());
        return array;
    }
}
