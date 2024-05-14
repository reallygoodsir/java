package sevenDays.abstractStuff.five;

abstract class Employee {
    abstract void calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    void calculateSalary(){
        System.out.println("calculating MANAGER salary");
    }
    void displayInfo(){
        System.out.println("displaying MANAGER info");
    }
}


class Programmer extends Employee {
    void calculateSalary(){
        System.out.println("calculating PROGRAMMERS salary");
    }
    void displayInfo(){
        System.out.println("displaying PROGRAMMERS info");
    }

    public static void main(String[] args) {
        Employee manager = new Manager();
        manager.calculateSalary();
        manager.displayInfo();
        System.out.println();
        Employee programmer = new Programmer();
        programmer.calculateSalary();
        programmer.displayInfo();
    }
}
