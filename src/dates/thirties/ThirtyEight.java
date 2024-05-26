package dates.thirties;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ThirtyEight {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2019, 1, 1);
        LocalDate ld2 = LocalDate.of(2020, 3, 1);

        long difference = Math.abs(ChronoUnit.DAYS.between(ld1, ld2));
    }
}
