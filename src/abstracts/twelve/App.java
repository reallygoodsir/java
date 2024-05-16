package abstracts.twelve;

public class App {
    public static void main(String[] args) {
        GeometricShape a = new Square();
        a.area();
        a.perimeter();
        System.out.println();
        GeometricShape b = new Triangle();
        b.area();
        b.perimeter();
    }
}
