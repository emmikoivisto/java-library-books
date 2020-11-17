import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void setUp(){
        book = new Book("Sinuhe", "Mikael Waltari", "historical fiction");
    }

//    @Test
//    public void checkBookHasTitle(){
//        assertEquals("Sinuhe", book.title);
//    }
}
