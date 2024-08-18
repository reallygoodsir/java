package collections.day2.treeSet.nine;

import java.util.TreeSet;

public class Ninth {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(15);
        set.add(22);
        set.add(3500);
        set.add(2);
        set.add(6);
        set.add(7);
        for (Integer i : set) {
            if(i < 7){
                System.out.println(i);
            }
        }
    }
}
