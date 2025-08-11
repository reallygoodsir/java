package scjp.generics.example5.task18;

import java.util.ArrayList;
import java.util.List;

public class FlattenUtils {
    public static <T> List<T> flatten(List<List<T>> lists) {
        List<T> result = new ArrayList<T>();
        for (List<T> list : lists) {
            result.addAll(list);
        }
        return result;
    }
}

