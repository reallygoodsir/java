package io.thirteen;

import java.io.BufferedReader;
import java.io.FileReader;

public class Thirteenth {
    public static void main(String a[]) {
        StringBuilder print = new StringBuilder();
        String line = "";
        String data = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\test\\test.txt"));
            while (line != null) {
                data += line;
                line = reader.readLine();
                data += "\n";
            }
            System.out.println(data);
            print.append(data);

            reader.close();
        } catch (Exception e) {
            System.err.println("error");
        }
    }
}
