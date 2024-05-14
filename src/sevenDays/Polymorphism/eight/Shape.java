package sevenDays.Polymorphism.eight;


public class Shape {
    void draw(){
        System.out.println("Shape draw");
    }

    void calculateArea(){
        System.out.println("Shape area");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Circle draw");
    }

    @Override
    void calculateArea() {
        System.out.println("Circle area");
    }
}


class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Square draw");
    }

    @Override
    void calculateArea() {
        System.out.println("Square area");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Triangle area");
    }

    @Override
    void calculateArea() {
        System.out.println("Triangle perimeter");
    }
}
