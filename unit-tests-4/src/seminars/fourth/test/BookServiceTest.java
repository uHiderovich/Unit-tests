import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import seminars.fourth.book.Book;
import seminars.fourth.book.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookServiceTest {
    BookRepository bookRepositoryMock;
    BookService bookService;

    @BeforeEach
    public void setup() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("id1"));
        books.add(new Book("id2"));
        books.add(new Book("id3"));

        bookRepositoryMock = mock(InMemoryBookRepository.class);
        when(bookRepositoryMock.findById("id2")).thenReturn(books.get(1));
        when(bookRepositoryMock.findAll()).thenReturn(books);

        bookService = new BookService(bookRepositoryMock);
    }

    @Test
    @DisplayName("Testing the Id search")
    void testFindById() {
        String testId = "id2";
        assertEquals(bookService.findBookById("id2").getId(), testId);
        verify(bookRepositoryMock, times(1)).findById(testId);
    }

    @Test
    @DisplayName("Testing the receipt of all books from the repository")
    void testFindAll() {
        assertThat(bookService.findAllBooks()).extracting("id").contains("id1", "id2", "id3");
        verify(bookRepositoryMock, times(1)).findAll();
    }
}
