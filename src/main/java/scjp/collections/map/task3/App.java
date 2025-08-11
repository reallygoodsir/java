package scjp.collections.map.task3;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        addContact("Peter", "111222333", map);
        addContact("Paul", "444555", map);
        addContact("George", "666777", map);
        System.out.println(map);
        removeContact("Paul", "444555", map);
        System.out.println(map);
        System.out.println(getContact("George", map));
    }

    public static Map<String, String> addContact(String contactName, String contactPhoneNumber, Map<String, String> map) {
        map.put(contactName, contactPhoneNumber);
        return map;
    }

    public static Map<String, String> removeContact(String contactName, String contactPhoneNumber, Map<String, String> map) {
        map.remove(contactName, contactPhoneNumber);
        return map;
    }

    public static String getContact(String contactName, Map<String, String> map) {
        return map.get(contactName);
    }
}
