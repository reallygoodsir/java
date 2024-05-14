package sevenDays.OOP.five;

public class AppBook {
    public static void main(String[] args) {
        Book book = new Book("Breaking Bad", "Vince Gilligan", 9785698);
        Book book2 = new Book("Unbreaking Good", "Vince Gilligan", 3456);
        Book book3 = new Book("Unknown Neutral", "King Von", 123);

        Books books = new Books();
        books.addBook(book);
        books.addBook(book2);
        books.addBook(book3);

        books.showCollection();

        books.removeBook(1);
        System.out.println();
        books.showCollection();
    }
}
