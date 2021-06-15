package pojoJson;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "author",
        "bookTitle"
})

public class Book {

    @JsonProperty("author")
    private String author;
    @JsonProperty("bookTitle")
    private String bookTitle;

//    @JsonIgnore
//    public Book(String author, String bookTitle) {
//        this.author = author;
//        this.bookTitle = bookTitle;
//    }

    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    @JsonProperty("bookTitle")
    public String getBookTitle() {
        return bookTitle;
    }

    @JsonProperty("bookTitle")
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(bookTitle, book.bookTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookTitle);
    }
}