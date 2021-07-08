package ua.lviv.lgs.lesson21.lecture;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;

public class AppDates {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.plusDays(6).plusWeeks(2).minusMonths(5).plusYears(5));
        System.out.println(localDate.getEra());
        System.out.println(localDate.isLeapYear());
        System.out.println(localDate.atStartOfDay());
        System.out.println(localDate.ofEpochDay(12344));

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.plusHours(4).minusMinutes(55));
        System.out.println(localTime.truncatedTo(ChronoUnit.HOURS));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.plusDays(5).minusMonths(4).plusSeconds(44).minusSeconds(4));
        System.out.println();

        Date date = new Date();

    }
}
