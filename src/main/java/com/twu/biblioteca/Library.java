package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<LibItem> itemsStoredInLib = new ArrayList<>();
    List<LibItem> itemsCheckedOut = new ArrayList<>();
    List<User> users = new ArrayList<>();
    List<CheckoutItem> checkoutItems = new ArrayList<>();


    public Library() {
        User user1 = new User("wangbaiyuan", "wangbaiyuan@outlook.com", "13112345678");
        User user2 = new User("wangbaiyuan", "wangbaiyuan@outlook.com", "13112345678");
        user1.bindLibAccuntProfile("123-4567", "wangbaiyuan");
        user2.bindLibAccuntProfile("789-4567", "123456");
        users.add(user1);
        users.add(user2);
    }


    public boolean checkedOutItemWithUserByName(String name, String userLibNO) {

        for (int i = 0; i < itemsStoredInLib.size(); i++) {
            if (itemsStoredInLib.get(i).getName().equals(name)) {
                checkoutItems.add(new CheckoutItem(name, userLibNO));
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

        for (int i = 0; i < checkoutItems.size(); i++) {
            CheckoutItem item = checkoutItems.get(i);
            if (item.itemName == name) {
                checkoutItems.remove(i);
                return;
            }

        }
    }

    public void addBook(Book book) {
        itemsStoredInLib.add(book);
    }

    public class CheckoutItem {
        public CheckoutItem(String itemName, String userLibNO) {
            this.itemName = itemName;
            this.userLibNO = userLibNO;
        }

        public String itemName;
        public String userLibNO;
    }
}