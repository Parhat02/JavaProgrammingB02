package week07.day20_forEach;

import java.util.Scanner;

public class Interview {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print(num + "*" + i +" = "+num*i + ", ");
        }

        input.close();
    }
}
