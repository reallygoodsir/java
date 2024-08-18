package collections.day2.treeSet.three;

import java.util.TreeSet;

public class Third {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Orange");
        set.add("White");
        set.add("Black");
        TreeSet<String> set2 = new TreeSet<>();
        set2.add("Currently");
        set2.add("Adding");
        set2.add("This");
        set2.add("Somewhere");
        set2.add("Else");
        System.out.println(set);
        set.addAll(set2);
        System.out.println(set);
    }
}
