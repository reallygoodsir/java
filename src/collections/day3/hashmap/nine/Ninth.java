package collections.day3.hashmap.nine;

import java.util.HashMap;
import java.util.Set;

public class Ninth {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");
        Set set = map.entrySet();
        System.out.println(set);
    }
}
