package exceptions.seven;

import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) throws Exception {
        fivepercenttint();
    }

    public static void fivepercenttint() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String sumn = scanner.next();
        char[] array = new char[sumn.length()];
        for (int i = 0; i < sumn.length(); i++) {
            array[i] = sumn.charAt(i);
        }
        boolean hasVowel = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a' || array[i] == 'e' || array[i] == 'i'
                    || array[i] == 'o' || array[i] == 'u' || array[i] == 'y') {
                hasVowel = true;
            }
        }
        if (!hasVowel) {
            throw new Exception("STRING CONTAINS NO VOWELS");
        }
    }
}
