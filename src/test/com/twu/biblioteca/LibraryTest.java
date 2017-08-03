package com.twu.biblioteca;

import com.twu.biblioteca.Library;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

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
    library.addBook(new Book("Java",2014));
//TODO: Test goes here... 
} 


} 
