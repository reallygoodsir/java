package sevenDays.OOP.four;

class Circle {
    public int radius;
    void circleArea(int r){
        System.out.println("Area: " + (Math.PI * (r * r)));
    }
    void circleCircumference(int r){
        System.out.println("Circumference: " + (2 * Math.PI * r));
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
        a.circleArea(a.getRadius());
        a.circleCircumference(a.getRadius());
    }
}
