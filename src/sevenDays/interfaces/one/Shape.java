package sevenDays.interfaces.one;

public interface Shape {
    void getArea();
}

class Rectangle implements Shape{
    public void getArea(){
        System.out.println("Rectangle area");
    }
}

class Circle implements Shape{
    public void getArea(){
        System.out.println("Circle area");
    }
}

class Triangle implements Shape{
    public void getArea(){
        System.out.println("Triangle area");
    }
}