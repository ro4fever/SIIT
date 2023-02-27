package oop.librarycatalogue.managelibrary;


import oop.librarycatalogue.book.ArtAlbum;
import oop.librarycatalogue.book.Book;
import oop.librarycatalogue.book.Novel;
import java.util.ArrayList;

public class DataInput {

    private static String name;

    private static int pages;

    private static String type;

    private static Book book = new Book(name, pages);

    private static Novel novel = new Novel(name, pages, type);

    private static ArtAlbum artAlbum = new ArtAlbum(name, pages, type);

    private static ArrayList<Book> booksList = new ArrayList<Book>();

    private static ArrayList<Novel> novelsList = new ArrayList<Novel>();

    private static ArrayList<ArtAlbum> artAlbumsList = new ArrayList<ArtAlbum>();

    static void addBook() {
        Book newBook = new Book(book.addBookName(), book.addBookPages());

        booksList.add(newBook);

        System.out.printf("You added a book with the title: '%s' and number of pages: %d .%n", newBook.getName(), newBook.getPages());
        System.out.println();
    }

    static void addNovel() {
        Novel newNovel = new Novel(novel.addBookName(), novel.addBookPages(), novel.addNovelType());

        novelsList.add(newNovel);

        System.out.printf("You added a novel with the title: '%s', number of pages: %d, of type: '%s'.%n", newNovel.getName(), newNovel.getPages(), newNovel.getType());
        System.out.println();
    }

    static void addArtAlbum() {

        ArtAlbum newArtAlbum = new ArtAlbum(artAlbum.addBookName(), artAlbum.addBookPages(), artAlbum.addAlbumArtType());

        artAlbumsList.add(newArtAlbum);

        System.out.printf("You added an Art Album with the title: '%s', number of pages: %d, with paper quality: '%s'.%n", newArtAlbum.getName(), newArtAlbum.getPages(), newArtAlbum.getType());
        System.out.println();
    }

    static ArrayList<Book> getBooksList() {
        return booksList;
    }

    static ArrayList<Novel> getNovelsList() {
        return novelsList;
    }

    static ArrayList<ArtAlbum> getArtAlbumsList() {
        return artAlbumsList;
    }

}
