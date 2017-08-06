package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    User user;

    @Before
    public void before() {
        user = new User("wangbaiyuan", "wangbaiyuan@outlook.com", "13112345678");
        user.bindLibAccuntProfile("188-1234", "password");//Bind user's lib number and password
    }

    @Test
    public void shouldLoginSuccessfulWhenInputCorrectPassword() {
        assertEquals(true, user.loginWithPassword("password"));

    }

    @Test
    public void shouldLoginSuccessfulWhenInputIncorrectPassword() {
        assertEquals(false, user.loginWithPassword("passwor"));
    }

    @Test
    public void shouldReturnCorrectProfileOfUser() {
        assertEquals("Name:\twangbaiyuan\nEmail:\twangbaiyuan@outlook.com\nPhone:\t13112345678\n", user.getInfomation());
    }
}
