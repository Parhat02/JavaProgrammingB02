package week10.day30_inheritance.day30Tasks.sports;

import week10.day30_inheritance.day30Tasks.sports.Sport;

public class FootBall extends Sport {

    public FootBall(int numberOfPlayers, int numberOfReferee, String rules) {
        super("Foot Ball", numberOfPlayers, numberOfReferee, rules);
    }
}
