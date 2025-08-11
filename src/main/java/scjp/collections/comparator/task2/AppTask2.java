package scjp.collections.comparator.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppTask2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("kiwi");
        strings.add("mango");
        strings.add("Polymorphism");
        strings.add("Java");
        strings.add("no");
        strings.add("Fabulous");
        Collections.sort(strings,new StringComparator());
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
