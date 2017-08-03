package com.twu.biblioteca;

import com.twu.biblioteca.Library;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

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
public class LibraryTest {
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
    assertEquals(library.books, Arrays.asList(book));
//TODO: Test goes here... 
} 


} 
