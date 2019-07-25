package Practice.Exception;

class UseFinally {
    public static void getException(int what){
        int t;
        int nums[] = new int[2];

        System.out.println("Obtained: " + what);
        try{
            switch (what){
                case 0:
                    t = 10/what;
                    break;
                case 1:
                    nums[4] = 4;
                    break;
                case 2:
                    return;
            }
        }catch (ArithmeticException e){
            System.out.println("Attempt divide by zero");
            return;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Appropriate element not found");
        }finally {
            System.out.println("Exit from the block try");
        }
    }
}

class FinallyDemo{
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            UseFinally.getException(i);
            System.out.println();
        }
    }
}
