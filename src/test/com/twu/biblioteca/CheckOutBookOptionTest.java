package com.twu.biblioteca;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * CheckOutBookOption Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Aug 3, 2017</pre>
 */
public class CheckOutBookOptionTest {

    private Library library;
    private CheckOutBookOption option;

    @Before
    public void before() throws Exception {
        library = new Library();
        option = new CheckOutBookOption(library);
    }

    @After
    public void after() throws Exception {
    }


    /**
     * Method: exec(String... word)
     */
    @Test
    public void testExec() throws Exception {
//TODO: Test goes here...
        //Given When Then

    }

    @Test
    public void shouldOutputListOfAllBooksCanbeCheckedOut() {
        library.itemsStoredInLib.add(new Book("CPP", "WBY", 2017));
        library.itemsStoredInLib.add(new Book("Swift", "WBY", 2017));
        assertEquals("[1]CPP\n[2]Swift\n", option.getOutputOfListStoredBooks());
    }

    @Test
    public  void shouldOutputWhenNoThisBook(){
        library =  mock(Library.class);
        option = new CheckOutBookOption(library);
        when(library.checkedOutItemByName("ff")).thenReturn(false);
        assertEquals("That book is not available",option.getBookUnavailableNotice());
    }


    @Test
    public  void shouldOutputWhenHaveThisBook(){
        library =  mock(Library.class);
        option = new CheckOutBookOption(library);
        when(library.checkedOutItemByName("ff")).thenReturn(true);
        assertEquals("Thank you! Enjoy the book",option.getBookAvailableNotice());
    }
} 
