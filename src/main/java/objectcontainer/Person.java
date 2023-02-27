package objectcontainer;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private int height;
    private List<Address> hobbyAddressList = new ArrayList<>();
    public Person (String inputName, int inputHeight) {
        this.name = inputName;
        this.height = inputHeight;
    }
    public void addNewHobbyAddress(String hobbyName, int inputFrequency, String address) {
        hobbyAddressList.add(new Hobby(hobbyName, inputFrequency, address));
    }
    public static void printCertainPerson (HashMap<Person, List<Address>> info, String name) {
        for (Person key : info.keySet()) {
            if (key.getName() == name) {
                System.out.println("key: " + key.getName() + " value: " +
                        info.get(key));
            }
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person that = (Person) o;
        return height == that.height && Objects.equals(name, that.height);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, height);
    }
    @Override
    public String toString() {
        return "PersonForTreeSet {" +
                "name = '" + name + '\'' +
                ", height = " + height +
                '}';
    }
    public String getName() {
        return this.name;
    }
    public int getHeight() {
        return this.height;
    }
    public List<Address> getHobbyAddressList() {
        return hobbyAddressList;
    }
}
