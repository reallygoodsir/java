package io.four;

import java.io.File;

public class Fourth {
    public static void main(String[] args) {
        File file = new File("c:\\test\\test.txt");
        if (file.canWrite()) {
            System.out.println("can write");
        } else {
            System.out.println("cant write");
        }
        if (file.canRead()) {
            System.out.println("can read");
        } else {
            System.out.println("cant read");
        }
    }
}
