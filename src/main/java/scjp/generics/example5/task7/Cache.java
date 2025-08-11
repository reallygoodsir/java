package scjp.generics.example5.task7;

import java.util.HashMap;
import java.util.Map;

public class Cache<K, V> {
    private Map<K, V> store = new HashMap<>();

    public void put(K key, V value) {
        store.put(key, value);
    }

    public V get(K key) {
        return store.get(key);
    }

    public boolean containsKey(K key) {
        return store.containsKey(key);
    }
}

