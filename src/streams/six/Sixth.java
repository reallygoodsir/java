package streams.six;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sixth {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("aas", "zlast", "cool", "bear");

        numbers.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("\nReverse order: ");
        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
