package Practice.Exception;

public class ExcTest {
    static void getException(){
        int[] nums = new int [4];

        System.out.println("Before generate exception");

        nums[7] = 10;
        System.out.println("This line will not show");
    }
}

class UseThrowableMethods {
    public static void main(String[] args) {
        try{
            ExcTest.getException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Common message: ");
            System.out.println(e);
            System.out.println("\nCall stack: ");
            e.printStackTrace();
        }
        System.out.println("After instruction catch");
    }
}
