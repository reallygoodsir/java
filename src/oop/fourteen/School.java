package oop.fourteen;

import java.util.ArrayList;

public class School {
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<Class> classes;

    public School() {
        this.students = new ArrayList<Student>();
        this.teachers = new ArrayList<Teacher>();
        this.classes = new ArrayList<Class>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public void addClass(Class Class) {
        classes.add(Class);
    }

    public void removeClass(Class Class) {
        classes.remove(Class);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }
}
