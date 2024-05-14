package sevenDays.inheritance.ten;

class Employee {
    static String name;
    static String address;
    static int salary;
    static String jobTitle;

    void calculateBonus(){
        System.out.println("calculating bonus");
    }
    void performanceReport(){
        System.out.println("generating performance reports");
    }
    void manageProjects(){
        System.out.println("managing projects");
    }
}

class Truck extends Employee {
    public static void main(String[] args) {
        name = "Ford";
        address = "Trucky";
        salary = 1977;
        jobTitle = "Diesel";
    }
}

class Car extends Employee {
    public static void main(String[] args) {
        name = "Tesla";
        address = "Something";
        salary = 2011;
        jobTitle = "Electric";
    }
}

class Motorcycle extends Employee {
    public static void main(String[] args) {
        name = "Trucky";
        address = "Truckily";
        salary = 1977;
        jobTitle = "Gas";
    }
}