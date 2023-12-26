package week07.day19_array;

import java.util.Arrays;

public class Day19Tasks3 {

    public static void main(String[] args) {
        /*
        3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0,    439.50,  39.99};
        int[] itemIDs =   {12345,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
         */

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs =   {12345, 12346, 12347, 12348, 12349, 12350};

        for (int i = 0; i < items.length; i++) {

            if (items[i].equals("Gloves")){
                System.out.println("First index of Gloves is " + i);
            }

            if (items[i].contains("iPad")){
                System.out.println("Contains " + items[i]);
            }

            System.out.println("name: " + items[i] + " - price: " + prices[i] + " - ID: " + itemIDs[i]);
        }


        System.out.println("--------------------------------------------------------------------------");
        /*
        4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each student in separate lines
         		Ex:
         			Anna's score is 90, and grade is A
         */

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        for (int i = 0; i < names.length; i++) {
            if (scores[i] == 90){
                grades[i] = 'A';
            }
            if (scores[i] == 80){
                grades[i] = 'B';
            }
            if (scores[i] == 75){
                grades[i] = 'C';
            }

            System.out.println(names[i] + "'s score is " + scores[i] + ", and grade is " + grades[i]);
        }

        System.out.println("----------------------------------------------------------------------------");

        /*
        6.  Write a program that can reverse an array of integers and return it as a new array
        Ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
         */

        int[] array = {1,2,3,4,5};

        int[] array2 = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            array2[j] = array[i];
        }
        System.out.println("ReverseArray = " + Arrays.toString(array2));

        System.out.println("----------------------------------------------------------------------------");

        /*
        7. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}

         */

        int[] array3 = new int[]{10, 0, 5, 0, 1, 0, -1, -5, 0, 15};

        for (int i = 0; i < array3.length; i++) {

            for (int k = i+1; k < array3.length; k++) {

                int temp= array3[i];

                if (array3[k] > array3[i]){
                    array3[i] = array3[k];
                    array3[k] = temp;
                }
            }
        }

        System.out.println("array3 = " + Arrays.toString(array3));

        System.out.println("----------------------------------------------------------------------------");

        /*
8. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
         */

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8,4};

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                    break;
                }

            }
        }

        System.out.println();
        System.out.println("----------------------------------------------------------------------------");

    }
}
