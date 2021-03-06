import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Library bigLibrary;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library(1);
        bigLibrary = new Library(5);
        book1 = new Book("Harry Potter", "JK Rowling", "Fantasy");
        book2 = new Book("Deep Work", "Cal Newport", "Non-fiction");
        book3 = new Book("With Winning in Mind", "Lanny Bassham", "Non-fiction");
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

    @Test
    public void cantAddBookIfLibraryFull() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void canRemoveBookByName() {
        library.addBook(book1);
        Book removedBook = library.removeBook("Harry Potter");
        assertEquals(book1, removedBook);
    }

    @Test
    public void cantRemoveBookIfNotThere() {
        Book removedBook = library.removeBook("Lord of the Rings");
        assertEquals(null, removedBook);
    }

    @Test
    public void canGetNumberOfBooksByGenre() {
        bigLibrary.addBook(book1);
        bigLibrary.addBook(book2);
        bigLibrary.addBook(book3);
        assertEquals(2, bigLibrary.countBooksByGenre("Non-fiction"));
    }
}
