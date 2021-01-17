package edu.dainius;

import java.time.LocalDate;

public class Book {
    /*
    Create a class for a book. Add as many fields as you can

    A book has a release date. Release date CANNOT CHANGE. Model this in a class

    Author, amount of pages, name cannot change either

    Setting negative count of pages does not do antyhing

    Only not null, not empty author name can be set

    Create a class Validations and a function in it StringNotNullOrEmpty


     */


    private int AmountOfPages;
    private final LocalDate  ReleaseDate;
    private  String Author;
    private String  Publisher;


    public Book(String auth, LocalDate date, int pages, String publisher ) {


        this.ReleaseDate = date;
        this.Publisher = publisher;

        if (pages<=0){
            this.AmountOfPages = 0;
        }else{
            this.AmountOfPages = pages;
        }

        if (auth == null || auth.isEmpty()){
            System.out.println("Author name is must");
        }else{

            this.Author = auth;
        }

    }

    public String getAuthor() {
        return Author;
    }

    public LocalDate getReleaseDate() {
        return ReleaseDate;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

}
