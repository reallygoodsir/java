package dates.smalls;

import java.util.Calendar;

public class Ten {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int max = cal.getActualMaximum(Calendar.DAY_OF_WEEK);
        int min = cal.getActualMinimum(Calendar.DAY_OF_WEEK);
        System.out.println(max);
        System.out.println(min);
    }
}
