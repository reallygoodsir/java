package scjp.collections.comparable.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppTask3 {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Einstein", 1965));
        bookList.add(new Book("Churchill", 1977));
        bookList.add(new Book("Yamamoto", 1942));
        bookList.add(new Book("Belgium", 2012));
        bookList.add(new Book("Algeria", 2012));
        bookList.add(new Book("Chad", 2012));
        for (Book book : bookList) {
            System.out.println(book);
        }
        Collections.sort(bookList);
        System.out.println("\n\nAfter:\n");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
