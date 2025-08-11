package scjp.generics.example5.task8;

import java.util.List;

public class SearchUtils {
    public static <T> boolean contains(List<T> list, T element) {
        for (T item : list) {
            if (item.equals(element)) return true;
        }
        return false;
    }
}

