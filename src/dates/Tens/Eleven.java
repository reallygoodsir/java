package dates.Tens;

import java.util.Calendar;

public class Eleven {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(days);
    }
}
