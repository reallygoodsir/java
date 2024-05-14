package sevenDays.OOP.ten;

import java.util.ArrayList;

public class AppStudent {
    public static void main(String[] args) {
        ArrayList<String> student1Array = new ArrayList<String>();
        student1Array.add("Algebra");
        student1Array.add("Physics");
        student1Array.add("English");
        student1Array.add("Geometry");
        Student student1 = new Student("Peter", 85, student1Array);
        student1.showCollection();
        student1.addCourse("History");
        student1.showCollection();
        student1.removeCourse(1);
        student1.showCollection();
    }
}
