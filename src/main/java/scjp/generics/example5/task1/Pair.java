package scjp.generics.example5.task1;

public class Pair<M, V> {
    private M key;
    private V value;

    public Pair(M key, V value) {
        this.key = key;
        this.value = value;
    }

    public M getKey() { return key; }
    public V getValue() { return value; }
}
