package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Book Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Aug 4, 2017</pre>
 */
public class MovieTest {

    private Movie movie;

    @Before
    public void before() throws Exception {
        movie = new Movie("战狼", "WuJing", 2017);
        movie.updateRate(9);

    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void shouldGetMovieDetailsMsg() throws Exception {

        assertEquals("《战狼》-Director：WuJing ；Year：2017;Rate: 9", movie.getDetails());
    }

    @Test
    public void shouldReturnNewRateAfterUpdateRate() throws Exception {
        movie.updateRate(8);
        assertEquals(8, movie.rate);
    }


} 
