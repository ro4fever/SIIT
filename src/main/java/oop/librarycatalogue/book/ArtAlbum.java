package oop.librarycatalogue.book;


public class ArtAlbum extends Book {

    private String name;

    private int pages;

    private String type;

    public ArtAlbum(String inputName, int inputPages, String inputTypes) {
        this.name = inputName;
        this.pages = inputPages;
        this.type = inputTypes;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPages() {
        return pages;
    }

    public String getType() {
        return type;
    }

    String[] albumArtTypes = {"Classic semi gloss paper",
            "Glossy paper",
            "Lay-flat matt paper"};

    @Override
    public String addBookName() {
        System.out.println("You selected the option to add an Art Album! Please write the name of the Art Album:");
        return scan.nextLine();
    }

    @Override
    public int addBookPages() {
        System.out.println("You selected the option to add an Art Album! Please write the number of pages:");
        return Integer.parseInt(scan.nextLine());
    }

    public String addAlbumArtType() {
        System.out.println("You selected the option to add a Art Album! Please select the type of the pages:");
        for (int i = 0; i < albumArtTypes.length; i++) {
            System.out.println(i + 1 + ". " + albumArtTypes[i]);
        }
        String numType = scan.nextLine();

        String albumArtType = "";

        for (int i = 0; i < albumArtTypes.length; i++) {
            if (numType.matches(String.valueOf(i + 1))) {
                albumArtType = albumArtTypes[i];
                break;
            }
        }
        return albumArtType;
    }
}
