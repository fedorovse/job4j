package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book shildt = new Book("Java8", 1200);
        Book horstman = new Book("Java Biblioteka professionala", 800);
        Book sierra = new Book("Head first", 600);
        Book martin = new Book("Clean code", 1500);
        Book[] books = new Book[4];
        books[0] = shildt;
        books[1] = horstman;
        books[2] = sierra;
        books[3] = martin;
        System.out.println("");
        for (int index = 0; index < books.length; index++) {
            System.out.println("book : " + books[index].getName()
                    + " number of pages : " + books[index].getPages());
        }
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        System.out.println("");
        for (int index = 0; index < books.length; index++) {
            System.out.println("book : " + books[index].getName()
                    + " number of pages : " + books[index].getPages());
        }
        System.out.println("");
        for (int index = 0; index < books.length; index++) {
            if (books[index].getName().equals("Clean code")) {
                System.out.println("book : " + books[index].getName()
                    + " number of pages : " + books[index].getPages());
            }
        }
    }
}
