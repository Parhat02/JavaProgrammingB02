package week08.day22_arrayList;

public class MaxAndMinNumbersOfMultiDArray {

    public static void main(String[] args) {


        //index of elements:     0    1   2      0   1    2      0     1   2
        int[][] array = {{100, 20000, 300}, {10, 1000, 50}, {-200, 400, 0}}; //indexes of array: 0 ~ 2
        // index of 1D array          0              1                2

        int max = array[0][0];
        int min = array[0][0];

        for (int[] each : array) {

            for (int anInt : each) {

                if (max < anInt){
                    max = anInt;
                }

                if (min > anInt){
                    min = anInt;
                }

            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);



    }
}
