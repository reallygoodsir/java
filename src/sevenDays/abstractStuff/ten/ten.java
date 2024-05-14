package sevenDays.abstractStuff.ten;

abstract class Shape2D{
    abstract void draw();
    abstract void resize();
}

class Rectangle extends Shape2D{
    void draw(){
        System.out.println("drawing the rectangle");
    }
    void resize(){
        System.out.println("resizing the rectangle");
    }
}

class Circle extends Shape2D{
    void draw(){
        System.out.println("drawing the circle");
    }
    void resize(){
        System.out.println("resizing the circle");
    }

    public static void main(String[] args) {
        Shape2D a = new Rectangle();
        a.draw();
        a.resize();
        a.draw();
        System.out.println();
        Shape2D b = new Circle();
        b.draw();
        b.resize();
    }
}