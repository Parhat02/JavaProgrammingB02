package week07.day21_multiDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveExtraSpaces {

    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java    ";

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        str = "";

        for(String  each : words ){
            if(!each.isEmpty()){
                str += each+" ";
            }
        }

        str = str.trim(); // to remove the last space

        System.out.println(str);


        // practice during meeting
        int a = 4;
        int b = 5;

        Scanner input = new Scanner(System.in);
        System.out.println(a+"*"+b+" = " + "?");
        int result = input.nextInt();
        int answer = a * b;

        while (answer != result){
            System.out.println("Try again");
            result = input.nextInt();
        }

        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);

        System.out.println("What is " + number1 + " +"+ number2+" = ?");
        int userAnswer;
        int sum = number1 + number2;

        do {
            userAnswer = input.nextInt();
            userAnswer = sum;
            System.out.println("You got it!");
        }while (userAnswer != sum);

    }
}
