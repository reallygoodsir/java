package scjp.generics.example5.task5;

import java.util.List;

public class ListUtils {
    public static <T> void copy(List<? super T> dest, List<? extends T> src) {
        for (T item : src) {
            dest.add(item);
        }
    }
}

