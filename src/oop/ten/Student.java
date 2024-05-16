package oop.ten;

import java.util.ArrayList;

public class Student {
    private String name;
    private float grade;
    private ArrayList<String> courses;

    public Student(String name, float grade, ArrayList courses) {
        this.name = name;
        this.grade = grade;
        this.courses = courses;
    }

    void addCourse(String name) {
        courses.add(name);
    }

    void removeCourse(int index) {
        courses.remove(index);
    }

    void showCollection() {
        System.out.println(courses);
    }
}
