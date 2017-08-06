package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserAccountOptionTest {

    public UserAccountOption option;

    @Test
    public void shouldReturnFalseLoginStatusWhenNotLogin() {

        assertEquals(false, option.getLoginStatus());
    }


    @Test
    public void shouldReturnTrueLoginStatusWhenLogedIn() {
        assertEquals(false, option.getLoginStatus());
    }
}
