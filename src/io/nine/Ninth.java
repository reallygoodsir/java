package io.nine;

import java.io.File;

public class Ninth {
    public static void main(String[] args) {
        File file = new File("C:\\test\\test.txt");
        if (file.exists()) {
            double bytes = file.length();
            double kilobytes = (bytes / 1024);
            double megabytes = (kilobytes / 1024);

            System.out.println("bytes : " + bytes);
            System.out.println("kilobytes : " + kilobytes);
            System.out.println("megabytes : " + megabytes);
        }
        else {
            System.out.println("File doesnt exist");
        }
    }
}
