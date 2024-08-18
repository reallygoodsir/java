package collections.day2.treeSet.eight;

import java.util.TreeSet;

public class Eighth {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Orange");
        set.add("White");
        set.add("Black");
        TreeSet<String> set2 = new TreeSet<>();
        set2.add("Red");
        set2.add("Green");
        set2.add("Orange");
        set2.add("White");
        set2.add("Black");
        System.out.println(set.equals(set2));
    }
}
