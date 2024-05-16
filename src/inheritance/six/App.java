package inheritance.six;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();
        Cheetah b = new Cheetah();
        b.move();
        Animal cheetah = new Cheetah();
        cheetah.move();
    }
}
