package b;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        District b = new District();
        b.setName("b");
        District c = new District();
        c.setName("c");
        District a = new District();
        a.setName("a");

        List<District> districtList = new ArrayList<>();
        districtList.add(b);
        districtList.add(c);
        districtList.add(a);

        City lviv = new City();
        lviv.setName("Lviv");
        lviv.setDistricts(districtList);
    }
}
