import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library (int capacity) {
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int countBooks() {
        return this.books.size();
    }

    public boolean canAddBook() {
        return this.countBooks() < this.capacity;
    }

    public void addBook(Book book) {
        if (canAddBook()) {
            this.books.add(book);
        }
    }

    public Book removeBook(String bookname) {
        for (Book book : this.books) {
            if (book.getName() == bookname) {
                return book;
            }
        }
        return null;
    }
}
