package week08.day25_constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM/dd/y EEE");
        LocalDate today = LocalDate.now();
        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2022, 7, 1);
        System.out.println(date1.format(df));

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime time = LocalTime.of(17, 30);
        System.out.println(time.format(tf));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, MMM/dd/y hh:mm a");
        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts.format(dtf));
    }
}
