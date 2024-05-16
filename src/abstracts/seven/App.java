package abstracts.seven;

public class App {
    public static void main(String[] args) {
        Vehicle a = new Car();
        a.startEngine();
        a.stopEngine();
        System.out.println();
        Vehicle b = new Motorcycle();
        b.startEngine();
        b.stopEngine();
    }
}
