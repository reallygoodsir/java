package io.eighteen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Eighteenth {
    public static void main(String [] args) throws FileNotFoundException {
        String something = new Eighteenth().findLongestWords();
    }

    public String findLongestWords() throws FileNotFoundException {

        String longestWord = "";
        String current;
        Scanner sc = new Scanner(new File("C:\\test\\test.txt"));
        while (sc.hasNext()) {

            current = sc.next();
            if (current.length() > longestWord.length()) {
                longestWord = current;
            }

        }
        System.out.println(longestWord);
        return longestWord;
    }
}
