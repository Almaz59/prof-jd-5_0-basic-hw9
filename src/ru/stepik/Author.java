package ru.stepik;

public class Author {
    private String firstNameOfAuthor;
    private String lastNameOfAuthor;

    public Author(String firstNameOfAuthor, String lastNameOfAuthor) {
        this.firstNameOfAuthor = firstNameOfAuthor;
        this.lastNameOfAuthor = lastNameOfAuthor;
    }

    public String getFirstNameOfAuthor() {
        return this.firstNameOfAuthor;
    }

    public String getLastNameOfAuthor() {
        return this.lastNameOfAuthor;
    }
}
