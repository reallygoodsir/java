//package inheritance.ten;
//
//public class Programmer extends Employee {
//    public Programmer(String name, String address, double salary, String programmingLanguage) {
//        super(name, address, salary, programmingLanguage);
//    }
//
//    @Override
//    public double calculateBonus() {
//        // Custom implementation for bonus calculation for programmers
//        return getSalary() * 0.12;
//    }
//
//    @Override
//    public String generatePerformanceReport() {
//        // Custom implementation for performance report for programmers
//        return "Performance report for Programmer " + getName() + ": Excellent";
//    }
//
//    public void debugCode() {
//        // Custom method for debugging code
//        System.out.println("Programmer " + getName() + " is debugging code in ");
//    }
//}