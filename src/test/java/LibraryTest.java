import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void setUp(){
        library = new Library(3);
        book = new Book("Sinuhe", "Waltari", "hist fiction");

    }

    @Test
    public void checkLibraryIsEmpty(){
        assertEquals(0, library.booksCount());
    }

    @Test
    public void checkBookCount(){
        library.addBook(book);
        assertEquals(1, library.booksCount());
    }

    @Test
    public void CanAddBookIfCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.booksCount());
    }

    @Test
    public void CanAddBookIfOverCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.booksCount());
    }
}
