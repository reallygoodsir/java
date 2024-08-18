package collections.day2.treeSet.six;

import java.util.TreeSet;

public class Sixth {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Orange");
        set.add("White");
        set.add("Black");
        System.out.println(set);
        TreeSet<String> setClone = new TreeSet<>();
        setClone.addAll(set);
        System.out.println(setClone);
    }
}
