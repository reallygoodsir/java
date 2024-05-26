package dates.thirties;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class ThirtyThree {
    public static void main(String[] args) {
        LocalDate rn = LocalDate.now();
        System.out.println(rn.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));
        System.out.println(rn.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
    }
}
