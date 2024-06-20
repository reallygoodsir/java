package collections.day1.thirdPart.twenty;

import java.util.LinkedList;

public class Twentieth {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Yellow");
        System.out.println(list.getFirst());
        System.out.println("The linked list: " + list);
    }
}
