package objectcontainer.comparator;


import objectcontainer.Person;
import java.util.Comparator;

public class ComparatorByHeight implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        return (((Person) o1).getHeight() - ((Person) o2).getHeight());
    }

}
