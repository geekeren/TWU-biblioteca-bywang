package com.twu.biblioteca;

public class Movie extends LibItem {
    public String director;
    public int rate;

    public Movie(String name, String director, int year) {
        this.name = name;
        this.director = director;
        this.yearPublished = year;
    }

    @Override
    public String getDetails() {
        return String.format("《%s》-Director：%s ；Year：%d;Rate: %d", name, director, yearPublished, rate);
    }

    @Override
    public String getName() {
        return name;
    }

    public void updateRate(int i) {
        rate = i;
    }
}
