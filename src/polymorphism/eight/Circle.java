package polymorphism.eight;

public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Circle draw");
    }

    @Override
    void calculateArea() {
        System.out.println("Circle area");
    }
}
