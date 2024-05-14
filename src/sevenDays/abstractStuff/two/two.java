package sevenDays.abstractStuff.two;

abstract class Shape {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Circle extends Shape {
    void calculateArea() {
        System.out.println("calculating circle area");
    }
    void calculatePerimeter(){
        System.out.println("calculating circle perimeter");
    }
}

class Triangle extends Shape {
    void calculateArea() {
        System.out.println("calculating triangle area");
    }

    void calculatePerimeter(){
        System.out.println("calculating triangle perimeter");
    }

    public static void main(String args[]) {
        Shape something = new Triangle();
        something.calculateArea();
        something.calculatePerimeter();
        System.out.println();
        Shape test = new Circle();
        test.calculateArea();
        test.calculatePerimeter();
    }
}
