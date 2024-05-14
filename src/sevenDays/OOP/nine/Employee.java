package sevenDays.OOP.nine;

public class Employee {
    private String name;
    private int salary;
    private int hireDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHireDate() {
        return hireDate;
    }

    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }

    public Employee(String name, int salary, int hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    void serviceYears(int hireDate){
        if((2024 - hireDate) <= 0){
            System.out.println("The employee has been working here for less than a year");
        }
        else if((2024 - hireDate) == 1){
            System.out.println("The employee has been working here for a year");
        }
        else{
            System.out.println("The employee has been working here for " + (2024 - hireDate) + " year(s)");
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Jack", 25000, 2023);
        employee1.serviceYears(employee1.getHireDate());
    }
}
