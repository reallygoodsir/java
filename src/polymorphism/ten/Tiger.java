package polymorphism.ten;

public class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger eat");
    }

    @Override
    void sound() {
        System.out.println("Tiger sound");
    }
}
