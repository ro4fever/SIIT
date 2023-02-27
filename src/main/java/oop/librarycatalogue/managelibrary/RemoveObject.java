package oop.librarycatalogue.managelibrary;


public class RemoveObject {

    public static void removeAll() {
        DataInput.getBooksList().clear();
        DataInput.getNovelsList().clear();
        DataInput.getArtAlbumsList().clear();
    }

    public static void removeAllBooks() {
        DataInput.getBooksList().clear();
    }

    public static void removeAllNovels() {
        DataInput.getNovelsList().clear();
    }

    public static void removeAllArtAlbums() {
        DataInput.getArtAlbumsList().clear();
    }

    public static void removeArtAlbum(int i) {
        DataInput.getArtAlbumsList().remove(i - 1);
    }

    public static void removeNovel(int i) {
        DataInput.getNovelsList().remove(i - 1);
    }

    public static void removeBook(int i) {
        DataInput.getBooksList().remove(i - 1);
    }
}
