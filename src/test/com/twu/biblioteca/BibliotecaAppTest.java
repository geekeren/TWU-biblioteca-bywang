package com.twu.biblioteca;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * BibliotecaApp Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Aug 3, 2017</pre>
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
     * Method: main(String[] args)
     */
@Test
public void shouldListOptionCorrectly() throws Exception {
    assertEquals(
            "Please select an option :\n" +
                    "\t[1]: List books\n" +
                    "\t[2]: List movies\n" +
                    "\t[3]: Check out Book\n" +
                    "\t[4]: Check out movie\n" +
                    "\t[5]: Return book\n" +
                    "\t[6]: Return movie\n" +
                    "\t[7]: User Account\n" +
                    "\t[8]: Quit\n", app.getOptionList());
//TODO: Test goes here...
}


    @Test
public void shouldShowCorrectWelcomeMSg() throws Exception {

        assertEquals("Welcome to Biblioteca!",app.getWelcomeMsg());

    }

    @Test
    public void shouldReturnValidIfSelectValidOption() {
        assertEquals(true, app.isValidOption(1));
        assertEquals(false, app.isValidOption(9));
    }

} 
