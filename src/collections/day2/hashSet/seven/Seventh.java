package collections.day2.hashSet.seven;

import java.util.HashSet;

public class Seventh {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");
        String[] new_array = new String[set.size()];
        set.toArray(new_array);
        for (String line : new_array) {
            System.out.println(line);
        }
    }
}
