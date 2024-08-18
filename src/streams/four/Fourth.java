package streams.four;

import java.util.Arrays;
import java.util.List;

public class Fourth {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 1, 3, 5);
        List<Integer> something = Arrays.asList();
        numbers.stream()
                .filter(n -> !something.contains(n))
                .distinct()
                .forEach(System.out::println);

    }
}
