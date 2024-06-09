package io.five;

import java.io.File;

public class Fifth {
    public static void main(String[] args) {
        File file = new File("C:\\test\\test.txt");
        if (file.isDirectory()) {
            System.out.println("directory");
        } else {
            System.out.println("not directory");
        }
        if (file.isFile()) {
            System.out.println("file");
        } else {
            System.out.println("not file");
        }
    }
}
