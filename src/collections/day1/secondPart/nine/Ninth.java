package collections.day1.secondPart.nine;

import java.util.ArrayList;
import java.util.Collections;

public class Ninth {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        Collections.shuffle(list);
        System.out.println(list);
    }
}
