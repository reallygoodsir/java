package collections.day1.thirdPart.fifteen;

import java.util.Collections;
import java.util.LinkedList;

public class Fifteenth {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Yellow");
        Collections.swap(list, 1, 3);
        System.out.println("The linked list: " + list);
    }
}
