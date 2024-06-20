package collections.day1.thirdPart.eight;

import java.util.LinkedList;

public class Eighth {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Yellow");
        String specifiedElement = "Grey";
        list.addLast(specifiedElement);
        System.out.println("The linked list: " + list);
    }
}
