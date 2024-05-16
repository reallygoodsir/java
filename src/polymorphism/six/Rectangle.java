package polymorphism.six;

public class Rectangle extends Shape {
    @Override
    void getArea() {
        System.out.println("Rectangle area");
    }

    @Override
    void getPerimeter() {
        System.out.println("Rectangle perimeter");
    }
}
