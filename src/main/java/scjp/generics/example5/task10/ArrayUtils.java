package scjp.generics.example5.task10;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {
    public static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<T>();
        for (T item : array) {
            list.add(item);
        }
        return list;
    }
}

