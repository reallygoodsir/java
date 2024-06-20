package collections.day1.thirdPart.thirteen;

import java.util.LinkedList;

public class Thirteenth {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Yellow");
        list.remove(list.getFirst());
        list.remove(list.getLast());
        System.out.println("The linked list: " + list);
    }
}
