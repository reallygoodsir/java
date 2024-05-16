package polymorphism.six;

public class Triangle extends Shape {
    @Override
    void getArea() {
        System.out.println("Triangle area");
    }

    @Override
    void getPerimeter() {
        System.out.println("Triangle perimeter");
    }
}
