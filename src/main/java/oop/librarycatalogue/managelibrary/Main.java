package oop.librarycatalogue.managelibrary;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char numSelect;

        do {
            System.out.println("Welcome to the Library Catalogue! Please select:\n" +
                    "'1' to add books;\n" +
                    "'2' to delete books;\n" +
                    "'3' to explore all the library catalogue.\n");

            numSelect = scan.next().charAt(0);

            switch (numSelect) {
                case '1':
                    System.out.println("You selected the option to add books! Please select:\n" +
                            "'1' to add a Book;\n" +
                            "'2' to add a Novel;\n" +
                            "'3' to add an Art Album;\n" +
                            "-------------------------------------------------------------\n" +
                            "'0' to exit.\n");
                    numSelect = scan.next().charAt(0);
                    switch (numSelect) {
                        case '1':
                            DataInput.addBook();
                            break;
                        case '2':
                            DataInput.addNovel();
                            break;
                        case '3':
                            DataInput.addArtAlbum();
                            break;
                        default:
                            break;
                    }
                    break;

                case '2':
                    System.out.println("You selected the option to delete books! Please select:\n" +
                            "'1' to delete a Book;\n" +
                            "'2' to delete a Novel;\n" +
                            "'3' to delete an Art Album;\n" +
                            "'4' to empty the Book catalogue;\n" +
                            "'5' to empty the Novel catalogue;\n" +
                            "'6' to empty the Art Album catalogue;\n" +
                            "'7' to empty the entire library catalogue;\n" +
                            "-------------------------------------------------------------\n" +
                            "'Any other character' to exit deletion;\n" +
                            "'0' to exit.\n");
                    numSelect = scan.next().charAt(0);
                    switch (numSelect) {
                        case '1': {
                            if (DataInput.getBooksList().size() != 0) {
                                System.out.println("You selected the option to delete a Book. There is the list of Books:");
                                DataOutput.viewBooks();
                                System.out.println("Enter the number of the Book you want to delete:");
                                RemoveObject.removeBook(scan.nextInt());
                                System.out.println("\nThere is the updated list of Books:");
                                DataOutput.viewBooks();
                            } else System.out.println("There is nothing to delete!\n");
                        }
                        break;
                        case '2': {
                            if (DataInput.getNovelsList().size() != 0) {
                                System.out.println("You selected the option to delete a Novel. There is the list of Novels:");
                                DataOutput.viewNovels();
                                System.out.println("Enter the number of the Novel you want to delete:");
                                RemoveObject.removeNovel(scan.nextInt());
                                System.out.println("\nThere is the updated list of Novels:");
                                DataOutput.viewNovels();
                            } else System.out.println("There is nothing to delete!\n");
                        }
                        break;
                        case '3': {
                            if (DataInput.getArtAlbumsList().size() != 0) {
                                System.out.println("You selected the option to delete an Art Album. There is the list of Art Albums:");
                                DataOutput.viewArtAlbums();
                                System.out.println("Enter the number of the ArtAlbum you want to delete:");
                                RemoveObject.removeArtAlbum(scan.nextInt());
                                System.out.println("\nThere is the updated list of Art Albums:");
                                DataOutput.viewArtAlbums();
                            } else System.out.println("There is nothing to delete!\n");
                        }
                        break;
                        case '4':
                            if (DataInput.getBooksList().size() != 0) {
                                RemoveObject.removeAllBooks();
                            } else System.out.println("There is nothing to delete!\n");
                            break;
                        case '5':
                            if (DataInput.getNovelsList().size() != 0) {
                                RemoveObject.removeAllNovels();
                            } else System.out.println("There is nothing to delete!\n");
                            break;
                        case '6':
                            if (DataInput.getArtAlbumsList().size() != 0) {
                                RemoveObject.removeAllArtAlbums();
                            } else System.out.println("There is nothing to delete!\n");
                            break;
                        case '7':
                            if (DataInput.getBooksList().size() != 0 || DataInput.getNovelsList().size() != 0 || DataInput.getArtAlbumsList().size() != 0) {
                                RemoveObject.removeAll();
                            } else System.out.println("There is nothing to delete!\n");
                            break;
                    }
                    break;

                case '3':
                    System.out.println("You selected the option to explore all items in the library!\n");
                    DataOutput.viewAllCatalogue();
                    numSelect = scan.next().charAt(0);
                    break;

                default:
                    System.out.println("Please enter any number or '0' to exit.\n");
                    numSelect = scan.next().charAt(0);
            }
        } while (numSelect != '0');

        scan.close();

    }
}
