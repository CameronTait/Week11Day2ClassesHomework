import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    private Book book1;
    private Book book2;

    private Library library;

    @Before
    public void setUp() {
        book1 = new Book("Harry Potter", "JK Rowling", "Fantasy");
        book2 = new Book( "The Bible", "Moses", "Non-fiction");

        library = new Library();
    }


    @Test
    public void bookHasTitle() {
        assertEquals("The Bible", book2.getTitle());
    }

//    @Test
//    public void bookHasAuthor() {
//        assertEquals("JK Rowling", book1.getAuthor());
//    }
//
//    @Test
//    public void bookHasGenre() {
//        assertEquals("Moses", book1.getGenre());
//    }

}
