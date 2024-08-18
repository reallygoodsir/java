package collections.day2.hashSet.eight;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Eighth {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");
        System.out.println(set);
        Set<String> treeSet = new TreeSet<>(set);
        System.out.println(treeSet);
    }
}
