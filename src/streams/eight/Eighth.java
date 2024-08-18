package streams.eight;

import java.util.Arrays;
import java.util.List;

public class Eighth {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Integer secondBiggest = numbers.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b, a))
                .skip(1)
                .findFirst()
                .orElse(null);
        Integer secondSmallest = numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(secondBiggest);
        System.out.println(secondSmallest);
    }
}
