package scjp.generics.example5.task15;

import java.util.ArrayList;
import java.util.List;

public class FilterUtils {
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<T>();
        for (T item : list) {
            if (predicate.test(item)) result.add(item);
        }
        return result;
    }

    public interface Predicate<T> {
        boolean test(T t);
    }
}

