package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> booksStoredInLib =new ArrayList<>();
    List<Book> booksCheckedOut =new ArrayList<>();


    public Library() {

    }

    public void addBook(Book book) {
        booksStoredInLib.add(book);
    }

    public boolean checkedOutBookByName(String name){

        return false;
    }

    public boolean returnBookByName(String name){
        return false;
    }
}
