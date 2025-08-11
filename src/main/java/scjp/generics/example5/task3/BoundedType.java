package scjp.generics.example5.task3;

public class BoundedType {
    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;
        return max;
    }
}

