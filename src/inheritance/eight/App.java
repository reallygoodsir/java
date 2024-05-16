package inheritance.eight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.println("enter radius: ");
        int radius = b.nextInt();
        Circle a = new Circle();
        a.getPerimeter(radius);
        a.getArea(radius);
    }
}
