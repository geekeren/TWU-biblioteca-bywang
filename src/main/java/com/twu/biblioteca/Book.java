package com.twu.biblioteca;

public class Book {
    public String name;
    public String author;
    public int yearPublished;

    public Book(String name, String author,int yearPublished) {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getDetails() {
        return String.format("《%s》 Author：%s ；Year：%d", name, author, yearPublished);
    }

}
