import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book1;
    Book book2;

    @Before
    public void before(){
        library = new Library(1);
        book1 = new Book("Lord of the Rings: The Fellowship of the Ring", "JRR Tolkien", "Fantasy");
        book2 = new Book("1984", "George Orwell", "Science Fiction");
    }

    @Test
    public void BookExists(){
        assertEquals("Lord of the Rings: The Fellowship of the Ring", book1.getTitle());
        assertEquals("JRR Tolkien", book1.getAuthor());
        assertEquals("Fantasy", book1.getGenre());

    }

    @Test
    public void NumberOfBooks(){
        assertEquals(0, library.getBooks());
    }

    @Test
    public void CanAddBooks(){;
        library.add(book1);
        assertEquals(1, library.getBooks());
    }

    @Test
    public void CantAddTooManyBooks(){;
        library.add(book1);
        library.add(book2);
        assertEquals(1, library.getBooks());
    }




}
