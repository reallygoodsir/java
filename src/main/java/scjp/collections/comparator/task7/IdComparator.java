package scjp.collections.comparator.task7;

import java.util.Comparator;

public class IdComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
