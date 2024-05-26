package dates.fourties;

import java.time.*;

public class FortyFour {
    public static void main(String[] args) {
        ZoneOffset zoneOffsetUTC = ZoneOffset.UTC;
        ZoneId defaultZoneId = ZoneOffset.systemDefault();

        LocalDateTime ldt = LocalDateTime.of(2019, 3, 15, 0, 0);
        ZoneId zoneId = ZoneId.of("Europe/Bucharest");
        ZoneOffset zoneOffset = zoneId.getRules().getOffset(ldt);

        ZoneOffset zoneOffsetFromString = ZoneOffset.of("+02:00");

        OffsetTime offsetTime = OffsetTime.now(zoneOffsetFromString);
        OffsetDateTime offsetDateTime = OffsetDateTime.now(zoneOffsetFromString);

        ZoneOffset zoneOffsetFromHoursMinutes = ZoneOffset.ofHoursMinutes(8, 30);

        ZoneOffset zoneOffsetFromOdt = offsetDateTime.getOffset();
    }
}
