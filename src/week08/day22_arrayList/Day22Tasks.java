package week08.day22_arrayList;

import java.util.Arrays;

public class Day22Tasks {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        arr = replace(arr, 2, 30);
        System.out.println(Arrays.toString(arr));

        System.out.println("-------------------------------------------------");

        int[] arr1 = {10, 10, 20, 30, 40, 30, 30, 30};
        arr1 = replaceAll(arr1, 30, 300);
        System.out.println(Arrays.toString(arr1));

        System.out.println("-------------------------------------------------");

        int[] arr2 = {10, 20, 30, 40, 50};
        arr2 = insert(arr2, 2, 100);
        System.out.println(Arrays.toString(arr2));

        System.out.println("-------------------------------------------------");

        int[] arr3 = {10, 20, 30, 40, 50};
        arr3 = swap(arr3, 2, 4);
        System.out.println(Arrays.toString(arr3));

        System.out.println("-------------------------------------------------");

        String str = "Wooden Spoon!";
        retrieve(str);

        System.out.println("-------------------------------------------------");

        String str1 = "JAVA java";
        System.out.println(sameCases(str1));

        System.out.println("-------------------------------------------------");

        String[] arr4 = {"A", "B", "C"};
        String[] arr5 = {"D", "E", "F", "G"};

        System.out.println(Arrays.toString(combine(arr4,arr5)));

        System.out.println("-------------------------------------------------");

        int[] list = {1,2,3,4,5};
        maxAndMin(list);

    }

    public static int[] replace(int[] array, int index, int element){
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

    public static int[] insert(int[] array, int index, int element){
        int[] newArray = new int[array.length+1];
//        int i = 0;
//        while (i < newArray.length) {
//            if (i==index){
//                newArray[i] = element;
//                i++;
//                continue;
//            }
//            if (i > index){
//                newArray[i] = array[i-1];
//                i++;
//                continue;
//            }
//            newArray[i] = array[i];
//            i++;
//        }
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

    //Task5
    public static void retrieve(String str){
        char[] ch = str.toCharArray();
        String letters = "";
        String digits = "";
        String specialChars = "";
        for (char c : ch) {
            if (Character.isLetter(c)){
                letters += c;
            }
            if (Character.isDigit(c)){
                digits += c;
            }
            if (!Character.isLetterOrDigit(c)){
                specialChars += c;
            }
        }
        System.out.println("letters = \"" + letters +"\"");
        System.out.println("digits = \"" + digits +"\"");
        System.out.println("specialChars = \"" + specialChars +"\"");
    }

    //Task6
    public static boolean sameCases(String str) {
        char[] ch = str.toCharArray();

        int upperCase = 0;
        int lowerCase = 0;

        for (char c : ch) {
            if (Character.isLowerCase(c)) {
                lowerCase++;
            }
            if (Character.isUpperCase(c)) {
                upperCase++;
            }
        }
        if (lowerCase == upperCase){
            return true;
        }else {
            return false;
        }
    }

    //Task7
    public static String[] combine(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length + arr2.length];

        for (int i = 0; i < arr3.length; i++) {
            if (i>=arr1.length){
                arr3[i] = arr2[i- arr1.length];
                continue;
            }
            arr3[i] = arr1[i];
        }

//        int k = 0;
//        for (int i =0; i < arr1.length; i++) {
//            arr3[k] = arr1[i];
//            k++;
//        }
//        for (int i =0; i < arr2.length; i++) {
//            arr3[k] = arr2[i];
//            k++;
//        }

        return arr3;
    }

    public static void maxAndMin(int[] arr){
        int max = arr[0];
        int min = arr[0];

        for (int i : arr) {
            if (max < i){
                max = i;
            }
            if (min > i){
                min = i;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
