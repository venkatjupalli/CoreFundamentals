package com.core.java.java8.features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestDateAndTime {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        LocalTime lt=LocalTime.now();
        System.out.println(lt);
        LocalDate ld=LocalDate.now().plusDays(1);
        System.out.println(ld);
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
        System.out.println(ld.compareTo(LocalDate.now()));
        System.out.println(LocalDate.now().isLeapYear());
        boolean notBefore = LocalDate.parse("2016-06-12")
                .isBefore(LocalDate.parse("2016-06-11"));
        System.out.println(notBefore);
        boolean isAfter = LocalDate.parse("2016-06-12")
                .isAfter(LocalDate.parse("2016-06-11"));
        System.out.println(isAfter);


        String dateString = "2020-04-08 12:30";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, formatter);
        LocalDate localDateTime = LocalDate.parse(dateString, formatter);
        System.out.println(parsedDateTime);
        System.out.println(localDateTime);

        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println(formattedDate);

        ZoneId defaultZoneId = ZoneId.systemDefault();
        LocalDate localDate = LocalDate.of(2016, 8, 19);
        Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
        System.out.println("LocalDate is: " + localDate);

        LocalDate today = LocalDate.now();
        String formattedDate1 = today.format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
        System.out.println(formattedDate1);
        System.out.println(today.toString());
    }
}
