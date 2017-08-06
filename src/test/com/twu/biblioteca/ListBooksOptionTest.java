package com.twu.biblioteca;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/** 
* ListBooksOption Tester. 
* 
* @author <Authors name> 
* @since <pre>Aug 3, 2017</pre> 
* @version 1.0 
*/ 
public class ListBooksOptionTest{

    private ListBooksOption listBooksOption;

    @Before
public void before() throws Exception {
    Library library = new Library();
        library.itemsStoredInLib.add(new Book("Java", "Hbj", 2011));
        library.itemsStoredInLib.add(new Book("Ruby", "Hf", 2011));
//    library.itemsStoredInLib.add(new Book("cpp",2011));
    listBooksOption = new ListBooksOption(library);
} 

@After
public void after() throws Exception { 
} 


    @Test
    public void shouldReturnListBooks() throws Exception {

        assertEquals("[1]《Java》 Author：Hbj ；Year：2011\n" +
                "[2]《Ruby》 Author：Hf ；Year：2011\n", listBooksOption.getOutputOfListBooks());

    }

} 
