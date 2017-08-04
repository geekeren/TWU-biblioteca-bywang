package com.twu.biblioteca;

public class ListBooksOption extends BibliotecaMenuOption {
    public ListBooksOption(Library library) {
        super(library);
        this.name = "List books";
    }

    @Override
    public void exec(String... word) {

        System.out.print(getOutputOfListBooks() );

    }

    public String getOutputOfListBooks() {
        StringBuffer sb = new StringBuffer("");
        for(int i=1;i<=library.booksStoredInLib.size();i++){
            Book book = library.booksStoredInLib.get(i-1);
            sb.append("["+i+"]"+book.name+"\n");
        }
        return sb.toString();
    }
}
