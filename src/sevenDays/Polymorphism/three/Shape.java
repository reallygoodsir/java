package sevenDays.Polymorphism.three;

public class Shape {
    void calculateArea(){
        System.out.println("Shape area");
    }
}

class Circle extends Shape{
    @Override
    void calculateArea() {
        System.out.println("Circle area");
    }
}

class Rectangle extends Shape{
    @Override
    void calculateArea() {
        System.out.println("Rectangle area");
    }
}

class Triangle extends Shape{
    @Override
    void calculateArea() {
        System.out.println("Triangle area");
    }
}