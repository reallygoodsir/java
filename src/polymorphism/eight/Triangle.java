package polymorphism.eight;

public class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Triangle area");
    }

    @Override
    void calculateArea() {
        System.out.println("Triangle perimeter");
    }
}
