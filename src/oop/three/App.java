package oop.three;

public class App {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setHeight(10);
        rectangle1.setWidth(25);
        rectangle1.calculateArea();

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setHeight(30);
        rectangle2.setWidth(12);
        rectangle2.calculatePerimeter();
    }
}
