package streams.three;

import java.util.Arrays;
import java.util.List;

public class Third{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);


        int sum = numbers.stream()
                .reduce(0, Integer::max);

        System.out.println(sum);
    }
}