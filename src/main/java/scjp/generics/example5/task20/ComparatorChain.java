package scjp.generics.example5.task20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorChain<T> implements Comparator<T> {
    private List<Comparator<T>> comparators = new ArrayList<Comparator<T>>();

    public void addComparator(Comparator<T> comparator) {
        comparators.add(comparator);
    }

    public int compare(T o1, T o2) {
        for (Comparator<T> comparator : comparators) {
            int result = comparator.compare(o1, o2);
            if (result != 0) return result;
        }
        return 0;
    }
}

