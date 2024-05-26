package dates.tens;

import java.util.Calendar;
import java.util.Date;

public class Thirteen {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date userChoice = new Date();
        cal.setTime(userChoice);
        System.out.println();
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek);
    }
}
