package dates.twenties;

import java.time.LocalDate;
import java.time.Month;

public class TwentySix {
    public static void main(String[] args) {
        LocalDate ldt = LocalDate.of(2016, Month.JANUARY, 10);
        Month mn = ldt.getMonth();
        int mnIntValue = mn.getValue();
        int minLength = mn.minLength();
        int maxLength = mn.maxLength();
        Month quarter = mn.firstMonthOfQuarter();
        System.out.println("Integer value of the current month: " + mnIntValue);
        System.out.println("Length of the month: " + minLength);
        System.out.println("Maximum length of the month: " + maxLength);
        System.out.println("First month of the Quarter: " + quarter);
    }
}
