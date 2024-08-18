package streams.seven;

import java.util.Arrays;
import java.util.List;

public class Seventh {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);


        Integer maximum = numbers.stream()
                .max(Integer::compare)
                        .orElse(null);

        System.out.println(maximum);
        Integer minimum = numbers.stream()
                .min(Integer::compare)
                .orElse(null);

        System.out.println(minimum);
    }
}
