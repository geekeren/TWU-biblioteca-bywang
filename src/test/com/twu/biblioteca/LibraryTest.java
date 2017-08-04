package com.twu.biblioteca;

import com.twu.biblioteca.Library;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
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
    Book book = new Book("Java","John",2014);
//    library.addBook(book);
}

@After
public void after() throws Exception {
}


    @Test
    public void shouldCheckoutBookSuccessfulIfValidBook(){

        assertEquals(true,library.checkedOutBookByName("Java"));

    }

    @Test
    public void shouldCheckoutBookFailedIfNoThisBook(){

        assertEquals(false,library.checkedOutBookByName("Ruby"));
    }

    @Test
    public void shouldBookAppearInLibAfterReturn(){
        library.returnBookByName("Ruby");

        boolean isBookAppearInLib = false;
        for(Book book:library.booksStoredInLib){
            if(book.name.equals("Ruby"))
                isBookAppearInLib = true;
        }

        assertEquals(isBookAppearInLib, true);
    }




} 
