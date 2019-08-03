package Stepik.Algorithms;

import java.math.BigInteger;

public class Fibonacci {
    private static final int MOD = (int) 1e9 + 7;
    public int fibonacci(int n){
        int a = 0;
        int b = 1;

        for(int i = 0; i < n; i++){
            int c = a + b;
            //If needed find fibonacci number modulo use code below and MOD constant
            //int c = (a + b) % MOD;
            a = b;
            b = c;
        }
        return a;
    }

    public void run(int n){
       System.out.println(n + ": " + fibonacci(n));
   }

    public static void main(String[] args) {
           long startTime = System.currentTimeMillis();
           new Fibonacci().run(100);
           long finishTime = System.currentTimeMillis();
           System.out.println(finishTime - startTime + " ms");
    }
}