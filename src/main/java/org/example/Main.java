package org.example;

public class Main {
    public static void main(String[] args) {
        Book book_1 = new Book("Don Quijote", "Miguel Cervantes", "123ABC");
        Book book_2 = new Book("Caperucita Roja", "Charles Perrault", "123ABC");
        Book book_3 = new Book("La Iliada", "Homero", "123ABC");
        Book book_4 = new Book("Romeo y Julieta", "William Shakespeare", "123ABC");
        Book book_5 = new Book("Macbeth", "William Shakespeare", "123ABC");
        LinkedList linkedList = new LinkedList();
        linkedList.addStart(book_1);
        linkedList.showList();
    }
}