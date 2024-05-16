package polymorphism.seven;

public class Bird extends Animal {
    @Override
    void move() {
        System.out.println("Bird move");
    }

    @Override
    void makeSound() {
        System.out.println("Bird sound");
    }
}
