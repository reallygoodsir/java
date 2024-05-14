package sevenDays.inheritance.eight;

import java.util.Scanner;

class Shape {
    void getPerimeter() {
        System.out.println("getting perimeter");
    }

    void getArea() {
        System.out.println("getting area");
    }
}

class Circle extends Shape {
    double pi = Math.PI;

    void getPerimeter(int r) {
        System.out.println(pi * (r*r));
    }

    void getArea(int r) {
        System.out.println(2*pi*r);
    }

    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.println("enter radius: ");
        int radius = b.nextInt();
        Circle a = new Circle();
        a.getPerimeter(radius);
        a.getArea(radius);
    }
}
