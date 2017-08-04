package com.twu.biblioteca;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertEquals;

/**
* Library Tester.
*
* @author <Authors name>
* @since <pre>Aug 3, 2017</pre>
* @version 1.0
*/
public class LibraryTest {
    private Library library;

@Before
public void before() throws Exception {
    library = new Library();

}

@After
public void after() throws Exception {
}


    @Test
    public void shouldCheckoutBookSuccessfulIfValidBook(){

        library.booksStoredInLib.add(new Book("Java","John",2014));
        assertEquals(true,library.checkedOutBookByName("Java"));

    }

    @Test
    public void shouldCheckoutBookFailedIfNoThisBook(){

        assertEquals(false,library.checkedOutBookByName("Ruby"));
    }

    @Test
    public void shouldBookAppearInLibAfterReturn(){
        library.booksCheckedOut.add(new Book("Ruby","John",2014));
        library.returnBookByName("Ruby");

        boolean isBookAppearInLib = false;
        for(Book book:library.booksStoredInLib){
            if(book.name.equals("Ruby"))
                isBookAppearInLib = true;
        }

        assertEquals(isBookAppearInLib, true);
    }




} 
