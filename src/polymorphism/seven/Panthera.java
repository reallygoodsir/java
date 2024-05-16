package polymorphism.seven;

public class Panthera extends Animal {
    @Override
    void move() {
        System.out.println("Panthera move");
    }

    @Override
    void makeSound() {
        System.out.println("Panthera sound");
    }
}
