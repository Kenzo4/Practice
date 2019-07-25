package Practice.Exception;

public class RethrowDemo {
    public static void main(String[] args) {
        try{
            Rethrow.getException();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Fatal error");
        }
    }
}
