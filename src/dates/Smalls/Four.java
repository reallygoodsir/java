package dates.Smalls;
import java.util.Calendar;

public class Four {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.getActualMinimum(Calendar.YEAR);
        int month = cal.getActualMinimum(Calendar.MONTH);
        int week = cal.getActualMinimum(Calendar.WEEK_OF_YEAR);
        int date = cal.getActualMinimum(Calendar.DATE);
        System.out.println(year);
        System.out.println(month);
        System.out.println(week);
        System.out.println(date);
    }
}
