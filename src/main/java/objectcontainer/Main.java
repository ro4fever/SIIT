package objectcontainer;


import objectcontainer.comparator.ComparatorByHeight;
import objectcontainer.comparator.ComparatorByName;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Person> nameSet = new TreeSet<Person>(new ComparatorByName());

        nameSet.add(new Person("Cristian", 175));
        nameSet.add(new Person("Claudiu", 168));
        nameSet.add(new Person("Flavia", 187));
        nameSet.add(new Person("George", 176));

        for (Person p : nameSet) {
            System.out.println(p);
        }

        System.out.println("-----------------------------------------------------------------------");

        TreeSet<Person> heightSet = new TreeSet<Person>(new ComparatorByHeight());

        heightSet.add(new Person("Cristian", 175));
        heightSet.add(new Person("Claudiu", 168));
        heightSet.add(new Person("Flavia", 187));
        heightSet.add(new Person("George", 176));

        for (Person p : heightSet) {
            System.out.println(p);
        }

        System.out.println("-----------------------------------------------------------------------");

        HashMap<Person, List<Address>> personInfo = new HashMap<>();

        for (Person p : nameSet) {
            if (p.getName().equals("Cristian")) {
                p.addNewHobbyAddress("Swimming", 2, "Pool");
                p.addNewHobbyAddress("Cycling", 3, "Pavement");
            } else if (p.getName().equals("Claudiu")) {
                p.addNewHobbyAddress("Hiking", 2, "Mountain");
                p.addNewHobbyAddress("Football", 3, "grass field");
            } else if (p.getName().equals("Flavia")) {
                p.addNewHobbyAddress("Shopping", 2, "Mall");
                p.addNewHobbyAddress("Pilates", 3, "gym");
            } else if (p.getName().equals("George")) {
                p.addNewHobbyAddress("Reading", 5, "random house");
                p.addNewHobbyAddress("Gardening", 2, "home");
            }
        }

        for (Person p : nameSet) {
            personInfo.put(p, p.getHobbyAddressList());
        }

        Person.printCertainPerson(personInfo, "Cristian");
    }
}
