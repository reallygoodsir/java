package scjp.generics.example5.task6;

import java.util.HashMap;
import java.util.Map;

public class MapUtils {
    public static <K, V> Map<K, V> filterByValue(Map<K, V> map, Predicate<V> predicate) {
        Map<K, V> result = new HashMap<K, V>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (predicate.test(entry.getValue())) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }

    public interface Predicate<T> {
        boolean test(T t);
    }
}

