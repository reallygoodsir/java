package scjp.collections.map.task2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        String string1 = "apple";
        Map<Character, Integer> result1 = parse(string1.trim());

        System.out.println(result1);

    }

    private static Map<Character, Integer> parse(String input) {
        if (input == null || input.isEmpty()) {
            return Collections.emptyMap();
        } else {
            char[] s = input.toCharArray();
            Map<Character, Integer> map = new HashMap<>();
            for (char c : s) {
                if(map.containsKey(c)){
                    map.replace(c, map.get(c) + 1);
                }else {
                    map.put(c, 1);
                }
            }
            return map;
        }
    }
}
