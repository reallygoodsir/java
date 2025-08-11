package scjp.collections.comparator.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppTask5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("John Smith");
        list.add("Mike Avenue");
        list.add("King Barou");
        Collections.sort(list, new StringComparator());
        System.out.println(list);
    }
}
