package ru.stepik;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Java 8. Полное руководство", 2015);
        Author author = new Author("Герберт", "Шилдт");
        Book book1 = new Book("Старик и море", 1952);
        Author author1 = new Author("Эрнест", "Хемингуэй");
        System.out.println("book.getNameOfBook() = " + book.getNameOfBook());
        book.setYearOfPublication(2020);
        System.out.println("book.yearOfPublication = " + book.yearOfPublication);
        System.out.println("author.getFirstNameOfAuthor() = " + author.getFirstNameOfAuthor());
        System.out.println("author.getLastNameOfAuthor() = " + author.getLastNameOfAuthor());
        System.out.println("book1.getNameOfBook() = " + book1.getNameOfBook());
        System.out.println("author1.getFirstNameOfAuthor() = " + author1.getFirstNameOfAuthor());
        System.out.println("author1.getLastNameOfAuthor() = " + author1.getLastNameOfAuthor());
    }
}
