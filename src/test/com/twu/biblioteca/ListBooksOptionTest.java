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
public class ListBooksOptionTest extends BibliotecaTest{

    private ListBooksOption listBooksOption;

    @Before
public void before() throws Exception {
    Library library = new Library();
    library.booksStoredInLib.add(new Book("Java",2011));
    library.booksStoredInLib.add(new Book("Ruby",2011));
//    library.booksStoredInLib.add(new Book("cpp",2011));
    listBooksOption = new ListBooksOption(library);
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: exec(String... word) 
* 
*/ 
@Test
public void testExec() throws Exception {
    listBooksOption.exec();
    //String s = new String("Hello World! Hello Java!\n");    // 注意：控制台的换行，这里用 '\n' 表示
    assertEquals("[1]Java\n[2]Ruby\n", getConsoleOutput());
} 


} 
