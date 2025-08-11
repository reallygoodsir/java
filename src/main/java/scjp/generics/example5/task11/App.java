package scjp.generics.example5.task11;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "one");
        map1.put(2, "two");
        map1.put(3, "three");
        map1.put(4, "four");
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(5, "five");
        map2.put(6, "six");
        map2.put(7, "seven");
        map2.put(8, "eight");
        Map<Integer, String> mergedMaps = MergeUtils.merge(map1, map2);
        for (Map.Entry<Integer, String> integerStringEntry : mergedMaps.entrySet()) {
            System.out.println(integerStringEntry);
        }
    }
}
