package sevenDays.Polymorphism.six;

public class Shape {
    void getArea(){
        System.out.println("Shape area");
    }

    void getPerimeter(){
        System.out.println("Shape perimeter");
    }
}

class Circle extends Shape{
    @Override
    void getArea() {
        System.out.println("Circle area");
    }

    @Override
    void getPerimeter() {
        System.out.println("Circle perimeter");
    }
}


class Rectangle extends Shape{
    @Override
    void getArea() {
        System.out.println("Rectangle area");
    }

    @Override
    void getPerimeter() {
        System.out.println("Rectangle perimeter");
    }
}

class Triangle extends Shape{
    @Override
    void getArea() {
        System.out.println("Triangle area");
    }

    @Override
    void getPerimeter() {
        System.out.println("Triangle perimeter");
    }
}