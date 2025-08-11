package scjp.collections.map.treemap.task1;

import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("George", "17231289");
        map.put("Pete", "15328432");
        map.put("Algiers", "794294197");


        String string = map.get("George");
        System.out.println(string);

        System.out.println(map);
    }
}
