package oop.librarycatalogue.managelibrary;


import oop.librarycatalogue.book.ArtAlbum;
import oop.librarycatalogue.book.Book;
import oop.librarycatalogue.book.Novel;

public class DataOutput{

    static void viewAllCatalogue() {
        for (Book book: DataInput.getBooksList()) {
            System.out.printf("The Book number %d has the title: \"%s\", with the number of %d pages.%n", DataInput.getBooksList().indexOf(book) + 1, book.getName(), book.getPages());
        }

        for (Novel novel: DataInput.getNovelsList()) {
            System.out.printf("The Novel number %d of type '%s' has the title: \"%s\", with the number of %d pages.%n", DataInput.getNovelsList().indexOf(novel) + 1, novel.getType(), novel.getName(), novel.getPages());
        }

        for (ArtAlbum artAlbum: DataInput.getArtAlbumsList()) {
            System.out.printf("The Art Album number %d of quality type '%s' has the title: \"%s\", with the number of %d pages.%n", DataInput.getArtAlbumsList().indexOf(artAlbum) + 1, artAlbum.getType(), artAlbum.getName(), artAlbum.getPages());
        }

        System.out.printf("%nPress any number and return for another action or 0 to exit.%n");
        System.out.println();
    }

    static void viewBooks() {
        for (Book book: DataInput.getBooksList()) {
            System.out.printf("The Book number %d has the title: \"%s\", with the number of %d pages.%n", DataInput.getBooksList().indexOf(book) + 1, book.getName(), book.getPages());
            System.out.println();
        }
    }

    static void viewNovels() {
        for (Novel novel: DataInput.getNovelsList()) {
            System.out.printf("The Novel number %d of type '%s' has the title: \"%s\", with the number of %d pages.%n", DataInput.getNovelsList().indexOf(novel) + 1, novel.getType(), novel.getName(), novel.getPages());
            System.out.println();
        }
    }

    static void viewArtAlbums() {
        for (ArtAlbum artAlbum: DataInput.getArtAlbumsList()) {
            System.out.printf("The Art Album number %d of quality type '%s' has the title: \"%s\", with the number of %d pages.%n", DataInput.getArtAlbumsList().indexOf(artAlbum) + 1, artAlbum.getType(), artAlbum.getName(), artAlbum.getPages());
            System.out.println();
        }
    }
}
