package com.twu.biblioteca;

public class ListMoviesOption extends BibliotecaMenuOption {
    public ListMoviesOption(Library library) {
        super(library);
        this.name = "List movies";
    }

    @Override
    public void exec(String... word) {

        System.out.print(getOutputOfListMovies());

    }

    public String getOutputOfListMovies() {
        StringBuffer sb = new StringBuffer("");
        int index = 1;
        for (int i = 1; i <= library.itemsStoredInLib.size(); i++) {
            LibItem item = library.itemsStoredInLib.get(i - 1);
            if (item instanceof Movie) {
                Movie book = (Movie) item;
                sb.append("[" + (index++) + "]" + book.getDetails() + "\n");
            }
        }
        return sb.toString();
    }
}
