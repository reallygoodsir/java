package scjp.collections.treeset.task3;

import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(7);
        set.add(4);
        set.add(22);
        set.add(11);
        set.add(85);
        set.add(65);
        set.add(75);
        set.add(83);
        set.add(86);
        System.out.println(set.subSet(70, 90));
    }
}
