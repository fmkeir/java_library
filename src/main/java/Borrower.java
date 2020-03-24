import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> books;

    public Borrower() {
        this.books = new ArrayList<Book>();
    }

    public int countBooks() {
        return this.books.size();
    }

    public void takeBook(Library library, String bookname) {
        Book removedBook = library.removeBook(bookname);
        if (removedBook != null) {
            this.books.add(removedBook);
        }
    }
}
