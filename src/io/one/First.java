package io.one;

import java.io.File;

public class First {
    public static void main(String a[])
    {
        File file = new File("C:\\test\\");
        File[] files = file.listFiles();
        if (files != null) {
            for (File currentFile : files) {
                System.out.println(currentFile.getName());
            }
        }
    }
}
