package dates.fourties;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class FortyFive {
    public static void main(String[] args) {
        String print;

        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatterLocalDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        print = formatterLocalDate.format(localDate);
        System.out.println("\nyyyy-MM-dd: " + print);

        LocalTime localTime = LocalTime.now();
        DateTimeFormatter formatterLocalTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        print = formatterLocalTime.format(localTime);
        System.out.println("\nHH:mm:ss: " + print);

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatterLocalDateTime =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        print = formatterLocalDateTime.format(localDateTime);
        System.out.println("\nyyyy-MM-dd HH:mm:ss: " + print);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        DateTimeFormatter formatterZonedDateTime =
                DateTimeFormatter.ofPattern("E MMM yyyy HH:mm:ss.SSSZ");
        print = formatterZonedDateTime.format(zonedDateTime);
        System.out.println("\nE MMM yyyy HH:mm:ss.SSSZ: " + print);

        OffsetTime offsetTime = OffsetTime.now();
        DateTimeFormatter formatterOffsetTime =
                DateTimeFormatter.ofPattern("HH:mm:ss,Z");
        print = formatterOffsetTime.format(offsetTime);
        System.out.println("\nHH:mm:ss,Z: " + print);
    }
}
