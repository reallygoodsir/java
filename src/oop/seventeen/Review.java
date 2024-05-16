package oop.seventeen;

public class Review {
    private int grade;
    private String reviewer;
    private int date;

    public Review(int grade, String reviewer) {
        if(grade > 5){
            grade = 5;
        }
        else if(grade < 0){
            grade = 0;
        }
        this.grade = grade;
        this.reviewer = reviewer;
    }

    public int getGrade() {
        return grade;
    }

    public String getReviewer() {
        return reviewer;
    }
}
