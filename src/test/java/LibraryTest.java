import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before(){
        library = new Library(3);
        book1 = new Book ("Frankenstein in Baghdad", "Ahmed Saadawi", "Arabic Fiction");
        book2 = new Book ("Steve Jobs: The Exclusive Biography", "Walter Isaacson", "Autobiography");
        book3 = new Book ("Washington Black", "Esi Edugyan", "Adventure Fiction");
        book4 = new Book ("The Kalahari Typing School For Men", "Alexander McCall Smith", "Fiction");
    }

    @Test
    public void libraryHasBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void cannotAddBookWhenFull(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.countBooks());
    }
}
