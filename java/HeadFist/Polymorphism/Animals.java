package HeadFist.Polymorphism;

public class  Animals {

    private String name;
    private int age;

    Animals(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void voice(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println("I don't know my voice");
    }
}
