package collections.day2.treeSet.four;

import java.util.TreeSet;

public class Fourth {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Orange");
        set.add("White");
        set.add("Black");
        System.out.println(set);
        System.out.println(set.descendingSet());
    }
}
