package dates.tens;

import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year ");
        int year = sc.nextInt();
        if((year % 4) == 0 ){
            System.out.println("leap");
        }
        else {
            System.out.println("not leap");
        }
    }
}
