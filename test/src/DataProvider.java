package src;

import pojoJson.Book;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private Book a, b;

    public Book[] initBooks() {
        Book[] books = new Book[2];
        books[0] = new Book();
        books[1] = new Book();
        books[0].setBookTitle("Delphi");
        books[1].setBookTitle("java");
        books[0].setAuthor("Test4");
        books[1].setAuthor("Test3");
        return books;
    }

    @org.testng.annotations.DataProvider(name = "books")
    public Object[] getDifferentBooks() {
        return new Object[]{
                initBooks()};
    }
}
