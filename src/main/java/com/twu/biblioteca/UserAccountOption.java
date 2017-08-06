package com.twu.biblioteca;

public class UserAccountOption extends BibliotecaMenuOption {

    public User logedInUser = null;

    public UserAccountOption(Library library) {

        super(library);
        this.name = "User Account";
    }

    @Override
    public void exec(String... word) {

        System.out.println(getLogedInUserInformation());


    }

    public boolean getLoginStatus() {
        return logedInUser != null;

    }

    public String getLogedInUserInformation() {
        if (getLoginStatus()) {
            return logedInUser.getInfomation();
        } else {
            return "Please input your library number and password to login";
        }
    }
}
