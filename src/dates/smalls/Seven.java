package dates.smalls;

import java.util.Calendar;

public class Seven {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int something = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(something);
    }
}
