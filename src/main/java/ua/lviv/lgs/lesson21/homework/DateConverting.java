package ua.lviv.lgs.lesson21.homework;

import java.time.*;
import java.util.Date;

public class DateConverting {
    public static void main(String[] args) {
        DateConverting dc = new DateConverting();
        Date date = new Date();
        System.out.println("date: " + date);
        System.out.println("convertToLocalDate: " + dc.convertToLocalDate(date));
        System.out.println("convertToLocalTime: " + convertToLocalTime(date));
        System.out.println("convertToLocalDateTime: " + dc.convertToLocalDateTime(date));
    }

    public static LocalTime convertToLocalTime(Date date) {
        return Instant.ofEpochMilli(date.getTime())
                .atZone(ZoneId.systemDefault()).toLocalTime();
    }

    public LocalDate convertToLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public LocalDateTime convertToLocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}
