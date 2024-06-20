package collections.day1.thirdPart.twentyone;

import java.util.LinkedList;

public class TwentyFirst {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Yellow");
        System.out.println(list.getLast());
        System.out.println("The linked list: " + list);
    }
}
