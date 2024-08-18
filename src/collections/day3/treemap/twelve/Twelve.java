package collections.day3.treemap.twelve;

import java.util.TreeMap;

public class Twelve {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(6, "Blue");
        System.out.println(map.floorKey(5));
    }
}
