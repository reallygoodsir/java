package collections.day2.hashSet.one;

import java.util.HashSet;

public class First {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String specified = "Yellow";
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add(specified);
        System.out.println("The Hash Set: " + set);
    }
}
