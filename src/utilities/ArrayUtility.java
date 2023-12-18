package utilities;

import java.util.Arrays;

public class ArrayUtility {

    public static int[] merge(int[] arr1, int[] arr2){

        int[] arr3 = new int[arr1.length+arr2.length];

        int k = 0; // for third array's index number
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {

            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static double[] merge(double[] arr1, double[] arr2){

        double[] arr3 = new double[arr1.length+arr2.length]; // to make sure that 3rd array has enough capacity
                                                            // to contain all the elements of arr1 and arr2
        int k = 0;
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {

            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static char[] merge(char[] arr1, char[] arr2){

        char[] arr3 = new char[arr1.length+arr2.length];

        int k = 0;
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {

            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2){

        String[] arr3 = new String[arr1.length+arr2.length];

        int k = 0;
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {

            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static int[] reverse(int[] array){

        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--) {
            reverse[j++]= array[i];
        }

        return reverse;
    }

    public static double[] reverse(double[] array){

        double[] reverse = new double[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--) {
            reverse[j++]= array[i];
        }

        return reverse;
    }
    public static char[] reverse(char[] array){

        char[] reverse = new char[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--) {
            reverse[j++]= array[i];
        }

        return reverse;
    }

    public static String[] reverse(String[] array){

        String[] reverse = new String[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--) {
            reverse[j++]= array[i];
        }

        return reverse;
    }


    public static int[] addElement(int[] array, int element){
        int[] newArray = Arrays.copyOf(array, array.length +1);
        newArray[newArray.length-1] = element;
        return newArray;
    }

    public static double[] addElement(double[] array, double element){
        double[] newArray = Arrays.copyOf(array, array.length +1);
        newArray[newArray.length-1] = element;
        return newArray;
    }

    public static char[] addElement(char[] array, char element){
        char[] newArray = Arrays.copyOf(array, array.length +1);
        newArray[newArray.length-1] = element;
        return newArray;
    }

    public static String[] addElement(String[] array, String element){
        String[] newArray = Arrays.copyOf(array, array.length +1);
        newArray[newArray.length-1] = element;
        return newArray;
    }

    public static boolean isContains(int[] array, int element){

        for (int each : array){
            if (each == element){
                return true;
            }
        }
        return false;
    }

    public static boolean isContains(double[] array, double element){

        for (double each : array){
            if (each == element){
                return true;
            }
        }
        return false;
    }

    public static boolean isContains(char[] array, char element){

        for (char each : array){
            if (each == element){
                return true;
            }
        }
        return false;
    }

    public static boolean isContains(String[] array, String element){

        for (String each : array){
            if (each.equals(element)){
                return true;
            }
        }
        return false;
    }

    public static int[] remove(int[] array, int index){
        int[] newArray = new int[array.length-1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i==index){
                continue;
            }
            newArray[j] = array[i];
            j++;
        }
        return newArray;
    }

    public static double[] remove(double[] array, int index){
        double[] newArray = new double[array.length-1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i==index){
                continue;
            }
            newArray[j] = array[i];
            j++;
        }
        return newArray;
    }
    public static String[] remove(String[] array, int index){
        String[] newArray = new String[array.length-1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i==index){
                continue;
            }
            newArray[j] = array[i];
            j++;
        }
        return newArray;
    }

    public static char[] remove(char[] array, int index){
        char[] newArray = new char[array.length-1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i==index){
                continue;
            }
            newArray[j] = array[i];
            j++;
        }
        return newArray;
    }

    public static int[] removeDup(int[] array){

        int[] newArray = array;

        for (int i = 0; i < array.length; i++) {

            int[] tempArray = Arrays.copyOfRange(array,i+1, array.length);

            if (ArrayUtility.isContains(tempArray, array[i])){

                for (int j = 0; j < newArray.length; j++) {
                    if (newArray[j] == array[i]){
                        newArray = ArrayUtility.remove(newArray, j);
                    }
                }
            }

        }
        return newArray;
    }
}
