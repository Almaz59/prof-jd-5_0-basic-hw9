package ru.stepik;

public class Book {
    private String nameOfBook;
    private Author nameOfAuthor;
    int yearOfPublication;

    public Book(String nameOfBook, int yearOfPublication) {
        this.nameOfBook = nameOfBook;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameOfBook() {

        return this.nameOfBook;
    }

    public Author getNameOfAuthor() {

        return this.nameOfAuthor;
    }


    public void setYearOfPublication(int yearOfPublication) {

        this.yearOfPublication = yearOfPublication;
    }
}

