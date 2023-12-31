package week08.week8_review;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

    public static void main(String[] args) {

        LocalDate christmasDay = LocalDate.of(2023, 12, 25); // default format

        System.out.println(christmasDay);

        System.out.println(christmasDay.format(DateTimeFormatter.ofPattern("EEEE, MMMM/d/y")));

        System.out.println(christmasDay.format(DateTimeFormatter.ISO_DATE));


        System.out.println("----------------------------------------------------------------------------");


        LocalTime time = LocalTime.of(14, 30);

        System.out.println(time);

        System.out.println(time.format(DateTimeFormatter.ofPattern("hh:mm a")));

    }
}
