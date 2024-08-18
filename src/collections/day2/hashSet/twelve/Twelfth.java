package collections.day2.hashSet.twelve;

import java.util.HashSet;

public class Twelfth {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");
        set.removeAll(set);
        System.out.println(set);
    }
}
