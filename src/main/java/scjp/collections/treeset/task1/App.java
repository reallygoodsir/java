package scjp.collections.treeset.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        String filePath = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            Set<String> treeSet = new TreeSet<>();
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        treeSet.add(word);
                    }
                }
            }
            System.out.println(treeSet);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
