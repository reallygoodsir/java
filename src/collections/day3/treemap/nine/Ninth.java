package collections.day3.treemap.nine;

import java.util.TreeMap;

public class Ninth {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(2, "Red");
        map.put(1, "Green");
        map.put(3, "Black");
        map.put(5, "White");
        map.put(4, "Blue");
        System.out.println(map.firstEntry());
        System.out.println(map.lastKey());
    }
}
