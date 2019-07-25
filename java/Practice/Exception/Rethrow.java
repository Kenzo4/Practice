package Practice.Exception;

public class Rethrow {
    public static void getException() {
        int[] number = {4,8,16,32,64,128,256,512};
        int[] denom = {2,0,4,4,0,8};

        for(int i = 0; i < number.length; i++){
            try{
                System.out.println(number[i] + " / " +
                        denom[i] + " equals " +
                        number[i]/denom[i]);
            }catch (ArithmeticException e){
                System.out.println("Attempt to divide by zero");
            }catch (IndexOutOfBoundsException e){
                System.out.println("Appropriate number not found");
                throw e;
            }
        }
    }
}
