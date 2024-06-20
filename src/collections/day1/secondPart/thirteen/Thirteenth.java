package collections.day1.secondPart.thirteen;

import java.util.ArrayList;
import java.util.Collections;

public class Thirteenth {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(list);
        Collections.swap(list, 1, 2);
        System.out.println(list);
    }
}
