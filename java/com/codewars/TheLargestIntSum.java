package com.codewars;

public class TheLargestIntSum {
    public static int[] largestIntSum(int[] array){
        int fSum = array[0] + array[1];
        int[] largestSumIntArr = new int[2];

        for(int i = 1; i < array.length - 1; i++){
            int kSum = array[i] + array[i + 1];
                if(fSum < kSum){
                    fSum = kSum;
                    largestSumIntArr[0] = array[i];
                    largestSumIntArr[1] = array[i + 1];
                }
        }
        return largestSumIntArr;
    }

    public static int[] largestIntSum(int[] array, int k){
        int fSum = 0;
        for(int i = 0; i < k; i++){
            fSum += array[i];
        }

        int[] largestSumIntArr = new int[k];

        for(int i = k - 1; i < array.length; i++){
            for(int j = i + 1; j < i + k; j++){
                int sum = array[i] + array[j];
                if(fSum < sum){
                    fSum = sum;
                }
            }
        }
        return largestSumIntArr;
    }
}
