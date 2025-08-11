package scjp.collections.map.treemap.task4;

import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "George");
        map.put(2, "Francis");
        map.put(3, "Leviticus");
        map.put(4, "Frank");

        System.out.println(map);
        System.out.println(map.descendingMap());
    }
}
