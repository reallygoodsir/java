package abstracts.two;

public class App {
    public static void main(String args[]) {
        Shape something = new Triangle();
        something.calculateArea();
        something.calculatePerimeter();
        System.out.println();
        Shape test = new Circle();
        test.calculateArea();
        test.calculatePerimeter();
    }
}
