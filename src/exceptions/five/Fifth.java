package exceptions.five;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        try{
            readFile("C:\\Users\\tymur\\OneDrive\\Desktop\\vcds.txt");
            System.out.println("all good");
        }catch (Exception exception){
            System.out.println("positive number (exception message: \"" + exception.getMessage() + "\")");
        }
    }

    public static void readFile(String fileName) throws Exception {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        boolean exception = true;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(line);
            for (int i = 0; i < numbers.size(); i++) {
                if (!(line.isEmpty())) {
                    exception = false;
                }
            }
        }
        if(exception){
            throw new Exception("CRAZY ERROR");
        }
    }
}
