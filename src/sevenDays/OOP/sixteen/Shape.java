package sevenDays.OOP.sixteen;

abstract class Shape {
    abstract void calculateArea(int w, int h);
    abstract void calculatePerimeter(int w, int h);
}

class Rectangle extends Shape{
    void calculateArea(int w, int h){
        System.out.println("rectangle area");
    }
    void calculatePerimeter(int w, int h){
        System.out.println("rectangle perimeter");
    }
}

class Circle extends Shape{
    void calculateArea(int w, int h){
        System.out.println("circle area");
    }
    void calculatePerimeter(int w, int h){
        System.out.println("circle perimeter");
    }
}

class Triangle extends Shape{
    void calculateArea(int w, int h){
        System.out.println("triangle area");
    }
    void calculatePerimeter(int w, int h){
        System.out.println("triangle perimeter");
    }
}