package com.twu.biblioteca;

public class User {
    public String name, email, phone, libnumber, password;

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;

    }

    public void bindLibAccuntProfile(String s, String password) {
        libnumber = s;
        this.password = password;

    }

    public boolean loginWithPassword(String password) {
        return password == this.password;

    }
}
