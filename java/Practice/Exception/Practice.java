package Practice.Exception;

public class Practice {

    public void foo(int a) throws MyException {
        System.out.println("Start of the method");

        if(a != 10){
            throw new MyException("Illegal input value");
        }else{
            System.out.println("You win!");
        }

        System.out.println("End of the method!");
    }
}
