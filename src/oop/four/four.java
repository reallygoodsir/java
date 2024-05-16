package oop.four;

class Circle {
    public int radius;

    void circleArea() {
        System.out.println("Area: " + (Math.PI * (radius * radius)));
    }

    void circleCircumference() {
        System.out.println("Circumference: " + (2 * Math.PI * radius));
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle a = new Circle();
        a.setRadius(10);
        a.circleArea();
        a.circleCircumference();
    }
}
