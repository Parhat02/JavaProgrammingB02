package week10.day30_inheritance.day30Tasks.sports;

import week10.day30_inheritance.day30Tasks.sports.Sport;

public class BasketBall extends Sport {

    public BasketBall( int numberOfPlayers, int numberOfReferee, String rules) {
        super("Basket Ball", numberOfPlayers, numberOfReferee, rules);
    }
}
