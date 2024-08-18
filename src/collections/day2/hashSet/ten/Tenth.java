package collections.day2.hashSet.ten;

import java.util.HashSet;

public class Tenth {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");
        HashSet<String> set2 = new HashSet<>();
        set2.add("Red");
        set2.add("Green");
        set2.add("Orange");
        set2.add("White");
        set2.add("Pink");
        set2.add("Yellow");

        System.out.println(set.equals(set2));
    }
}
