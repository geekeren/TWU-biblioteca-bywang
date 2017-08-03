package com.twu.biblioteca;

public class ListBooksOption extends BibliotecaMenuOption {
    public ListBooksOption(Library library) {
        super(library);
        this.name = "List books";
    }

    @Override
    public void exec(String... word) {

        for(int i=1;i<=library.booksStoredInLib.size();i++){
            Book book = library.booksStoredInLib.get(i-1);
            System.out.println("["+i+"]"+book.name);
        }

    }
}
