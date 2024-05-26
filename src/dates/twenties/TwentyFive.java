package dates.twenties;

import java.util.Scanner;

public class TwentyFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year ");
        int year = sc.nextInt();
        System.out.println("Current year: " + year);
        boolean leap = false;
        if((year % 4) == 0 ){
            leap = true;
            System.out.println("Is the current year a leap year? " + leap);
            System.out.println("Length of the year: 366 days");
        }
        else {
            System.out.println("Is the current year a leap year?" + leap);
            System.out.println("Length of the year: 365 days");
        }
    }
}
