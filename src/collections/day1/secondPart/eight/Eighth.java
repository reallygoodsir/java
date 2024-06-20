package collections.day1.secondPart.eight;

import java.util.ArrayList;
import java.util.Collections;

public class Eighth {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("ffirst");
        list2.add("ssecond");
        list2.add("tthird");
        System.out.println(list + "\n");
        Collections.copy(list,list2);
        System.out.println(list);
    }
}
