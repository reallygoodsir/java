package polymorphism.eight;

public class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Square draw");
    }

    @Override
    void calculateArea() {
        System.out.println("Square area");
    }
}
