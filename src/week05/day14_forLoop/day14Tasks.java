package week05.day14_forLoop;

import java.util.Scanner;

public class day14Tasks {

    public static void main(String[] args) {

        /*
        1. Use a loop to print the following shape:
*/
        for (int i = 1; i <= 6; i++) {
            for (int e = 1; e <= 6; e++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*

2. Write a method which prints out the numbers from 1 to 100 but for numbers which are a multiple of both 3 and 5,
 print "FINRA" instead of the number,  for numbers which are a multiple of 3, print "FIN" instead of the number
 and for numbers which are a multiple of 5, print "RA" instead of the number.
    ex:
        output:
            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN
         */
        System.out.println("=====================================================");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA" + " ");
            } else if (i % 5 == 0) {
                System.out.print("RA" + " ");
            } else if (i % 3 == 0) {
                System.out.print("FIN" + " ");
            } else {
                System.out.print(i + " ");
            }
        }

        /*
3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
         */
        System.out.println();
        System.out.println("----------------------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int givenNum = input.nextInt();
        int sum = 0;
        for (int i = 0; i <= givenNum; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("----------------------------------------------------");
        /*
        4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
         */
        System.out.println("Enter a number for factorial: ");
        int f = input.nextInt();
        int factorial = 1;
        for (int i = 1; i <= f; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        factorial(6);
        System.out.println("----------------------------------------------------");
        retrieve("mn@#123Ab!");
        System.out.println("----------------------------------------------------");
        System.out.println(sumOfDigits("lskdjj5555ldfj"));
        System.out.println("----------------------------------------------------");
        System.out.println(isPalindrome("Level"));
        System.out.println(isPalindrome("Anna"));
        System.out.println(isPalindrome("Good"));
    }

    public static int factorial(int f) {
        int factorial = 1;
        for (int i = 1; i <= f; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

            /*
        5. write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
         */

    public static void retrieve(String str) {
        String letters = "";
        String digits = "";
        String specialChars = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                digits += str.charAt(i);
            } else if ((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)) {
                letters += str.charAt(i);
            } else {
                specialChars += str.charAt(i);
            }
        }
        System.out.println("letters: " + letters);
        System.out.println("digits: " + digits);
        System.out.println("special chars: " + specialChars);

    }

    /*
    6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
     */
    public static int sumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                sum += Integer.parseInt(str.charAt(i)+"");
            }
        }
        return sum;
    }

    /*
    7. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level
				output:
					true

				input:
					Anna
				output:
					true
     */
    public static boolean isPalindrome(String str){
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equalsIgnoreCase(reverse);
    }

}
