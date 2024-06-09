package io.seventeen;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class Seventeenth {

    public static void main(String a[]){
        BufferedReader buffReader = null;
        String line = "";
        try {
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("C:\\test\\fourlines.txt"), "UTF-8"));
            while (((line = reader.readLine()) != null) && reader.getLineNumber() <= 3){
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            System.err.println("error");
        }
    }
}
