package sevenDays.OOP.eighteen;

public class Review {
    private String publisher;
    private int rating;

    public String getPublisher() {
        return publisher;
    }

    public int getRating() {
        return rating;
    }


    public Review(String publisher, int rating) {
        this.publisher = publisher;
        this.rating = rating;
    }
    @Override
    public String toString() {
        return rating + " stars by " + publisher;
    }
}
