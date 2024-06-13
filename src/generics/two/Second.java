package generics.two;

import java.util.Arrays;
import java.util.List;

public class Second {
    public static <T extends Number> void calculateNumberSum(List<T> numbers) {
        double evenSum = 0;
        double oddSum = 0;

        for (T number : numbers) {
            if (number.doubleValue() % 2 == 0) {
                evenSum += number.doubleValue();
            } else {
                oddSum += number.doubleValue();
            }
        }
        System.out.println("evens: " + evenSum + "\nodds: " + oddSum);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        calculateNumberSum(integers);
    }
}
