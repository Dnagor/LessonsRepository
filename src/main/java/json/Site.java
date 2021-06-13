package json;

import java.util.List;
import java.util.Objects;

public class Site {
    private int id;
    private List<Books> books;

    public Site(int id, List<Books> booksList) {
        this.id = id;
        this.books = booksList;
    }

    public int getName() {
        return id;
    }

    public void setName(int id) {
        this.id = id;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Site)) return false;
        Site site = (Site) o;
        return Objects.equals(id, site.id) && Objects.equals(books, site.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, books);
    }

    @Override
    public String toString() {
        return "Websites{" +
                "name='" + id + '\'' +
                ", booksList=" + books +
                '}';
    }
}
