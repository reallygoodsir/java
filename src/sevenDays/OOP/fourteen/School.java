package sevenDays.OOP.fourteen;

import java.util.ArrayList;

public class School {
    private String teacher;
    private String student;
    private String classs;
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Class> classes = new ArrayList<>();

    void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    void removeTeacher(int index){
        teachers.remove(index);
    }

    void addStudent(Student student){
        students.add(student);
    }
    void removeStudent(int index){
        teachers.remove(index);
    }

    void addClass(Class classs){
        classes.add(classs);
    }
}
