package collections.day1.thirdPart.eleven;

import java.util.LinkedList;
import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Yellow");
        for(int i = 0 ; i < list.size(); i++ ){
            System.out.println("Element: " + list.get(i) + "\n Element index: " + i + "\n");
        }
    }
}
