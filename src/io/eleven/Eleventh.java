package io.eleven;

import java.io.BufferedReader;
import java.io.FileReader;

public class Eleventh {
    public static void main(String a[]) {
        BufferedReader reader;
        String line;
        try {
            reader = new BufferedReader(new FileReader("C:\\test\\fourlines.txt"));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            System.err.println("error");
        }
    }
}
