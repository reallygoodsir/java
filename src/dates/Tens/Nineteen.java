package dates.Tens;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Nineteen {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate userday = LocalDate.of(2015, Month.MAY, 15);
        Period diff = Period.between(userday, today);
    }
}
