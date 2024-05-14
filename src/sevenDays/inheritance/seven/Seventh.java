package sevenDays.inheritance.seven;

import java.util.Scanner;

class Person{
    void getFirstName(){
        System.out.println("Name");
    }
    void getLastName(){
        System.out.println("Surname");
    }
}


class Employee extends Person{
    String empId = "";
    void getEmployeeId(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("get employee id: ");
        String id = scanner.next();
        empId = id;
    }

    void getLastName(){
        System.out.println("Surname " + empId);
    }

    public static void main(String[] args) {
        Employee a = new Employee();
        a.getEmployeeId();
        a.getLastName();
    }
}
