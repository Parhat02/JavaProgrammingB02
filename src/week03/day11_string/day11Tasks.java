package week03.day11_string;

import java.util.Scanner;

public class day11Tasks {
    public static void main(String[] args) {
        /*
        1. Create a class named WebsiteAddress, and write a program that can check if the given website is a valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the website address: ");
        String website = input.nextLine();
        if (website.startsWith("www.") && (website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov"))){
            System.out.println("A valid website address");
        }else {
            System.out.println("Invalid website address");
        }
        System.out.println("===========================================");
        /*
2. Create a class named StartsWithX and write a program that asks the user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
         */
        System.out.println("Enter a word");
        String word = input.nextLine();
        word = word.toLowerCase();
        if (word.startsWith("x")){
            word= word.replaceFirst("x", "a");
            System.out.println(word);
        }else {
            System.out.println(word);
        }
        System.out.println("===========================================");
        /*
4. Create a class named ReallyNeverMind. Ask the user to enter a word. If the word ends with "ly", print "really???",
otherwise, print "never mind"
         */

        System.out.println("Enter a word");
        String aWord = input.nextLine();
        aWord = aWord.toLowerCase();
        if (aWord.endsWith("ly")){
            System.out.println("really");
        }else {
            System.out.println("never mind");
        }
        System.out.println("===========================================");
        /*
        5. Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
         */

        System.out.println("Enter two words");
        String firstWord = input.next();
        String secondWord = input.next();
        firstWord = firstWord.substring(1);
        secondWord = secondWord.substring(1);
        System.out.println(firstWord+secondWord);
        System.out.println("===========================================");

        /*
        6. Create a class named CombineWords. Ask the user to enter two words. Then add them together and print.
    But if the last letter of the first word and the first letter of the last letter are the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
         */
        System.out.println("Enter two words");
        String word1 = input.next();
        String word2 = input.next();
        int word1Length = word1.length();
        if (word1.charAt(word1Length-1) == word2.charAt(0)){
            System.out.println(word1+word2.substring(1));
        }else{
            System.out.println(word1+word2);
        }
        System.out.println("===========================================");

        /*
        7. Write a program that asks the user to enter first and last names, and then prints the full name in regular
        format (first character in upper case)
                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";
                    output:
                        Cydeo School
         */
        System.out.println("Enter your first name:");
        String firstName = input.next();
        System.out.println("Enter your last name:");
        String lastName = input.next();
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        firstName = firstName.toUpperCase().charAt(0)+firstName.substring(1);
        lastName = lastName.toUpperCase().charAt(0)+lastName.substring(1);
        System.out.println(firstName+" "+lastName);
        System.out.println("===========================================");

        /*
        8. Create a class called EmailTask1.
   Assume that the email address is constructed by the person's first name and followed by an underscore and last name.

    Write a program that can swap the first name with the last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.
        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
         */
        System.out.println("Enter your email address: ");
        input.nextLine();
        String email = input.nextLine();
        if (email.contains("_")){
            int indexOfUnder = email.indexOf("_");
            int indexOfAt = email.indexOf("@");
            String firstNameOfEmail = email.substring(0,indexOfUnder);
            String lastNameOfEmail = email.substring(indexOfUnder+1,indexOfAt);
            System.out.println(lastNameOfEmail+"_"+firstNameOfEmail+"@gmail.com");
        }else {
            System.out.println(email);
        }
        System.out.println("===========================================");

        /*
        9. Create a class called EmailTask2.
   Assume that the email address is constructed by the person's first name and followed by an underscore and last name.
   Write a program that will print out information about the user based on email. Print first name, last name, and domain.
   First and Last names should be printed in the proper format - uppercase first letter and remaining lowercase.
           Ex:
               input:
                   craig_federighi@apple.com
            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
         */
        System.out.println("Enter your email address: ");
        String emailAddress = input.next();
        if (emailAddress.contains("_") && emailAddress.contains("@") && emailAddress.contains(".")){
            int underScoreIndex = emailAddress.indexOf("_");
            int atIndex = emailAddress.indexOf("@");
            int indexOfDot = emailAddress.indexOf(".");
            String firstNameOfEmail = emailAddress.substring(0,underScoreIndex).toLowerCase();
            String lastNameOfEmail = emailAddress.substring(underScoreIndex+1,atIndex).toLowerCase();
            firstNameOfEmail = firstNameOfEmail.toUpperCase().charAt(0) + firstNameOfEmail.substring(1);
            lastNameOfEmail = lastNameOfEmail.toUpperCase().charAt(0) + lastNameOfEmail.substring(1);
            String domain = emailAddress.substring(atIndex+1,indexOfDot);
            System.out.println("First name: "+firstNameOfEmail+"\nLast name: "+lastNameOfEmail+"\nDomain :"+domain);
        }else {
            System.out.println(emailAddress);
        }
        input.close();
        System.out.println("===========================================");
    }
}
