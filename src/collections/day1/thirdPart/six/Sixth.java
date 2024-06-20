package collections.day1.thirdPart.six;

import java.util.LinkedList;

public class Sixth {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Yellow");
        list.addFirst("Orange");
        list.addLast("Grey");
        System.out.println("The linked list: " + list);
    }
}
