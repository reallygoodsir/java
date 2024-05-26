package dates.thirties;

import java.time.LocalDate;
import java.time.Period;

public class ThirtyTwo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1989, 4, 11);
        LocalDate now = LocalDate.now();
        Period difference = Period.between(date , now);
    }
}
