package src;

import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojoJson.Book;
import pojoJson.Helper;

import java.util.Iterator;

import static org.testng.AssertJUnit.assertNotNull;

public class WebsitesCheck {

    @Test
    @Description("Checks if there are any books in Amazon store.")
    public void objectIsPresentTest() {
        assertNotNull(Helper.readJson().getWebsites().get(0).getAmazon().getBooks().get(0).getAuthor());
    }

    @Test
    @Description("Checks if expected book is in Rozetka store.")
    public void bookPositiveTest() {
        Book expected = new Book();
        expected.setAuthor("Test3");
        expected.setBookTitle("java");
        Book actual = null;
        Iterator<Book> iterator = Helper.readJson()
                .getWebsites()
                .get(1)
                .getRozetka()
                .getBooks()
                .iterator();

        while (iterator.hasNext()) {
            Book next = iterator.next();
            if (next.equals(expected)) {
                actual = next;
            }
        }
        Assert.assertEquals(actual, expected, "Дані не співпадають.");
    }

    @Test
    @Description("Checks if expected book is not in Amazon store.")
    public void negativeTitle() {
        Book expected = new Book();
        expected.setAuthor("Test4");
        expected.setBookTitle("Delphi");
        Book actual = null;
        Iterator<Book> iterator = Helper.readJson()
                .getWebsites()
                .get(0)
                .getAmazon()
                .getBooks()
                .iterator();

        while (iterator.hasNext()) {
            Book next = iterator.next();
            if (next.equals(expected)) {
                actual = next;
            }
        }
        Assert.assertNotEquals(actual, expected, "У списку товарів є така книжка");
    }
}
