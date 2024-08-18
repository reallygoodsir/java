package collections.day3.treemap.twentyFour;

import java.util.TreeMap;

public class TwentyFourth {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(5, "White");
        map.put(4, "Blue");
        System.out.println(map.tailMap(2, false));
    }
}
