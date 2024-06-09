package io.sixteen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Sixteenth {
    public static void main(String a[]){
        StringBuilder print = new StringBuilder();
        String line = "";
        try
        {
            String filename= "C:\\test\\anothertest.txt";
            FileWriter writer = new FileWriter(filename,true);
            writer.write("and more text ");
            writer.close();
            BufferedReader reader = new BufferedReader(new FileReader("C:\\test\\anothertest.txt"));
            while (line != null)
            {

                print.append(line);
                print.append(System.lineSeparator());
                line = reader.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
            }
            reader.close();
        }
        catch(Exception e)
        {
            System.err.println("error");
        }
    }
}
