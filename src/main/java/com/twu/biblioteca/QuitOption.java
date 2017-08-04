package com.twu.biblioteca;

public class QuitOption extends  BibliotecaMenuOption{
    public QuitOption(Library library) {
        super(library);
        this.name ="Quit";
    }

    @Override
    public void exec(String... word) {

        System.out.println("System is quiting now...");
        System.exit(0);
    }
}
