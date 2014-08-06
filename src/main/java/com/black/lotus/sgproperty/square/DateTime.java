package com.black.lotus.sgproperty.square;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static java.lang.System.out;

/**
 * Created by johndoe on 8/5/14.
 */
public class DateTime {
    public static void main(String... args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        zonedDateTime.withZoneSameLocal(ZoneId.of("Europe/London"));
        LocalDateTime someDay = LocalDateTime.of(2014, 12, 12, 0, 0);
        ZonedDateTime zonedDateTime1 = someDay.atZone(ZoneId.of("Europe/London"));

        out.println(zonedDateTime1.withZoneSameInstant(ZoneId.of("Asia/Singapore")));
    }
}
