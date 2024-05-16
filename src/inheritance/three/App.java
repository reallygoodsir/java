package inheritance.three;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.println("Length: ");
        int l = b.nextInt();
        System.out.println("Width: ");
        int w = b.nextInt();
        b.close();

        Rectangle test = new Rectangle();
        test.getArea(l, w);
        Shape another = new Shape();
        another.getArea(l, w);
    }
}
