package oop.seventeen;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String director;
    private String actors;
    private String reviews;
    ArrayList<Review> revs = new ArrayList<Review>();


    void addReview(Review rev){
        revs.add(rev);
    }

    void retrieveReview(int index){
        System.out.println("Graded " + revs.get(index).getGrade() + " out of 5\nReview published by \"" + revs.get(index).getReviewer() + "\"");
    }
}
