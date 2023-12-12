package week07.day19_array;

public class MaxNumber {

    public static void main(String[] args) {

        int[] numbers = {100, 20, 500, 40, -10, 30};

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max){
                max = numbers[i];
            }
        }

        System.out.println("max = " + max);

        System.out.println("-----------------------------------------------");


        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < min){
                min = numbers[i];
            }
        }

        System.out.println("min = " + min);


    }
}
