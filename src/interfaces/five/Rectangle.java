package interfaces.five;

import java.util.Scanner;

public class Rectangle implements Resizable {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("new width: " + width);
    }

    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("new height: " + height);
    }
}
