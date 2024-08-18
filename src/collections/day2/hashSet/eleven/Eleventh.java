package collections.day2.hashSet.eleven;

import java.util.HashSet;

public class Eleventh {
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
        set2.add("Black");
        set2.add("Grey");
        set2.add("Purple");
        set2.add("Yellow");
        System.out.println(set);
        set.retainAll(set2);
        System.out.println(set);
    }
}
