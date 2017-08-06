package com.twu.biblioteca;

public class UserAccountOption extends BibliotecaMenuOption {

    public static User logedInUser = null;

    public UserAccountOption(Library library) {

        super(library);
        this.name = "User Account";
    }

    @Override
    public void exec(String... word) {

        System.out.println(getLogedInUserInformation());


    }

    public static boolean getLoginStatus() {
        return logedInUser != null;

    }

    public static String getLogedInUserInformation() {
        if (getLoginStatus()) {
            return logedInUser.getInfomation();
        } else {
            return "Please input your library number and password to login";
        }
    }
}
