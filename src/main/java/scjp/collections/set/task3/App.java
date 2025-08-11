package scjp.collections.set.task3;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        String string = new String("Apple");
        Set<Character> set = stringToCharacters(string);

        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : set) {
            System.out.println(c);
            stringBuilder.append(c);
        }
        System.out.println("\n" + stringBuilder);
    }

    public static Set<Character> stringToCharacters(String string) {
        char[] charArray = string.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : charArray) {
            set.add(c);
        }
        return set;
    }
}
