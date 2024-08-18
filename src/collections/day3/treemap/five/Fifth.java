package collections.day3.treemap.five;

import java.util.TreeMap;

public class Fifth {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");
        System.out.println(map.keySet());
    }
}
