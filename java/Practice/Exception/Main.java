package Practice.Exception;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start program");
        Practice practice = new Practice();
        int i = 10;
        try {
            practice.foo(10);
        } catch (MyException e) {
            System.out.println("Exception");
        }
        int b = 12;
        System.out.println("Answer will be: " + i + b);
        System.out.println("Final");
    }
}
