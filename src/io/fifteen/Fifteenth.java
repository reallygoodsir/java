package io.fifteen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Fifteenth {
    public static void main(String a[]) {
        String line = "";
        try {
            String fileName = "C:\\test\\plain.txt";
            FileWriter writer = new FileWriter(fileName, false);
            writer.write("wrote the plain file");
            writer.close();
            BufferedReader reader = new BufferedReader(new FileReader("C:\\test\\plain.txt"));
            while (line != null) {
                line = reader.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            System.err.println("error");
        }
    }
}
