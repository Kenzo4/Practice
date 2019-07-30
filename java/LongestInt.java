public class LongestInt {
    public static int largestIntSum(int[] array, int k){
        int fSum = 0;
        for(int i  = 0;  i < k; i++){
            fSum += array[i];
        }

        for(int i = k - 1; i < array.length - 1; i += k - 1){
            for(int j = i + 1; j < i + k; j++){
                System.out.println(array[i] + " : " + array[j]);
            }
        }
        return fSum;
    }
}
