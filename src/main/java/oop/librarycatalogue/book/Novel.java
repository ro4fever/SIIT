package oop.librarycatalogue.book;

public class Novel extends Book {

    private String name;

    private int pages;

    private String type;

    public Novel(String inputName, int inputPages, String inputTypes) {
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

    String[] novelTypes = {"Mystery",
            "Science Fiction",
            "Thriller",
            "Romance"};

    @Override
    public String addBookName() {
        System.out.println("You selected the option to add a Novel! Please write the name of the Novel:");
        return scan.nextLine();
    }

    @Override
    public int addBookPages() {
        System.out.println("You selected the option to add a Novel! Please write the number of pages:");
        return Integer.parseInt(scan.nextLine());
    }

    public String addNovelType() {
        System.out.println("You selected the option to add a Novel! Please select the type of the novel:");
        for (int i = 0; i < novelTypes.length; i++) {
            System.out.println(i + 1 + ". " + novelTypes[i]);
        }
        String numType = scan.nextLine();

        String novelType = "";

        for (int i = 0; i < novelTypes.length; i++) {
            if (numType.matches(String.valueOf(i + 1))) {
                novelType = novelTypes[i];
                break;
            }
        }
        return novelType;
    }
}
