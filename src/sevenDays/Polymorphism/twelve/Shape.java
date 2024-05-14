package sevenDays.Polymorphism.twelve;

public class Shape {
    void draw(){
        System.out.println("Shape draw");
    }
    void calculateArea(){
        System.out.println("Shape area");
    }
}

class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Circle draw");
    }

    @Override
    void calculateArea() {
        System.out.println("Circle area");
    }
}

class Cylinder extends Shape{
    @Override
    void draw() {
        System.out.println("Cylinder draw");
    }

    @Override
    void calculateArea() {
        System.out.println("Cylinder area");
    }
}