import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scan.nextInt();

        int[] fib = new int[n + 1];

        fib[0] = 1;
        fib[1] = 1;

        for(int i = 2; i < fib.length; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.println(fib[n]);
    }
}
