package week10.day30_inheritance.day30Tasks.sports;

import week10.day30_inheritance.day30Tasks.sports.Sport;

public class BaseBall extends Sport {

    public BaseBall(int numberOfPlayers, int numberOfReferee, String rules) {
        super("Base Ball", numberOfPlayers, numberOfReferee, rules);
    }
}
