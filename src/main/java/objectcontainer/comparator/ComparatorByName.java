package objectcontainer.comparator;


import objectcontainer.Person;
import java.util.Comparator;

public class ComparatorByName implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        return ((Person) o1).getName().compareTo(((Person) o2).getName());
    }



}
