package com.twu.biblioteca;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * Library Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Aug 3, 2017</pre>
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
    public void shouldCheckoutBookSuccessfulIfValidBook() {

        library.itemsStoredInLib.add(new Book("Java", "John", 2014));
        assertEquals(true, library.checkedOutItemWithUserByName("Java", ""));

    }

    @Test
    public void shouldCheckoutBookFailedIfNoThisBook() {

        assertEquals(false, library.checkedOutItemWithUserByName("Ruby", ""));
    }

    @Test
    public void shouldBookAppearInLibAfterReturn() {
        library.itemsCheckedOut.add(new Book("Ruby", "John", 2014));
        library.returnItemByName("Ruby");

        boolean isBookAppearInLib = false;
        for (LibItem item : library.itemsStoredInLib) {
            if (item instanceof Book && item.getName().equals("Ruby"))
                isBookAppearInLib = true;
        }

        assertEquals(true, isBookAppearInLib);
    }

    @Test
    public void testAddBook() throws Exception {
        library.addBook(new Book("PHP Basic", "WBY", 2014));
        assertEquals(1, library.itemsStoredInLib.size());
    }


}
