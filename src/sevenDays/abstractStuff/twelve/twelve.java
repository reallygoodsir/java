package sevenDays.abstractStuff.twelve;

abstract class GeometricShape{
    abstract void area();
    abstract void perimeter();
}


class Triangle extends GeometricShape{
    void area(){
        System.out.println("triangle area");
    }
    void perimeter(){
        System.out.println("triangle perimeter");
    }
}

class Square extends GeometricShape{
    void area(){
        System.out.println("sq area");
    }
    void perimeter(){
        System.out.println("sq perimeter");
    }

    public static void main(String[] args) {
        GeometricShape a = new Square();
        a.area();
        a.perimeter();
        System.out.println();
        GeometricShape b = new Triangle();
        b.area();
        b.perimeter();
    }
}