package edu.dainius;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Work {
    public static void main(String[] args) {

        LocalDateTime nowDateTime = LocalDateTime.now();
        DateTimeFormatter formater;
        formater = DateTimeFormatter.ofPattern(("hh-mm"));
        System.out.println("Now local time is - " +nowDateTime.format(formater));

        Instant nowInstant = Instant.now();
        System.out.println("Standart time is- " +nowInstant);

        LocalTime time1 = LocalTime.parse("11:49:06");
        LocalTime time2 = LocalTime.parse("15:04:17");
        Duration duration5 = Duration.between(time1, time2);
        System.out.println("Duration by seconds is - " + duration5.getSeconds());


        LocalDate birthday = LocalDate.of(1998, 04, 25);
        LocalDate now5 = LocalDate.now();
        Period dif = Period.between(birthday, now5);
        System.out.println("Diferences to now " + dif.getYears());

    }
}
