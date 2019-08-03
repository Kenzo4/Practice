package Stepik.Algorithms;

import java.math.BigInteger;

public class GCD {
    private static BigInteger gcd(BigInteger a, BigInteger b){
        while(true){
            System.out.println(a + " " +b);
            if(a.equals(BigInteger.ZERO)) return b;
            if(b.equals(BigInteger.ONE)) return a;

            if(a.compareTo(b) >= 0){
                a = a.mod(b);
            }else{
                b = b.mod(a);
            }
        }
    }
    public void run(){
        System.out.println(gcd(new BigInteger("3405234050632003425345123123673221234135"),
                new BigInteger("23452345234529137132497217357971239749971"))
        );
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new GCD().run();
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");
    }
}
