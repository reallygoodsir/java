package collections.day1.thirdPart.eighteen;

import java.util.LinkedList;

public class Eighteenth {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Yellow");
        list2.add("Classic");
        list2.add("Weird");
        list2.add("Angry");
        list2.add("Happy");
        list2.add("Positive");
        list2.add("Neutral");
        System.out.println(list);
        list = (LinkedList) list2.clone();
        System.out.println(list);
    }
}
