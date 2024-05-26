package exceptions.two;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if((num % 2) != 0){
            throw new Exception("odd number");
        }
        System.out.println("even number");
    }
}
