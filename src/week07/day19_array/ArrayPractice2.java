package week07.day19_array;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        int[] arr1 = new int[100];

        for (int i = 0, j = 10; i < arr1.length; i++, j += 10) {
            arr1[i] = j;
        }
        System.out.println("arr1 = " + Arrays.toString(arr1));

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;
        }
        System.out.println("arr1 = " + Arrays.toString(arr1));

        System.out.println("-------------------------------------------------------");

        int[] arr2 = new int[100]; // index: 0 ~ 99

        for (int i = arr2.length - 1; i >= 0; i--) {
            arr2[i] = i + 1;
        }
        System.out.println("arr2 = " + Arrays.toString(arr2));

        for (int i = 0, j = 100; i < arr2.length; i++, j--) {
            arr2[i] = j;
        }
        System.out.println("arr2 = " + Arrays.toString(arr2));

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 100 -i;
        }
        System.out.println("arr2 = " + Arrays.toString(arr2));


    }
}
