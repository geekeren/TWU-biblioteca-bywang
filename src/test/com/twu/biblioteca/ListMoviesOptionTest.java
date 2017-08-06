package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * ListBooksOption Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Aug 3, 2017</pre>
 */
public class ListMoviesOptionTest {

    private ListMoviesOption listMoviesOption;

    @Before
    public void before() throws Exception {
        Library library = new Library();
        library.itemsStoredInLib.add(new Movie("战狼2", "WuJing", 2017));
        library.itemsStoredInLib.add(new Movie("三生三世", "XXX", 2011));
//    library.itemsStoredInLib.add(new Book("cpp",2011));
        listMoviesOption = new ListMoviesOption(library);
    }

    @After
    public void after() throws Exception {
    }


    @Test
    public void shouldReturnListMovies() throws Exception {

        assertEquals("[1]《战狼2》-Director：WuJing ；Year：2017;Rate: 5\n" +
                "[2]《三生三世》-Director：XXX ；Year：2011;Rate: 5\n", listMoviesOption.getOutputOfListMovies());

    }

} 
