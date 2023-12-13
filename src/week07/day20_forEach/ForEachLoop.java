package week07.day20_forEach;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] numbers1 = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }

        System.out.println("------------------------------------");

        for(int  each : numbers1){
            System.out.println(each);
        }

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int each : numbers) {

            if(each%2 != 0){
                System.out.println(each);
            }

        }

        System.out.println("-------------------------------------------");

        int[] nums = {100, 20, 30, 40, 5, 4, 3, 1, 2, 1000, 300, 500};

        int max = nums[0];
        int min = nums[0];

        for (int each : nums) {

            if(each > max){
                max = each;
            }

            if(each < min){
                min = each;
            }

        }

        System.out.println("max = " + max);

        System.out.println("min = " + min);

        System.out.println("-------------------------------------------");

        int[] a1 = {10, 20, 30, 40, 50};
        int[] a2 = {60, 70, 80, 90, 100, 110, 120};

        int[] a3 = new int[a1.length + a2.length];

        int k = 0;

        for (int each : a1) {
            a3[k++]= each;
        }

        for (int each : a2) {
            a3[k++]=each;
        }

        System.out.println(Arrays.toString(a3));

        System.out.println("-------------------------------------------");

        String[] names = {"Mohammad Karimi", "Vasyl Dobrianski", "Gadir Ibrahimov", "Abidullah Rahimi"};

        for (String each : names) {
            System.out.println(each.charAt(0) +"."+each.charAt( each.indexOf(" ") +1) );
        }

    }
}
