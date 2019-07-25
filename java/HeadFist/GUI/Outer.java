package HeadFist.GUI;

public class Outer {
    private int x;
    Inner inner = new Inner();
    public void doSomething(){
        inner.go();
    }
    class Inner{
        void go(){
            x = 42;
        }
    }
}
