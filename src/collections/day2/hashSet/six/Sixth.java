package collections.day2.hashSet.six;

import java.util.HashSet;

public class Sixth {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");
        HashSet<String> setClone = new HashSet<>();
        setClone.addAll(set);
        System.out.println("Original: " + set);
        System.out.println("Clone: " + setClone);
    }
}
