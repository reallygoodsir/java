package collections.day1.thirdPart.nine;

import java.util.LinkedList;

public class Ninth {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Yellow");
        int specifiedPosition = 1;
        System.out.println(list);
        list.add(specifiedPosition, "Grey");
        list.add(specifiedPosition, "Orange");
        list.add(specifiedPosition, "Purple");
        System.out.println("The linked list: " + list);
    }
}
