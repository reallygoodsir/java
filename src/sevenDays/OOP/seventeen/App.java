package sevenDays.OOP.seventeen;

public class App {
    public static void main(String[] args) {
        Movie sherlock = new Movie();
        Review a = new Review(6, "Kanye West");
        Review b = new Review(5, "Travis Scott");
        Review c = new Review(1, "Someone else");
        Review d = new Review(-15, "A person");
        sherlock.addReview(a);
        sherlock.addReview(b);
        sherlock.addReview(c);
        sherlock.addReview(d);

        sherlock.retrieveReview(0);
        sherlock.retrieveReview(3);
    }
}
