package oop.ten;

import java.util.ArrayList;

public class AppStudent {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<String>();
        courses.add("Algebra");
        courses.add("Physics");
        courses.add("English");
        courses.add("Geometry");
        Student student1 = new Student("Peter", 85, courses);
        student1.showCollection();
        student1.addCourse("History");
        student1.showCollection();
        student1.removeCourse(1);
        student1.showCollection();
    }
}
