package week07.day19_array;

import java.util.Arrays;

public class ArrayLiterals {

    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5, 6};
        System.out.println("number = " + Arrays.toString(number));

        System.out.println("---------------------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int n = 1;

        System.out.println(days[n-1]);

        System.out.println("---------------------------------------------------");

        String[] month = {"Jan", "Feb", "Mar", "Apr", "May","Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};


        //month = new String[12];
        //month[0] = "jan";

        System.out.println("month = " + Arrays.toString(month));

        for (int i = month.length - 1; i >= 0; i--) {
            System.out.println(month[i]);
        }


//        String x = "Alim";
//        String y = x;
//        String z = y;
//
//        x = "Ferhat";
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);


        int[] arr = new int[5];
        Arrays.fill(arr, 100);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 0, 3, 99);
        System.out.println(Arrays.toString(arr));

    }
}
