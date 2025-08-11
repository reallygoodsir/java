package streams.example1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .filter(n -> {
                    System.out.println("In filter " + n);
                    System.out.println("In filter " + (n % 2 == 1));
                    return n % 2 == 1;
                })
                .map(n -> {
                    System.out.println("In map multiple" + n);
                    return n * n;
                })
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}

//1
//filter returns true
//map return 1 * 1
//sum = 0 + 1 = 1
//
//2
//filter returns false
//map will not be executed because filter returned false
//sum will not be called because map was not called
//
//3
//filter returns true
//map return 3 * 3
//sum = 1 + 9 = 10
//
//4
//filter returns false
//map will not be executed because filter returned false
//sum will not be called because map was not called
//
//5
//filter returns true
//map return 5 * 5
//sum = 10 + 25 = 35



