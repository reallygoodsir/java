package collections.day1.thirdPart.seventeen;

import java.util.LinkedList;

public class Seventeenth {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Yellow");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Classic");
        list2.add("Weird");
        list2.add("Angry");
        list2.add("Happy");
        list2.add("Positive");
        list2.add("Neutral");
        list.addAll(list2);
        System.out.println("The combined linked list: " + list);
    }
}
