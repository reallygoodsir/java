package collections.day3.hashmap.sevenAndEight;

import java.util.HashMap;

public class SeventhAndEighth {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");
        System.out.println(map.containsKey(22));
        System.out.println(map.containsValue("White"));
    }
}
