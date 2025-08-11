package scjp.collections.map.task4;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        System.out.println(map);

        Map<Integer, String> newMap = new HashMap<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            newMap.put(stringIntegerEntry.getValue(), stringIntegerEntry.getKey());
        }
        System.out.println(newMap);
    }
}
