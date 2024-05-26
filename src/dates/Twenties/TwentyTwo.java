package dates.Twenties;

import java.util.Calendar;
import java.util.Date;

public class TwentyTwo {
    public static void main(String[] args) {
        Calendar calendarB = Calendar.getInstance();
        Calendar calendarA = Calendar.getInstance();
        calendarA.add(Calendar.DAY_OF_MONTH, 10);
        calendarB.add(Calendar.DAY_OF_MONTH, -10);
        Date after = calendarA.getTime();
        Date before = calendarB.getTime();
        System.out.println(after.getDay());
        System.out.println(before.getDay());
    }
}
