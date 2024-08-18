package collections.day3.treemap.two;

import java.util.TreeMap;

public class Second {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");
        TreeMap<Integer,String> map2= (TreeMap<Integer, String>) map.clone();
        System.out.println(map2);
    }
}
