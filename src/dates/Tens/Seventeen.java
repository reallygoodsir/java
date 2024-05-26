package dates.Tens;

import java.util.Calendar;
import java.util.Date;

public class Seventeen {
    public static void main(String[] args) {
        Calendar calendarB = Calendar.getInstance();
        Calendar calendarA = Calendar.getInstance();
        calendarA.add(Calendar.YEAR, 1);
        calendarB.add(Calendar.YEAR, -1);
        Date after = calendarA.getTime();
        Date before = calendarB.getTime();
        System.out.println(after.getYear());
        System.out.println(before.getYear());
    }
}
