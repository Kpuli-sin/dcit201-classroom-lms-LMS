package org.example;

public class Book {

    // This is your working class.
    private String title;
    private String author;
    private int YearPublished;


    public Book(String title, String author, int YearPublished) {
        this.title = title;
        this.author = author;
        this.YearPublished = YearPublished;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return YearPublished;
    }
}
