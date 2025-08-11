package scjp.threads.example5;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NameListBadExample {
    private List names = Collections.synchronizedList(new LinkedList());

    public void add(String name) {
        names.add(name);
    }

    public String removeFirst() {
        if (names.size() > 0) {
            return (String) names.remove(0);
        } else {
            return null;
        }
    }
}
