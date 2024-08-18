package collections.day3.treemap.fifteen;

import java.util.TreeMap;

public class Fifteenth {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");
        System.out.println(map.higherEntry(2));
    }
}
