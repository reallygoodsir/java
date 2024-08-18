package collections.day3.hashmap.three;

import java.util.HashMap;

public class Third {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(66, "aa");
        map2.put(22, "aazx");
        map2.put(65, "bvc");
        map2.put(97, "opp");
        map2.put(8, "vvv");
        map.putAll(map2);
        System.out.println(map);
    }
}
