package scjp.generics.example5.task12;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConversionUtils {
    public static <T> Set<T> toSet(List<T> list) {
        return new HashSet<T>(list);
    }
}

