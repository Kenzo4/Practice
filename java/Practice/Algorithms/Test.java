package Practice.Algorithms;

public class Test {
    public static void main(String[] args) {
        int[] a = {4, 6, 0, 1, 3, 7, 5};
        boolean sorted = false;
        int temp;
        while(!sorted){
            sorted = true;
            for(int i = 0; i < a.length - 1; i++){
                if(a[i] > a[i + 1]){
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
