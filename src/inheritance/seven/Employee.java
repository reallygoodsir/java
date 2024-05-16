package inheritance.seven;

import java.util.Scanner;


public class Employee extends Person {
    String empId = "";

    void getEmployeeId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("get employee id: ");
        String id = scanner.next();
        empId = id;
    }

    void getLastName() {
        System.out.println("Surname " + empId);
    }
}
