package polymorphism.six;

public class Circle extends Shape {
    @Override
    void getArea() {
        System.out.println("Circle area");
    }

    @Override
    void getPerimeter() {
        System.out.println("Circle perimeter");
    }
}
