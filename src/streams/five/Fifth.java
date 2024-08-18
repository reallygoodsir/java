package streams.five;

import java.util.Arrays;
import java.util.List;

public class Fifth {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1this", "cOnvert", "1upperCCase", "441something", "WHAT");
        list.stream()
                .filter(n -> n.startsWith("1"))
                .forEach(System.out::println);
    }
}
