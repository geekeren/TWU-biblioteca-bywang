package com.twu.biblioteca;

import java.util.Scanner;

public class ReturnBookOption extends BibliotecaMenuOption {
    public ReturnBookOption(Library library) {

        super(library);
        name = "Return book";
    }

    @Override
    public void exec(String... word) {
        System.out.println("These are books you should return,please input the name of book:\n");
        System.out.println(getOutputOfListCheckedOutBooks());
        Scanner s = new Scanner(System.in);
        library.returnBookByName(s.nextLine());

    }

    public String getOutputOfListCheckedOutBooks() {
        StringBuffer sb = new StringBuffer("");
        for (int i = 1; i <= library.booksCheckedOut.size(); i++) {
            Book book = library.booksCheckedOut.get(i - 1);
            sb.append("[" + i + "]" + book.name + "\n");
        }
        return sb.toString();
    }
}
