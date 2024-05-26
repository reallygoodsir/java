package exceptions.five;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        try {
            readFile("C:\\Users\\tymur\\OneDrive\\Desktop\\vcds.txt");
            System.out.println("all good");
        } catch (Exception exception) {
            System.out.println("(exception message: \"" + exception.getMessage() + "\")");
        }
    }

    public static void readFile(String fileName) throws Exception {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        boolean isEmpty = true;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            if (!line.isEmpty()) {
                isEmpty = false;
                System.out.println("before break");
                break;
            }
            System.out.println("in while");
        }
        if (isEmpty) {
            throw new Exception("CRAZY ERROR");
        }
    }
}
