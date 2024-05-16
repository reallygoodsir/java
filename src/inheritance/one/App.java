package inheritance.one;

public class App {
    public static void main(String[] args) {
        Cat test = new Cat();
        test.makeSound();
        Animal animal = new Animal();
        animal.makeSound();
        Animal animal2 = new Cat();
        animal2.makeSound();
    }
}
