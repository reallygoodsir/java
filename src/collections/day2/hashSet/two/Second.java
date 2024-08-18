package collections.day2.hashSet.two;

import java.util.HashSet;

public class Second {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");
        for (String line : set) {
            System.out.println(line);
        }
    }
}
