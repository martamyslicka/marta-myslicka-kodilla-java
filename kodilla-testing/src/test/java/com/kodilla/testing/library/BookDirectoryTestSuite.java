package com.kodilla.testing.library;
import com.kodilla.testing.library.LibraryDataBase;
import com.kodilla.testing.library.BookLibrary;
import com.kodilla.testing.library.LibraryUser;
import com.kodilla.testing.library.Book;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@DisplayName("Library Database Test Suite")
public class BookDirectoryTestSuite {

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is a beginning of test.");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("All test are finished.");
    }

    private static int testCounter = 0;
    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List <Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Mock
    private LibraryDataBase libraryDatabaseMock;
    @Test
    void testListBooksWithConditionsReturnList() {
        // Given

        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBookWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    void testListBookWithCondiotionMoreThan20() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBookWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBookWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBookWithCondition("FortyBooks");

        // Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBookWithConditionFragmentShorterThan3() {
        // Given
        LibraryDataBase libraryDatabaseMock = mock(LibraryDataBase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBookWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testListBooksInHandsOf0Book(){
        //Given
        LibraryDataBase libraryDatabaseMock = mock(LibraryDataBase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> bookInHandsOf = generateListOfNBooks(0);
        LibraryUser libraryUser = new LibraryUser("Elmo", "SezamStreet", "61312487545");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(bookInHandsOf);

        //when
        List<Book> bookInHandsOf0 = bookLibrary.listBooksInHandsOf(libraryUser);

        //then
        assertEquals(0, bookInHandsOf.size());

    }

    @Test
    void testListBooksInHansOf1Book(){
        //Given
        LibraryDataBase libraryDatabaseMock = mock(LibraryDataBase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> bookInHandsOf = generateListOfNBooks(1);
        LibraryUser libraryUser = new LibraryUser("Elmo", "SezamStreet", "61312487545");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(bookInHandsOf);

        //when
        List<Book> bookInHandsOf0 = bookLibrary.listBooksInHandsOf(libraryUser);

        //then
        assertEquals(1, bookInHandsOf.size());

    }

    @Test
    void testListBooksInHansOf5Book(){
        //Given
        LibraryDataBase libraryDatabaseMock = mock(LibraryDataBase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> bookInHandsOf = generateListOfNBooks(5);
        LibraryUser libraryUser = new LibraryUser("Elmo", "SezamStreet", "61312487545");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(bookInHandsOf);

        //when
        List<Book> bookInHandsOf0 = bookLibrary.listBooksInHandsOf(libraryUser);

        //then
        assertEquals(5, bookInHandsOf.size());

    }
}
