package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserAccountOptionTest {

    public UserAccountOption option;

    @Before
    public void before() {
        Library library = new Library();
        option = new UserAccountOption(library);
    }

    @Test
    public void shouldReturnFalseLoginStatusWhenNotLogin() {
        option.logedInUser = null;
        assertEquals(false, option.getLoginStatus());
    }


    @Test
    public void shouldReturnTrueLoginStatusWhenLogedIn() {

        option.logedInUser = new User("wby", "wby@qq.com", "123566");
        assertEquals(true, option.getLoginStatus());
    }
}
