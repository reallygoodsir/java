package scjp.collections.set.task4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        String string = new String("the apple went to the barbershop");
        String[] s = string.split(" ");
        Set<String> set = new HashSet<>(Arrays.asList(s));
        for (String string1 : set) {
            System.out.println(string1);
        }
    }
}
