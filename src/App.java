import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        StringUtils.convertToString(2, 3, 4.3);
        StringUtils.convertToString(40, 30, 4.39);

        Fruit kiwi = new Fruit("GREEN", 5);
        Fruit banana = new Fruit();
        banana.setColor("YELLOW");
        banana.setSize(9);

        System.out.println(kiwi.getColor() + "   " + kiwi.getSize());

        City lviv = new City();
        lviv.setName("Lviv");
        City dnipro = new City();
        dnipro.setName("Dnipropetrovsk");

        List<City> cities = new ArrayList<>();
        cities.add(lviv);
        cities.add(dnipro);
        List<City> cities2 = Arrays.asList(lviv, dnipro);

        Country ua = new Country();
        ua.setName("Ukraine");
        ua.setCities(cities);

        Address address = new Address();
        address.setCountryName("UA");
        address.setCityName("Lviv");
        address.setStreet("Zamarstynivska 22");

        Person oleh = new Person();
        oleh.setName("Oleh");
        oleh.setAddress(address);
    }
}
