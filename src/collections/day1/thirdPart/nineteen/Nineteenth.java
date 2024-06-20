package collections.day1.thirdPart.nineteen;

import java.util.LinkedList;

public class Nineteenth {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Yellow");
        System.out.println("The old linked list: " + list);
        String first = list.removeFirst();
        System.out.println("The new linked list: " + list);
        System.out.println("The deleted first element: " + first);
    }
}
