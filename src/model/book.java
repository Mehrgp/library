package model;
import view.ui_menu;

import java.util.Scanner;

public class book {
    private String name, auther;
    private int isbn;
    public int bookId;
    private Genre genre;
    Scanner scan = new Scanner(System.in);
    private long LastStatusChange;

    public book(int bookId, String name, String auther, int isbn, Genre gerne) {
        this.bookId = bookId;
        this.name = name;
        this.auther = auther;
        this.isbn = isbn;
        this.genre = gerne;
    }

    public book() {

        manageBook();
    }

    private void manageBook() {
        //  System.out.println("\n1- Add book" + "\n2-Edit book" + "\n3-delete");
        System.out.println("\n1-Add book" + "\n2-Edit book" + "\n3-delete");

        switch (scan.nextInt()) {
            case 1:
                addBook();
                break;
            case 2:
                editBook();
                break;
            case 3:
                print();
                break;

        }
    }

    private void addBook() {
        System.out.println("id:");
        bookId = scan.nextInt();
        System.out.println("Name:");
        name = scan.nextLine();
        System.out.println("auther");
        auther = scan.nextLine();
        System.out.println("ISBN:");
        isbn = scan.nextInt();
        System.out.println("Genre:");
        Genre[] genreArray = Genre.values();
        for (int i = 0; i < ((Genre[]) genreArray).length; i++) {
            System.out.println(i + "-" + genreArray[i]);
            //  Genre g =Genre.valueOf("dram");
            //   System.out.println(g);

        }
        Genre bookGenre = Genre.valueOf(genreArray[scan.nextInt()].toString());
        new book(bookId, name, auther, isbn, bookGenre);
        print();

    }

    public void bookValue() {
        addBook();
    }

    public String toString() {
        return "Book>{id:" + bookId + " name: " + name + " auther:" + auther + " ISBN:" + isbn + " genre:" + genre + "}";
    }

    public void print() {
        toString();
    }

    public void editBook() {
        name=scan.nextLine();
        auther = scan.nextLine();
        isbn=scan.nextInt();
        Genre[] genreArray = Genre.values();

    }

}





