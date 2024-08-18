package collections.day2.treeSet.thirteenFourteen;

import java.util.TreeSet;

public class ThirteenthAndFourteenth {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Orange");
        set.add("White");
        set.add("Black");
        System.out.println(set);
        String first = set.pollFirst();
        String last = set.pollLast();
        System.out.println(first);
        System.out.println(last);
    }
}
