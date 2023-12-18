package week07.day21_multiDimensionalArray;

import utilities.ArrayUtility;

import java.util.Arrays;

public class AddElement {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60, 70, 80};
        int element = 90;

        int[] newArray = Arrays.copyOf(array, element);
        newArray[newArray.length-1] = element;

        System.out.println(Arrays.toString(newArray));

        System.out.println("-------------------------------------------------------");

        int[] numbers = { 100, 90, 80, 70, 60};

        System.out.println(Arrays.toString(numbers));

        numbers = ArrayUtility.addElement(numbers, 50);

        System.out.println(Arrays.toString(numbers));


        System.out.println("------------------------------------------");

        double[] nums = {1.5, 2.5, 3.5, 4.5};

        nums = ArrayUtility.addElement(nums, 5.5);

        nums = ArrayUtility.addElement(nums, 6.5);

        nums = ArrayUtility.addElement(nums, 7.5);

        System.out.println(Arrays.toString(nums));


        System.out.println("------------------------------------------");

        String[] students = {"Yasin", "Sumeye", "Ermek"};

        students = ArrayUtility.addElement(students, "Umran");

        students = ArrayUtility.addElement(students, "Abidullah");

        students = ArrayUtility.addElement(students, "Muhtar");

        System.out.println(Arrays.toString(students));

        System.out.println(ArrayUtility.isContains(students, "Muhtar"));


        // remove
        System.out.println("--------------------------------------------------------");
        int[] array4 = {0, 20, 30, 40};
        array4 = ArrayUtility.remove(array4, 2);
        System.out.println(Arrays.toString(array4));


        // remove duplicates

        int[] array5 = {0, 20, 30, 40, 10, 20, 30, 40,20, 30, 40, 5, 2, 40, 30, 20, 7};
        array5 = ArrayUtility.removeDup(array5);
        System.out.println(Arrays.toString(array5));
    }
}
