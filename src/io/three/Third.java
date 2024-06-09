package io.three;

import java.io.File;

public class Third {
    public static void main(String[] args) {
        File file = new File("C:\\test\\test.txt");
        if (file.exists()) {
            System.out.println("The directory/file exists");
        } else {
            System.out.println("The directory/file doesnt exist");
        }
    }
}
