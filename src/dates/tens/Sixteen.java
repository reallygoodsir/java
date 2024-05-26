package dates.tens;

import java.util.Calendar;
import java.util.Date;

public class Sixteen {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 14);
        Date date = calendar.getTime();
    }
}
