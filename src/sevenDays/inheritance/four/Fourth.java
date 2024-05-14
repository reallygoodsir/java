package sevenDays.inheritance.four;

class Employee {
    void work(){
        System.out.println("employee working");
    }
    void getSalary(){
        System.out.println("getting salary");
    }
}


class HRManager extends Employee{
    void work(){
        System.out.println("manager working");
    }

    void addEmployee() {
        System.out.println("adding a new employee");
    }

    public static void main(String[] args) {
        Employee employeeTest = new Employee();
        employeeTest.work();
        employeeTest.getSalary();

        System.out.println("\n");

        HRManager test = new HRManager();
        test.work();
        test.addEmployee();
    }
}