package collections.day2.hashSet.five;

import java.util.HashSet;

public class Fifth {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");
        System.out.println(set.isEmpty());
    }
}
