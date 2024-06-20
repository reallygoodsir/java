package collections.day1.thirdPart.sixteen;

import java.util.Collections;
import java.util.LinkedList;

public class Sixteenth {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Yellow");
        Collections.shuffle(list);
        System.out.println("The linked list: " + list);
    }
}
