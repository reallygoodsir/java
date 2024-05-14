package sevenDays.OOP.six;

import java.util.Scanner;

class Employee {
    String name;
    String jobTitle;
    int salary;

    public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    void calcSalary(int salary){
        System.out.println(salary);
    }
    void updateSalary(int salary){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to increase or decrease the salary?\n 1 to increase\n 2 to decrease\n 9 to cancel");
        int choice = scanner.nextInt();
        if(choice == 1){
            System.out.println("By how much cash would you like to increase it?");
            int add = scanner.nextInt();
            salary = salary + add;
            System.out.println("New salary: " + salary);
        }
        else if(choice == 2){
            System.out.println("By how much cash would you like to decrease it?");
            int decrease = scanner.nextInt();
            salary = salary + decrease;
            System.out.println("New salary: " + salary);
        }
        else{

        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Igor", "Employee", 24000);
        employee1.updateSalary(employee1.salary);
    }
}
