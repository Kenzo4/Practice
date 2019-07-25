package HeadFist.Polymorphism;

public class Dog extends Animals{

    Dog(String name, int age) {
        super(name, age);
    }

    public void voice(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println("Gaw-gaw");
    }
}
