package week08.day25_constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Day25Tasks {

    public static void main(String[] args) {

        // use the LocalDate & Time, get the date and time in the following format; Tuesday, 1:00 pm, Nov/24/2020

        DateTimeFormatter df = DateTimeFormatter.ofPattern("E, h:mm a, MMM/dd/y");
        LocalDateTime date = LocalDateTime.now();

        System.out.println(date.getDayOfWeek()+"," +date.format(df));

        System.out.println("------------------------------------------------------------------------");
        //Task 1 : Pizza object
        Pizza pizza1 = new Pizza("small", 4, 5);
        Pizza pizza2 = new Pizza("medium", 2, 3);
        Pizza pizza3 = new Pizza("large", 5, 6);

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);

        System.out.println("------------------------------------------------------------------------");

        //Task2 : SalaryCalculator

        SalaryCalculator salary = new SalaryCalculator(40, 50,0.06,0.04);
        System.out.println(salary);

        System.out.println("------------------------------------------------------------------------");

        //Task3 : Carpet

        Carpet carpet = new Carpet(12, 11, 5, true);
        System.out.println(carpet);

        System.out.println("------------------------------------------------------------------------");

        //Task4 : Movie

        Movie movie = new Movie("USA", "Java Developer: Zero to Hero", "Adventure, Comedy, Thriller",
                "Kuzzat Altay" , LocalDate.of(2024, 1, 18));
        movie.addCast("Ozzy");
        movie.addCast("Jamal");
        movie.addCast("Muhtar");
        String[] casts= {"Alex", "Micky","Walter","Sev", "Max"};
        movie.addCasts(casts);
        System.out.println(movie);

        System.out.println("------------------------------------------------------------------------");

        //Task5 : Offer
        Offer offer1 = new Offer("USA", "Apple", "Java Developer", 120000,
                true, true,true, true);
        Offer offer2 = new Offer("USA", "Apple", "C++ Developer", 95000,
                false, true,false, true);
        Offer offer3 = new Offer("USA", "Google", "Java Developer", 125000,
                true, true,false, true);
        Offer offer4 = new Offer("USA", "Tesla", "Python Developer", 129000,
                false, false,true, true);
        Offer offer5 = new Offer("USA", "Apple", "Health care", 85000,
                true, true,false, false);
        Offer offer6 = new Offer("USA", "Tesla", "Cabin Crew member", 100000,
                false, true,false, false);
        Offer offer7 = new Offer("USA", "Google", "Engineer", 98000,
                false, false,true, true);

        Offer[] offers = {offer1, offer2, offer3, offer4, offer5, offer6, offer7};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(offers));

        fullTimeOffers.removeIf(p-> !p.isFullTime);

        System.out.println(fullTimeOffers);

        System.out.println("------------------------------------------------------------------------");

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(offers));
        localOffers.removeIf(p-> !p.isWFH);
        System.out.println(localOffers);

        System.out.println("------------------------------------------------------------------------");

        ArrayList<Offer> offersWithBenefit = new ArrayList<>(Arrays.asList(offers));
        offersWithBenefit.removeIf(p-> !p.hasBenefit);
        System.out.println(offersWithBenefit);

        System.out.println("------------------------------------------------------------------------");

        ArrayList<Offer> devOffers = new ArrayList<>(Arrays.asList(offers));
        devOffers.removeIf(p-> !p.jobTitle.contains("Developer"));
        System.out.println(devOffers);

        System.out.println("------------------------------------------------------------------------");

        ArrayList<Offer> offersWith100K = new ArrayList<>(Arrays.asList(offers));
        offersWith100K.removeIf(p-> p.salary < 100000);
        System.out.println(offersWith100K);
    }
}
