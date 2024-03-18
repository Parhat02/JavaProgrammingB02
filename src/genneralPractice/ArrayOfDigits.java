package genneralPractice;

import java.util.Arrays;

public class ArrayOfDigits {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(digitArray(490)));
        System.out.println(Arrays.toString(arrDigits(490)));

    }

    public static int[] digitArray(int num){

        String value = String.valueOf(num);
        int[] digitArray = new int[value.length()];
        for (int i=0; i<value.length()-1; i++){
            digitArray[i] = Character.getNumericValue(value.charAt(i));
//            digitArray[i] = Integer.parseInt(value.charAt(i)+"");
        }
        return digitArray;
    }

    public static int[] arrDigits(int num) {

        String value = String.valueOf(num);

        return value.chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
