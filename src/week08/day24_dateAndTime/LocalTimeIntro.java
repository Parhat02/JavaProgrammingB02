package week08.day24_dateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {

    public static void main(String[] args) {

        LocalTime starting_time = LocalTime.of(10, 30);

        System.out.println(starting_time);

        LocalTime right_now = LocalTime.now();

        System.out.println(right_now);

        System.out.println("------------------------------------------------");

        LocalTime time1 = LocalTime.of(23, 59, 59);

        System.out.println(time1);

        time1 = time1.plusHours(1);

        System.out.println(time1);

        time1 = time1.plusMinutes(45);

        System.out.println(time1);
    }
}
