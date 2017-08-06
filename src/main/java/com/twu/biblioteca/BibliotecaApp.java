package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {
    private Library library = new Library();
    List<BibliotecaMenuOption> options = new ArrayList<>(
            Arrays.asList(
                    new ListBooksOption(library),
                    new ListMoviesOption(library),
                    new CheckOutBookOption(library),
                    new CheckOutMovieOption(library),
                    new ReturnBookOption(library),
                    new ReturnMovieOption(library),
                    new UserAccountOption(library),
                    new QuitOption(library)
            )
    );

    public static void main(String[] args) {
        BibliotecaApp app =new BibliotecaApp();

        System.out.println(app.getWelcomeMsg());
        app.library.itemsStoredInLib.add(new Book("PHP Basic", "WBY", 2014));

        app.library.itemsStoredInLib.add(new Book("Java Web", "JonhY", 2014));
        app.library.itemsStoredInLib.add(new Book("CPP", "Wang", 2014));
        app.library.itemsStoredInLib.add(new Book("DSS", "WBY", 2016));

        app.library.itemsStoredInLib.add(new Movie("战狼2", "WuJing", 2017));
        app.library.itemsStoredInLib.add(new Movie("三生三世", "XXX", 2017));

        Scanner s  = new Scanner(System.in);

        while(true){
            System.out.print(app.getOptionList());
            int option = s.nextInt();
            if (app.isValidOption(option)) {
                app.options.get(option - 1).exec();
            }else{
                System.out.println("Invalid Option");
            }
        }



    }

    public  String getOptionList() {

        StringBuffer sb = new StringBuffer("Please select an option :\n");
        for(int i =1 ;i<=options.size();i++){
            sb.append("\t["+i+"]: "+options.get(i-1).name+"\n");
        }
        return sb.toString();
    }



    public String getWelcomeMsg() {
        return "Welcome to Biblioteca!";
    }


    public boolean isValidOption(int option) {
        return option > 0 && option <= options.size();
    }
}
