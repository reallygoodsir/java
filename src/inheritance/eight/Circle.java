package inheritance.eight;

import java.util.Scanner;

public class Circle extends Shape {
    double pi = Math.PI;

    void getPerimeter(int r) {
        System.out.println(pi * (r * r));
    }

    void getArea(int r) {
        System.out.println(2 * pi * r);
    }
}
