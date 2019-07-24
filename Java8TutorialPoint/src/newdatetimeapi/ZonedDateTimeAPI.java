package newdatetimeapi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeAPI {
    public static void main(String[] args) {

        ZonedDateTimeAPI zonedDateTimeAPI = new ZonedDateTimeAPI();
        zonedDateTimeAPI.testZoneDateTime();
    }

    public void testZoneDateTime(){
        //Get the current date and time
        ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
        System.out.println("date1: "+ date1);

        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: "+ zoneId);

        ZoneId currentZoneId = ZoneId.systemDefault();
        System.out.println("CurrentZone: "+ currentZoneId);

        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println("ZonedDateTime Now: "+ zdt);

        LocalDateTime zdt2LocalDateTime = ZonedDateTime.now().toLocalDateTime();
        System.out.println("ZonedDateTime converted to LocalDateTime: " + zdt2LocalDateTime);

    }
}
