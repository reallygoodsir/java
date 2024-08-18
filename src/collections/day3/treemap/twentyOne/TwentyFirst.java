package collections.day3.treemap.twentyOne;

import java.util.SortedMap;
import java.util.TreeMap;

public class TwentyFirst {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        SortedMap< Integer, String > subMap;
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(5, "White");
        map.put(4, "Blue");
        subMap = map.subMap(1, 4);
        System.out.println(subMap);
    }
}
