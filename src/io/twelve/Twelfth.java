package io.twelve;

import java.io.BufferedReader;
import java.io.FileReader;

public class Twelfth {
    public static void main(String a[]){
        StringBuilder print = new StringBuilder();
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\test\\test.txt"));
            while (line != null)
            {
                print.append(line);
                line = reader.readLine();
                print.append(System.lineSeparator());
            }
            reader.close();
        } catch (Exception e) {
            System.err.print("error");
        }
        System.out.print(print);
    }
}
