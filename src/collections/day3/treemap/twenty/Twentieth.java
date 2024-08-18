package collections.day3.treemap.twenty;

import java.util.TreeMap;

public class Twentieth {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(5, "White");
        map.put(4, "Blue");
        System.out.println(map.pollLastEntry());
    }
}
