import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before() {
        borrower = new Borrower();
        library = new Library(1);
        book = new Book("Deep Work", "Cal Newport", "Non-fiction");
        library.addBook(book);
    }

    @Test
    public void borrowerStartsWithNobooks() {
        assertEquals(0, borrower.countBooks());
    }

    @Test
    public void canAddBook() {
        borrower.takeBook(library, "Deep Work");
        assertEquals(1, borrower.countBooks());
    }

    @Test
    public void cantAddBookIfNotThere() {
        borrower.takeBook(library, "Harry Potter");
        assertEquals(0, borrower.countBooks());
    }
}
