package scjp.collections.comparator.task2;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        Integer length1 = o1.length();
        Integer length2 = o2.length();
        return length1.compareTo(length2);
    }
}
