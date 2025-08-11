package scjp.collections.map.task1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        String string1 = "apple is apple tree shop wow how it is is";
        Map<String, Integer> result1 = parse(string1);

        System.out.println(result1);

    }

    private static Map<String, Integer> parse(String input) {
        if (input == null || input.isEmpty()) {
            return Collections.emptyMap();
        } else {
            String[] s = input.split(" ");
            Map<String, Integer> map = new HashMap<>();
            for (String string1 : s) {
                if(map.containsKey(string1)){
                    map.replace(string1, map.get(string1) + 1);
                }else {
                    map.put(string1, 1);
                }
            }
            return map;
        }
    }
}
