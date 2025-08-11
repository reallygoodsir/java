package scjp.collections.comparator.task5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] s1 = o1.split(" ");
        Collections.reverse(Arrays.asList(s1));

        String[] s2 = o2.split(" ");
        Collections.reverse(Arrays.asList(s2));

        return s1[0].compareTo(s2[0]);
    }
}
