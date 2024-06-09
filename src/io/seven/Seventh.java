package io.seven;

import java.io.File;
import java.util.Date;

public class Seventh {
    public static void main(String[] args) {
        File file = new File("C:\\test\\test.txt");
        Date date=new Date(file.lastModified());
        System.out.println(date);
    }
}
