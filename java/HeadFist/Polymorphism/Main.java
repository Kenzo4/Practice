package HeadFist.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animals cat = new Cat("Tim", 9);
        cat.voice();
        System.out.println("/------------------------/");
        Animals dog = new Dog("Adele", 3);
        dog.voice();
    }
}
