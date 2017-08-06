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
        System.out.println(new ListBooksOption(library).getOutputOfListBooks());
        Scanner s = new Scanner(System.in);
        if (!UserAccountOption.getLoginStatus()) {
            System.out.println("please log in before you check out book,input your library number and password:");
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
            System.out.println(getBookAvailableNotice());
        } else {
            System.out.println(getBookUnavailableNotice());
        }

    }



    public String getBookUnavailableNotice() {
        return "That book is not available";
    }

    public String getBookAvailableNotice() {
        return "Thank you! Enjoy the book";
    }

}

