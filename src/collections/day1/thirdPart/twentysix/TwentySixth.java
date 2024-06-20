package collections.day1.thirdPart.twentysix;

import java.util.LinkedList;

public class TwentySixth {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        System.out.println(list);
        list.set(1, "Not Green");
        System.out.println(list);
    }
}
