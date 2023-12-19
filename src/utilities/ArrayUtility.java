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

        int[] newArray = new int[0];

        for (int j : array) {

            if (ArrayUtility.isContains(newArray, j)) {
                continue;
            }

            newArray = ArrayUtility.addElement(newArray, j);
        }
        return newArray;
    }

    public static double[] removeDup(double[] array){

        double[] newArray = new double[0];

        for (double v : array) {

            if (ArrayUtility.isContains(newArray, v)) {
                continue;
            }

            newArray = ArrayUtility.addElement(newArray, v);
        }
        return newArray;
    }

    public static String[] removeDup(String[] array){

        String[] newArray = new String[0];

        for (String v : array) {

            if (ArrayUtility.isContains(newArray, v)) {
                continue;
            }

            newArray = ArrayUtility.addElement(newArray, v);
        }
        return newArray;
    }

    public static char[] removeDup(char[] array){

        char[] newArray = new char[0];

        for (char v : array) {

            if (ArrayUtility.isContains(newArray, v)) {
                continue;
            }

            newArray = ArrayUtility.addElement(newArray, v);
        }
        return newArray;
    }


    public static int[] replace(int[] array, int index, int element){
        for (int i = 0; i < array.length; i++) {
            if (i == index){
                array[i] = element;
            }
        }
        return array;
    }
    public static double[] replace(double[] array, int index, double element){
        for (int i = 0; i < array.length; i++) {
            if (i == index){
                array[i] = element;
            }
        }
        return array;
    }
    public static String[] replace(String[] array, int index, String element){
        for (int i = 0; i < array.length; i++) {
            if (i == index){
                array[i] = element;
            }
        }
        return array;
    }
    public static char[] replace(char[] array, int index, char element){
        for (int i = 0; i < array.length; i++) {
            if (i == index){
                array[i] = element;
            }
        }
        return array;
    }

    public static int [] replaceAll(int[] array, int oldElement, int newElement){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement){
                array[i] = newElement;
            }
        }
        return array;
    }

    public static double[] replaceAll(double[] array, double oldElement, double newElement){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement){
                array[i] = newElement;
            }
        }
        return array;
    }
    public static String[] replaceAll(String[] array, String oldElement, String newElement){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement){
                array[i] = newElement;
            }
        }
        return array;
    }
    public static char[] replaceAll(char[] array, char oldElement, char newElement){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement){
                array[i] = newElement;
            }
        }
        return array;
    }

    public static double[] insert(double[] array, int index, double element){
        double[] newArray = new double[array.length+1];
        for (int i = 0; i < newArray.length; i++) {
            if (i==index){
                newArray[i] = element;
                continue;
            }
            if (i > index){
                newArray[i] = array[i-1];
                continue;
            }
            newArray[i] = array[i];
        }
        return newArray;
    }
    public static int[] insert(int[] array, int index, int element){
        int[] newArray = new int[array.length+1];
        for (int i = 0; i < newArray.length; i++) {
            if (i==index){
                newArray[i] = element;
                continue;
            }
            if (i > index){
                newArray[i] = array[i-1];
                continue;
            }
            newArray[i] = array[i];
        }
        return newArray;
    }
    public static String[] insert(String[] array, int index, String element){
        String[] newArray = new String[array.length+1];
        for (int i = 0; i < newArray.length; i++) {
            if (i==index){
                newArray[i] = element;
                continue;
            }
            if (i > index){
                newArray[i] = array[i-1];
                continue;
            }
            newArray[i] = array[i];
        }
        return newArray;
    }
    public static char[] insert(char[] array, int index, char element){
        char[] newArray = new char[array.length+1];
        for (int i = 0; i < newArray.length; i++) {
            if (i==index){
                newArray[i] = element;
                continue;
            }
            if (i > index){
                newArray[i] = array[i-1];
                continue;
            }
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static int [] swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
    public static double[] swap(double[] array, int i, int j){
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
    public static String[] swap(String[] array, int i, int j){
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
    public static char[] swap(char[] array, int i, int j){
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }


}
