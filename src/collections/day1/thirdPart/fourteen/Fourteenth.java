package collections.day1.thirdPart.fourteen;

import java.util.LinkedList;

public class Fourteenth {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Yellow");
        list.removeAll(list);
        System.out.println("The linked list: " + list);
    }
}
