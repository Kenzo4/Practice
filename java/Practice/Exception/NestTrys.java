package Practice.Exception;

public class NestTrys {
    public static void main(String[] args) {
        int[] number = {4,8,16,32,64,128,256,512};
        int[] denom = {2,0,4,4,0,8};

        try{
            for(int i = 0; i < number.length; i++){
                try{
                    System.out.println(number[i] + " / " +
                            denom[i] + " equals " +
                            number[i]/denom[i]);
                }catch (ArithmeticException e){
                    System.out.println("Attempt do divide by zero");
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Appropriate element not found");
            System.out.println("Fatal error");
        }
    }
}
