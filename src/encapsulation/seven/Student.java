package encapsulation.seven;

import java.util.ArrayList;

public class Student {
    private int student_id;
    private String student_name;
    private ArrayList<Integer> grades = new ArrayList<Integer>();

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    void addGrade(Integer grade){
        if(grade != null && grade < 13 && grade > 1) {
            grades.add(grade);
        }
    }
}
