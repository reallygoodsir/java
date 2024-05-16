package abstracts.eleven;

public class App {
    public static void main(String[] args) {
        Bird a = new Eagle();
        a.fly();
        a.makeSound();
        a.fly();
        System.out.println();
        Bird b = new Hawk();
        b.fly();
        b.makeSound();
    }
}
