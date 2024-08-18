package collections.day2.hashSet.nine;

import java.util.HashSet;

public class Ninth {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(15);
        set.add(22);
        set.add(3500);
        set.add(2);
        set.add(6);
        set.add(7);
        System.out.println("Numbers less than 7 in the hashset: ");
        for (Integer i : set) {
            if(i < 7){
                System.out.println(i);
            }
        }
    }
}
