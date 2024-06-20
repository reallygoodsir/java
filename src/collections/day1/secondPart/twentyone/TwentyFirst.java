package collections.day1.secondPart.twentyone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TwentyFirst {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Purple");
        System.out.println("Enter the color replacing");
        Scanner scanner = new Scanner(System.in);
        String colorReplacement = scanner.next();
        list.set(1,colorReplacement);
        System.out.println(list);
    }
}
