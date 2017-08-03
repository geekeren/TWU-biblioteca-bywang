package com.twu.biblioteca;

import com.twu.biblioteca.Library;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
* Library Tester.
*
* @author <Authors name>
* @since <pre>Aug 3, 2017</pre>
* @version 1.0
*/
public class LibraryTest extends BibliotecaTest{
    private Library library;

@Before
public void before() throws Exception {
    library = new Library();

}

@After
public void after() throws Exception {
}

/**
*
* Method: addBook(Book book)
*
*/
    @Test
    public void testAddBook() throws Exception {
        Book book = new Book("Java",2014);
        library.addBook(book);
        assertEquals(library.booksStoredInLib, Arrays.asList(book));
    //TODO: Test goes here...
    }

    @Test
    public void testRemoveBook() throws Exception {
        Book book = new Book("Java",2014);
        library.addBook(book);
        assertEquals(library.booksStoredInLib, Arrays.asList(book));
//TODO: Test goes here...
    }

    @Test
    public void shouldCheckoutBookSuccessfulIfValidBook(){



    }

    @Test
    public void shouldCheckoutBookFailedIfNoThisBook(){


    }





} 
