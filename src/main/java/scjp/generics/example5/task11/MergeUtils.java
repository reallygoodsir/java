package scjp.generics.example5.task11;

import java.util.HashMap;
import java.util.Map;

public class MergeUtils {
    public static <K, V> Map<K, V> merge(Map<K, V> a, Map<K, V> b) {
        Map<K, V> result = new HashMap<K, V>(a);
        result.putAll(b);
        return result;
    }
}

