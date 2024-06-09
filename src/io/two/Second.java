package io.two;

import java.nio.file.Path;
import java.nio.file.Paths;
public class Second {
    public static String getExtension(Path path) {
        String file = path.getFileName().toString();
        int index = file.lastIndexOf('.');
        if (index == -1 || index == file.length() - 1) {
            System.out.println("no extension");
            return "";
        } else {
            System.out.println(file.substring(index + 1));
            return file.substring(index + 1);
        }
    }
    public static void main(String[] args) {
        Path file = Paths.get("C:\\test\\test.txt");
        System.out.println(getExtension(file));
    }
}
