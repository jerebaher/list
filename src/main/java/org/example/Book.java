package org.example;

public class Book {
    String name, author, IBSN;

    public Book(String name, String author, String IBSN) {
        this.name = name;
        this.author = author;
        this.IBSN = IBSN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", IBSN='" + IBSN + '\'' +
                '}';
    }
}
