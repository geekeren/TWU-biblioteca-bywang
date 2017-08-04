package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {

    List<Book> booksStoredInLib = new ArrayList<>(
            Arrays.asList(
                    new Book("PHP Basic","WBY",2014),
                    new Book("Java Web","JonhY",2014),
                    new Book("CPP","Wang",2014),
                    new Book("DSS","WBY",2016)
            )
    );
    List<Book> booksCheckedOut = new ArrayList<>();


    public Library() {

    }



    public boolean checkedOutBookByName(String name) {

        for (int i = 0; i < booksStoredInLib.size(); i++) {
            if (booksStoredInLib.get(i).name.equals(name)) {
                booksCheckedOut.add(booksStoredInLib.get(i));
                booksStoredInLib.remove(i);
                return true;
            }
        }
        return false;
    }

    public void returnBookByName(String name) {

        for (int i = 0; i < booksCheckedOut.size(); i++) {
            if (booksCheckedOut.get(i).name.equals(name)) {
                booksStoredInLib.add(booksCheckedOut.get(i));
                booksCheckedOut.remove(i);

            }

        }
    }
}