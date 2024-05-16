package oop.three;

public class Rectangle {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    void calculateArea() {
        System.out.println("Area = " + (width * height));
    }

    void calculatePerimeter() {
        int w = width * 2;
        int h = height * 2;
        int sum = w + h;
        System.out.println("Area = " + sum);
    }
}
