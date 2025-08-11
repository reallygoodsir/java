package scjp.generics.example5.task19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseUtils {
    public static <T> List<T> reverse(List<T> list) {
        List<T> result = new ArrayList<T>(list);
        Collections.reverse(result);
        return result;
    }
}

