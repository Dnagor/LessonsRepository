package json;

import java.util.Objects;

public class Books {
    private String author;
    private String bookTitle;

    public Books(String author, String bookTitle) {
        this.author = author;
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Books)) return false;
        Books books = (Books) o;
        return Objects.equals(author, books.author) && Objects.equals(bookTitle, books.bookTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookTitle);
    }
}
