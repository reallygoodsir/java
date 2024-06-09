package io.ten;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Tenth {
    public static void main(String a[]) {
        String file_name = "C:\\test\\test.txt";
        InputStream input = null;
        try {
            input = new FileInputStream(file_name);
            byte file_content[] = new byte[2 * 1024];
            int read_count = 0;
            while ((read_count = input.read(file_content)) > 0) {
                System.out.println(new String(file_content, 0, read_count));
            }
        } catch (IOException e) {
            System.err.println("error");
        } finally {
            try {
                if (input != null) input.close();
            } catch (Exception ex) {
                System.err.println("error");
            }
        }
    }
}
