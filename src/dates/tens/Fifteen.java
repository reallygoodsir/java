package dates.tens;

import java.time.LocalTime;
import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Current time: " + time);
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHow many hours would you like to add to the current time?");
        int add = scanner.nextInt();
        time.plusHours(add);
        System.out.println("New time: " + time);
    }
}
