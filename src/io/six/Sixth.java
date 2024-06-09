package io.six;

import java.io.File;

public class Sixth {
    public static void main(String[] args) {
        File file1 = new File("C:\\test\\test.txt");
        File file2 = new File("C:\\test\\anothertest.txt");
        int difference;
        if (file1.compareTo(file2) > file2.compareTo(file1)) {
            difference = file1.compareTo(file2);
        } else {
            difference = file2.compareTo(file1);
        }
        System.out.println(difference);

    }
}
