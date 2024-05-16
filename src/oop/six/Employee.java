package oop.six;

import java.util.Scanner;

public class Employee {
    String name;
    String jobTitle;
    int salary;

    public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    void showSalary() {
        System.out.println("New salary: " + salary);
    }

    void updateSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to increase or decrease the salary?\n 1 to increase\n 2 to decrease\n 9 to cancel");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("By how much cash would you like to increase it?");
            int add = scanner.nextInt();
            this.salary = this.salary + add;
        } else if (choice == 2) {
            System.out.println("By how much cash would you like to decrease it?");
            int decrease = scanner.nextInt();
            this.salary = this.salary - decrease;
        }
    }
}
