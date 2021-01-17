package edu.dainius;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Maironis",LocalDate.of(1920,12,1), 300, "Baltos Lankos");
        Book book2 = new Book("Biliunas",LocalDate.of(1920,12,1), 300, "Tito Alba");
        System.out.println(book1.getAuthor());
        System.out.println(book2.getAuthor());
    }
}
