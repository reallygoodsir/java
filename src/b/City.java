package b;

import java.util.List;

public class City {
    private String name;
    private List<District> districts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> d) {
        this.districts = d;
    }
}
