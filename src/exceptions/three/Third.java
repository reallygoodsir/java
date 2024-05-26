package exceptions.three;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        try{
            readFile("C:\\Users\\crazyman\\OneDrive\\Desktop\\doesntExist.txt");
        }catch (FileNotFoundException exception){
            System.out.println("no file");
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        // Read and process the contents of the file
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
}
