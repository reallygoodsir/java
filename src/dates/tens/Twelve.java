package dates.tens;

import java.text.DateFormatSymbols;
import java.util.Locale;

public class Twelve {
    public static void main(String[] args) {
        DateFormatSymbols symbols = new DateFormatSymbols(new Locale("de"));
        String[] days = symbols.getWeekdays();
        for (String s : days) {
            System.out.println(s);
        }
    }
}

