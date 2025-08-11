package scjp.generics.example5.task20;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("pear", "apple", "fig", "banana", "date");

        ComparatorChain<String> chain = new ComparatorChain<String>();
        chain.addComparator(new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length()); // sort by length
            }
        });
        chain.addComparator(new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2); // if length is same, sort alphabetically
            }
        });

        Collections.sort(words, chain);

        System.out.println("Sorted: " + words);
    }
}
