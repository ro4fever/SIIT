package oop.librarycatalogue.book;


import java.util.Scanner;

public class Book {

    private String name;

    private int pages;

    Scanner scan = new Scanner(System.in);

    public Book(String inputName, int inputPages) {
        this.name = inputName;
        this.pages = inputPages;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }


    public String addBookName() {
        System.out.println("You selected the option to add a Book! Please write the name of the Book:");
        return scan.nextLine();
    }

    public int addBookPages() {
        System.out.println("You selected the option to add a Book! Please write the number of pages:");
        return Integer.parseInt(scan.nextLine());
    }

}
