package dates.Thirties;

import java.time.LocalDateTime;

public class ThirtyOne {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2016, 9, 16, 0, 0);
        LocalDateTime dateTime2 = LocalDateTime.now();
        int differenceNanoseconds = java.time.Duration.between(dateTime, dateTime2).getNano();
        long differenceSeconds = java.time.Duration.between(dateTime, dateTime2).getSeconds();
        long differenceMilliseconds = java.time.Duration.between(dateTime, dateTime2).toMillis();
        long differenceMinutes = java.time.Duration.between(dateTime, dateTime2).toMinutes();
        long differenceHours = java.time.Duration.between(dateTime, dateTime2).toHours();
    }
}
