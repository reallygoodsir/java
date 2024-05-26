package dates.smalls;

import java.util.Calendar;

public class Three {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.getActualMaximum(Calendar.YEAR);
        int month = cal.getActualMaximum(Calendar.MONTH);
        int week = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
        int date = cal.getActualMaximum(Calendar.DATE);
        System.out.println(year);
        System.out.println(month);
        System.out.println(week);
        System.out.println(date);
    }
}
