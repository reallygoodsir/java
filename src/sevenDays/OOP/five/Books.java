package sevenDays.OOP.five;

import java.util.ArrayList;

public class Books {
    ArrayList<Book> bookCollection = new ArrayList<Book>();

    void addBook(Book book) {
        bookCollection.add(book);

    }

    void removeBook(int index) {
        bookCollection.remove(index);
    }

    void showCollection() {
        for (int i = 0; i < bookCollection.size(); i++) {
            System.out.println(bookCollection.get(i));
        }
    }
}
