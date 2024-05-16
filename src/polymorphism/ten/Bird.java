package polymorphism.ten;

public class Bird extends Animal {
    @Override
    void eat() {
        System.out.println("Bird eat");
    }

    @Override
    void sound() {
        System.out.println("Bird sound");
    }
}
