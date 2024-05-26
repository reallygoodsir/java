package exceptions.four;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        try {
            readFile("C:\\Users\\tymur\\OneDrive\\Desktop\\vcds.txt");
        } catch (Exception exception) {
            System.out.println("positive number (exception message: \"" + exception.getMessage() + "\")");
        }
    }

    public static void readFile(String fileName) throws Exception {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        // Read and process the contents of the file
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int value = Integer.parseInt(line);
            //System.out.println(value);
            if (value > 0) {
                throw new Exception("CRAZY ERROR");
            }
        }
    }

//    public static void readFile(String fileName) throws Exception {
//        File file = new File(fileName);
//        Scanner scanner = new Scanner(file);
//        ArrayList<Integer> integers = new ArrayList<>();
//        // Read and process the contents of the file
//        while (scanner.hasNextLine()) {
//            String line = scanner.nextLine();
//            integers.add(Integer.parseInt(line));
//        }
//
//        for (Integer integer : integers) {
//            System.out.println(integer);
//            if (integer > 0) {
//                throw new Exception("CRAZY ERROR");
//            }
//        }
//    }
}
