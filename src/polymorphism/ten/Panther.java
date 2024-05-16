package polymorphism.ten;

public class Panther extends Animal {
    @Override
    void eat() {
        System.out.println("Panther eat");
    }

    @Override
    void sound() {
        System.out.println("Panther sound");
    }
}
