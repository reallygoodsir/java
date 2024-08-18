package collections.day2.treeSet.two;

import java.util.TreeSet;

public class Second {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Orange");
        set.add("White");
        set.add("Black");
        for (String line : set) {
            System.out.println(line);
        }
    }
}
