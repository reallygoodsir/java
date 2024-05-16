package encapsulation.five;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    void calculateArea(){
        double a = Math.PI * (getRadius() * getRadius());
        System.out.println("Area: " + a);
    }
    void calculatePerimeter(){
        double a = 2 * Math.PI * getRadius();
        System.out.println("Area: " + a);
    }
}
