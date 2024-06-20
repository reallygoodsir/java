package collections.day1.thirdPart.five;

import java.util.LinkedList;

public class Fifth {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Yellow");
        String specifiedElement = "Orange";
        int specifiedPosition = 1;
        list.add(specifiedPosition,specifiedElement);
        System.out.println("The linked list: " + list);
    }
}
