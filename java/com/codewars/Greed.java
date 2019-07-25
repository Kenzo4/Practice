package com.codewars;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Greed {
    public static int greedy(int[] dices) {
        Map<Integer, Integer> numMap = new HashMap<>();

        IntStream.rangeClosed(1, 6).forEach(i -> numMap.put(i, 0));

        for (int dice : dices) {
            numMap.put(dice, numMap.get(dice) + 1);
        }

        int score = 0;

        for (HashMap.Entry<Integer, Integer> numStat : numMap.entrySet()) {

            final int numValue = numStat.getKey();
            final int numCount = numStat.getValue();

           if(numCount < 6){
               if(numValue == 1){
                   score += (numCount/3)*1000+(numCount%3)*100;
               }else if(numValue == 5){
                   score += (numCount/3)*numValue*100+(numCount%3)*50;
               }else{
                   score += (numCount/3)* numValue * 100;
               }
           }
        }
        return score;
    }
}
