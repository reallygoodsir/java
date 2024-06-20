package collections.day1.secondPart.fourteen;

import java.util.ArrayList;
import java.util.Collections;

public class Fourteenth {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("6");
        list2.add("7");
        list2.add("8");
        list2.add("9");
        list2.add("10");

        list.addAll(list2);
        System.out.println(list);
    }
}
