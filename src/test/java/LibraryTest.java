import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("Harry Potter", "JK Rowling", "Fantasy");
        book2 = new Book("Deep Work", "Cal Newport", "Non-fiction");
    }

    @Test
    public void libraryStartsEmpty() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }
}