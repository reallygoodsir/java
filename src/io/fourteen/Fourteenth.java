package io.fourteen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Fourteenth {
    public static void main(String a[]){
        String line = "";
        List<String> list = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\test\\test.txt"));

            while (line != null)
            {

                line = reader.readLine();
                if (line==null){
                    break;
                }
                list.add(line);
            }
            System.out.println(Arrays.toString(list.toArray()));
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
