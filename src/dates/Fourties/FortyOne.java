package dates.Fourties;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FortyOne {
    public static void main(String[] args) {
        LocalDate local_Dt = LocalDate.now();

        LocalTime local_Time = LocalTime.now();

        LocalDateTime localDateTime = LocalDateTime.of(local_Dt, local_Time);
    }
}
