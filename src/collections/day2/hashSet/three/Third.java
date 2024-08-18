package collections.day2.hashSet.three;

import java.util.HashSet;

public class Third {
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
        System.out.println(set.size());
    }
}
