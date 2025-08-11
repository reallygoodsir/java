package scjp.collections.set.task5;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("barber");
        set1.add("apple");
        set1.add("tree");
        set1.add("penthouse");

        Set<String> set2 = new HashSet<>();
        set2.add("barber");
        set2.add("apple");
        set2.add("tree");
        set2.add("penthouse");
//        set2.add("shop");
        System.out.println(set1.equals(set2));
    }
}
