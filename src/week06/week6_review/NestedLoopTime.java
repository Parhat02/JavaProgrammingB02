package week06.week6_review;

import java.util.Scanner;

public class NestedLoopTime {

    public static void main(String[] args) throws InterruptedException {


        for (int i = 2; i >=1 ; i--) {

            for (int j = 59; j >=0 ; j--) {
                for (int k = 999; k >= 0 ; k--) {

                    System.out.print( "\r"+(i-1) + " minutes " + j + " seconds " + k + " millisecond" );
                    Thread.sleep(1);

                }
                //System.out.print("\r"+ (i-1) + " minutes " + j + " seconds");

            }
        }

        System.out.println("\n\n");

        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t*       Times is Up, Please take your seats!      *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");

        timer(2);

    }


    public static void timer(int minutes) throws InterruptedException {

        for (int i = minutes; i >=1 ; i--) {

            for (int j = 59; j >=0 ; j--) {
                for (int k = 999; k >= 0 ; k--) {

                    System.out.print( "\r"+(i-1) + " minutes " + j + " seconds " + k + " millisecond" );
                    Thread.sleep(1);

                }
                //System.out.print("\r"+ (i-1) + " minutes " + j + " seconds");

            }
        }

        System.out.println("\n\n");

        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t*       Times is Up, Please take your seats!      *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");
    }
}
