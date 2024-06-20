package collections.day1.secondPart.ten;

import java.util.ArrayList;
import java.util.Collections;

public class Tenth {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        Collections.reverse(list);
        System.out.println(list);
    }
}
