package week07.day19_array;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {
        int score1 = 85;
        int score2 = 75;
        int score3 = 78;
        int score4 = 88;
        int score5 = 95;

        System.out.println("------------------------------");

        int[] scores = new int[5]; // index: 0 ~ 4

        scores[2] = 78;
        scores[0] = 85;
        scores[1] = 75;
        scores[3] = 88;
        scores[4] = 95;

        // scores[5] = 100;
        //  scores[-1] = 65;
        //   scores = new int[10]; //index: 0 ~ 9
        //  scores = new int[50]; //index: 0 ~ 49

        System.out.println(  Arrays.toString(scores)  );

        System.out.println( scores[2] );

        System.out.println("--------------------------------------------");

        for (int i = 0; i < scores.length; i++) { // i: index numbers of scores array
            System.out.println(scores[i]);
        }

        System.out.println("--------------------------------------------");

        System.out.println( scores[scores.length-1] );


        int[] number = {1, 2, 3, 4, 5, 6};
        System.out.println("number = " + Arrays.toString(number));


    }
}
