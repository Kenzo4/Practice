package Stepik.Algorithms;

public class BinarySearch {
    public static int binarySearch(int[] sortedArray, int key, int low, int high){
        int mid = (low + high)/2;

        if(low > high){
            return -1;
        }

        if(key == sortedArray[mid]){
            return mid;
        }else if(key > sortedArray[mid]){
            return binarySearch(sortedArray, key, low, mid - 1);
        }else{
            return binarySearch(sortedArray, key, mid + 1, high);
        }
    }
}
