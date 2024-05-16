package RailworldJavaBasics.DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

    public static void main(String[] args) {

        LocalDate localdate = LocalDate.now();
        System.out.println(localdate); // 2024-05-15

        LocalDate localdate1 = LocalDate.from(ZonedDateTime.now());
        System.out.println(localdate1); // 2024-05-15

        LocalTime localtime = LocalTime.from(ZonedDateTime.now());
        System.out.println(localtime);

        String bday = "11-12-1999";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate parsedBday = LocalDate.parse(bday, formatter);
        System.out.println("Parsed Birthday: " + parsedBday);

    }

}
