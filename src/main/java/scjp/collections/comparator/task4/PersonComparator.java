package scjp.collections.comparator.task4;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if((!o1.getAge().equals(o2.getAge()))){
            return o1.getAge().compareTo(o2.getAge());
        }
        Integer length1 = o1.getName().length();
        Integer length2 = o2.getName().length();
        return  length2.compareTo(length1);
    }
}
