package com.kodilla.stream.book;

public final class Book {
    private final String author;
    private final String title;
    private final int yearOfpublication;
    private final String signature;


    public Book(String author, String title, int yearOfpublication, String signature) {
        this.author = author;
        this.title = title;
        this.yearOfpublication = yearOfpublication;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfpublication() {
        return yearOfpublication;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfpublication=" + yearOfpublication +
                ", signature='" + signature + '\'' +
                '}';
    }
}
