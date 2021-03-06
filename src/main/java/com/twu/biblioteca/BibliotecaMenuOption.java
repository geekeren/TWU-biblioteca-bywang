package com.twu.biblioteca;

public abstract class BibliotecaMenuOption {
    public String name;
    public Library library;
    public BibliotecaMenuOption(Library library) {
        this.library = library;
    }

    public abstract void exec(String... word);
}
