package collections.day2.hashSet.four;

import java.util.HashSet;

public class Fourth {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");
        System.out.println(set);
        set.clear();
        System.out.println(set);
    }
}
