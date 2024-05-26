package dates.thirties;

import java.time.LocalDate;
import java.time.Period;

public class Thirty {
    public static void main(String[] args) {
        LocalDate one = LocalDate.of(2012, 1, 4);
        LocalDate two = LocalDate.now();

        Period difference = Period.between(one, two);
    }
}
