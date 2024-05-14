package sevenDays.Polymorphism.seven;

public class Animal {
    void move(){
        System.out.println("Animal move");
    }
    void makeSound(){
        System.out.println("Animal sound");
    }
}

class Bird extends Animal{
    @Override
    void move() {
        System.out.println("Bird move");
    }

    @Override
    void makeSound() {
        System.out.println("Bird sound");
    }
}

class Panthera extends Animal{
    @Override
    void move() {
        System.out.println("Panthera move");
    }

    @Override
    void makeSound() {
        System.out.println("Panthera sound");
    }
}