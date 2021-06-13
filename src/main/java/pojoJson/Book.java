package pojoJson;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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


}