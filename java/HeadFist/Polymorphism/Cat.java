package HeadFist.Polymorphism;

public class Cat extends Animals {

    Cat(String name, int age) {
        super(name, age);
    }

    public void voice(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println("Meow-meow");
    }
}
