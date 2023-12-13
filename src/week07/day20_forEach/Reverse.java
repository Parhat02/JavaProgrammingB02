package week07.day20_forEach;

import utilities.ArrayUtility;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};

        int[] reverseArray = ArrayUtility.reverse(array);

        System.out.println(Arrays.toString(reverseArray));

        System.out.println("---------------------------------------");

        double[] a1 = {1.5, 2.5, 3.5, 4.5};

        a1 = ArrayUtility.reverse(a1);

        System.out.println(Arrays.toString(a1));

        System.out.println("---------------------------------------");



    }
}
