import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books;
    private int capacity;
    private HashMap<String, Integer> genreCount;

    public Library (int capacity) {
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
        this.genreCount = new HashMap<String, Integer>();
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
            this.updateGenreCount(book);
        }
    }

    public Book removeBook(String bookname) {
        for (Book book : this.books) {
            if (book.getName().equals(bookname)) {
                return book;
            }
        }
        return null;
    }

    public void updateGenreCount(Book book) {
        String genre = book.getGenre();
        int count;
        if (this.genreCount.containsKey(genre)) {
            count = this.genreCount.get(genre) + 1;
        } else {
            count = 1;
        }
        this.genreCount.put(genre, count);
    }

    public int countBooksByGenre(String genre) {
        if (this.genreCount.containsKey(genre)) {
            return this.genreCount.get(genre);
        } else {
            return 0;
        }
    }
}
