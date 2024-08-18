package streams.two;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("this, cOnvert, upperCCase, something, WHAT");
        Scanner scanner = new Scanner(System.in);
        System.out.println("print \"1\" for uppercase, \"2\" for lowercase.");
        int answer = scanner.nextInt();
        if (answer == 1) {
            numbers.stream()
                    .map(n -> n.toUpperCase())
                    .forEach(System.out::println);

        }
        else {
            numbers.stream()
                    .map(n -> n.toLowerCase())
                    .forEach(System.out::println);

        }
    }
}
