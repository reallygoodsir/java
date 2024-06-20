package collections.day1.thirdPart.seven;

import java.util.LinkedList;

public class Seventh {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Yellow");
        String specifiedElement = "Orange";
        list.addFirst(specifiedElement);
        System.out.println("The linked list: " + list);
    }
}
