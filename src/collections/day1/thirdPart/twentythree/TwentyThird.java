package collections.day1.thirdPart.twentythree;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class TwentyThird {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.add("Pink");
        System.out.println("linked list: " + linkedList);

        ArrayList<String> list = new ArrayList<>(linkedList);
        System.out.println("array list: " + list);
    }
}
