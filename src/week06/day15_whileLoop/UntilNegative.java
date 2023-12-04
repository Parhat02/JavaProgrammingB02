package week06.day15_whileLoop;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            if (number < 0){
                break;
            }
            sum += number;
        }
        System.out.println("Sum of the number you entered: "+sum);

        input.close();
    }
}
