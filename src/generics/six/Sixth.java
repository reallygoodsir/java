package generics.six;

import java.util.HashMap;
import java.util.Map;

public class Sixth {
    public static < K, V > void printMap(Map < K, V > map) {
        for (Map.Entry < K, V > entry: map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));
        printMap(hm);
    }
}
