package com.twu.biblioteca;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;


import static org.junit.Assert.assertEquals;

/** 
* Book Tester. 
* 
* @author <Authors name> 
* @since <pre>Aug 4, 2017</pre> 
* @version 1.0 
*/ 
public class BookTest {

    private Book book;

    @Before
public void before() throws Exception {
    book = new Book("JAVA","Wangbaiyuan",2017);

} 

@After
public void after() throws Exception { 
} 

@Test
public void shouldGetBookDetailsMsg() throws Exception{

    assertEquals("<<JAVA>> Wangbaiyuan @2017",book.getDetails());
    }

} 
