package com.twu.biblioteca;

import java.util.Scanner;

public class CheckOutBookOption extends BibliotecaMenuOption {

    public CheckOutBookOption(Library library) {
        super(library);
        this.name = "Check out Book";
    }

    @Override
    public void exec(String... word) {

        System.out.println("These are books you can check out,please input the number to select a book:\n");
        System.out.println(getOutputOfListStoredBooks());
        Scanner s = new Scanner(System.in);
        if (library.checkedOutBookByName(s.nextLine())) {
            System.out.println(getBookAvailableNotice());
        } else {
            System.out.println(getBookUnavailableNotice());
        }

    }

    public String getOutputOfListStoredBooks() {
        StringBuffer sb = new StringBuffer("");
        for (int i = 1; i <= library.booksStoredInLib.size(); i++) {
            Book book = library.booksStoredInLib.get(i - 1);
            sb.append("[" + i + "]" + book.name + "\n");
        }
        return sb.toString();
    }


    public String getBookUnavailableNotice() {
        return "That book is not available";
    }

    public String getBookAvailableNotice() {
        return "Thank you! Enjoy the book";
    }

}

