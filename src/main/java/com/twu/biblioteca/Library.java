package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<LibItem> itemsStoredInLib = new ArrayList<>();
    List<LibItem> itemsCheckedOut = new ArrayList<>();


    public Library() {

    }


    public boolean checkedOutItemByName(String name) {

        for (int i = 0; i < itemsStoredInLib.size(); i++) {
            if (itemsStoredInLib.get(i).getName().equals(name)) {
                itemsCheckedOut.add(itemsStoredInLib.get(i));
                itemsStoredInLib.remove(i);
                return true;
            }
        }
        return false;
    }

    public void returnItemByName(String name) {

        for (int i = 0; i < itemsCheckedOut.size(); i++) {
            if (itemsCheckedOut.get(i).getName().equals(name)) {
                itemsStoredInLib.add(itemsCheckedOut.get(i));
                itemsCheckedOut.remove(i);

            }

        }
    }

    public void addBook(Book book) {
        itemsStoredInLib.add(book);
    }
}