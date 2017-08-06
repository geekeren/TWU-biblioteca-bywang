package com.twu.biblioteca;

import java.util.Scanner;

public class ReturnMovieOption extends BibliotecaMenuOption {
    public ReturnMovieOption(Library library) {

        super(library);
        name = "Return movie";
    }

    @Override
    public void exec(String... word) {
        System.out.println("These are movies you should return,please input the name of movie:\n");
        System.out.println((new ListMoviesOption(library).getOutputOfListMovies()));
        Scanner s = new Scanner(System.in);
        library.returnItemByName(s.nextLine());

    }

}
