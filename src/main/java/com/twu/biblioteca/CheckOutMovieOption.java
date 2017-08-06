package com.twu.biblioteca;

import java.util.Scanner;

public class CheckOutMovieOption extends BibliotecaMenuOption {

    public CheckOutMovieOption(Library library) {
        super(library);
        this.name = "Check out movie";
    }

    @Override
    public void exec(String... word) {

        System.out.println("These are movies you can check out,please input the name of movie to select a movie:\n");
        System.out.println((new ListMoviesOption(library).getOutputOfListMovies()));
        Scanner s = new Scanner(System.in);
        if (!UserAccountOption.getLoginStatus()) {
            System.out.println("please log in before you check out movie,input your library number and password:");
            String number = s.next();
            String password = s.next();
            User user = library.getUserByLibNO(number);
            if (user != null && user.loginWithPassword(password)) {
                UserAccountOption.logedInUser = user;
                System.err.println("Now you are logged in!");
            } else
                System.err.println("User or Password error\n");
        }
        if (library.checkedOutItemWithUserByName(s.nextLine(), "")) {
            System.out.println(getMovieAvailableNotice());
        } else {
            System.out.println(getMovieUnavailableNotice());
        }

    }


    public String getMovieUnavailableNotice() {
        return "That movie is not available";
    }

    public String getMovieAvailableNotice() {
        return "Thank you! Enjoy the movie";
    }

}

