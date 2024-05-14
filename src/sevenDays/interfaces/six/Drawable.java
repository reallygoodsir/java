package sevenDays.interfaces.six;

public interface Drawable {
    void draw();
}

class Circle implements Drawable{
    public void draw(){
        System.out.println("draw Circle");
    }
}

class Rectangle implements Drawable{
    public void draw(){
        System.out.println("draw Rectangle");
    }
}

class Triangle  implements Drawable{
    public void draw(){
        System.out.println("draw Triangle ");
    }
}