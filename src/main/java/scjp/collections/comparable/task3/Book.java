package scjp.collections.comparable.task3;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private Integer year;

    public Book(String title, Integer year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(year, book.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year);
    }

    @Override
    public int compareTo(Book o) {
        if (o == null) return -1;
        if(this.year.compareTo(o.year) != 0) {
            return this.year.compareTo(o.year);
        }else{
            return this.title.compareTo(o.title);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
