package sevenDays.interfaces.five;

import java.util.Scanner;

public class Rectangle implements Resizable {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void resizeWidth(int width){
        Scanner a = new Scanner(System.in);
        System.out.println("new width? ");
        int newww = a.nextInt();
        width = newww;
        System.out.println("new width: " + width);
    }
    public void resizeHeight(int height){
        Scanner a = new Scanner(System.in);
        System.out.println("new height? ");
        int newww = a.nextInt();
        height = newww;
        System.out.println("new height: " + height);
    }
}
