package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books =new ArrayList<>();


    public Library() {

    }

    public void addBook(Book book) {
        books.add(book);
    }
}
