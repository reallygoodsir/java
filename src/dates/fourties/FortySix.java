package dates.fourties;

import java.util.Scanner;

public class FortySix {
    public static void main(String[] args) {
        int days = 0;
        Scanner years = new Scanner(System.in);
        System.out.println("First year ");
        int firstYear = years.nextInt();

        System.out.println("Second year ");
        int secondYear = years.nextInt();
        if (firstYear < secondYear) {
            if ((secondYear % 4) == 0) {
                days += 366;
            } else {
                days += 365;
            }
            while (firstYear < secondYear) {
                if ((firstYear % 4) == 0) {
                    days += 366;
                    firstYear += 1;
                } else {
                    days += 365;
                    firstYear += 1;
                }
            }
        } else {
            if ((firstYear % 4) == 0) {
                days += 366;
            } else {
                days += 365;
            }
            while (firstYear > secondYear) {
                if ((secondYear % 4) == 0) {
                    days += 366;
                    secondYear += 1;
                } else {
                    days += 365;
                    secondYear += 1;
                }
            }
        }
        System.out.println("\n" + (days - 365));
    }
}
