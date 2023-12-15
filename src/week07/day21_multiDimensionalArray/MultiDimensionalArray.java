package week07.day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60, 70, 80};
        int[] arr3 = {90, 100};
        int[] arr4 = {1000, 2000};

        int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}, {1000, 2000}};
        int[][] arr5 = {arr1, arr2, arr3, arr4};

        System.out.println(Arrays.deepToString((arr2D)));
        System.out.println(arr2D.length);

        System.out.println( Arrays.toString( arr2D[1] ) ); // [40, 50, 60, 70, 80]
        System.out.println( Arrays.toString( arr2D[2] ) ); // [90, 100]
        System.out.println( Arrays.toString( arr2D[0] ) ); // [10, 20, 30]

        System.out.println( arr2D[2][0] ); // 90

        System.out.println( arr2D[1][2]  ); // 60

        System.out.println("-----------------------------------------------");


        // Iterating multi dimensional array

        for (int i = 0; i < arr2D.length; i++){ // i: index number of 1D array in arr2D

            int[] each1D = arr2D[i];
            System.out.println( Arrays.toString( each1D ) );

            for (int j = 0; j < each1D.length; j++){ // j: index number of elements in each 1D array of arr2D

                int eachElement = each1D[j];

                System.out.println(eachElement);

            }

        }

        System.out.println("-----------------------------------------------");

        for (int[] each1DArray : arr2D){
            System.out.println(Arrays.toString(each1DArray));

            for (int eachElement : each1DArray){
                System.out.println(eachElement);
            }
        }

        System.out.println("-----------------------------------------------");

        for (int i = arr2D.length-1; i >= 0; i--) {
            for (int j = arr2D[i].length -1; j >= 0 ; j--) {
                System.out.println(arr2D[i][j]);
            }

        }

        System.out.println("-----------------------------------------------");

        for (int[] each1DArray : arr2D) {
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }
    }
}
