package com.codewars;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseSort {
    public static int[] descendingSort(int[] array){
        List<Integer> data_array = Arrays.stream(array).boxed().collect(Collectors.toList());

        Collections.sort(data_array, Collections.reverseOrder());

        array = data_array.stream().mapToInt(Integer::intValue).toArray();

        return array;
    }
}
