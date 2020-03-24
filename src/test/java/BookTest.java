import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before() {
        book = new Book("Harry Potter", "JK Rowling", "Fantasy");
    }

    @Test
    public void hasName() {
        assertEquals("Harry Potter", book.getName());
    }

    @Test
    public void hasAuthor() {
        assertEquals("JK Rowling", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Fantasy", book.getGenre());
    }
}
