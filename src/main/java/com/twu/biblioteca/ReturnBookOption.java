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
        System.out.println((new ListBooksOption(library).getOutputOfListBooks()));
        Scanner s = new Scanner(System.in);
        library.returnItemByName(s.nextLine());

    }

}
