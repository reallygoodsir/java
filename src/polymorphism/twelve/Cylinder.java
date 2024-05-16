package polymorphism.twelve;

public class Cylinder extends Shape {
    @Override
    void draw() {
        System.out.println("Cylinder draw");
    }

    @Override
    void calculateArea() {
        System.out.println("Cylinder area");
    }
}
