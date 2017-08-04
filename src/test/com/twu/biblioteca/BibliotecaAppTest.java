package com.twu.biblioteca;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;

/** 
* BibliotecaApp Tester. 
* 
* @author <Authors name> 
* @since <pre>Aug 3, 2017</pre> 
* @version 1.0 
*/ 
public class BibliotecaAppTest {

    private BibliotecaApp app;

    @Before
public void before() throws Exception {
     app = new BibliotecaApp();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: main(String[] args) 
* 
*/ 
@Test
public void shouldListOptionCorrectly() throws Exception {
    assertEquals("Welcome to Biblioteca!\n" +
            "Please select an option :\n" +
            "\t[1]: List books\n" +
            "\t[2]: Check out Book\n" +
            "\t[3]: Return book\n" +
            "\t[4]: Quit\n",app.getOptionList());
//TODO: Test goes here... 
}


@Test
    public void shouldShowCorrectWelcomeMSg() throws  Exception{

    assertEquals("Welcome to Biblioteca!",app.getWelcomeMsg());

}


} 
