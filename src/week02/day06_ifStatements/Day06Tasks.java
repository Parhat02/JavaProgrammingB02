package week02.day06_ifStatements;

public class Day06Tasks {
    public static void main(String[] args) {

        /* Create a class named Cigarettes.java
        A variable named age is declared and given, Write a program that
can check if the person is eligible to buy cigarettes
Ex:
age = 20
output:
You are not eligible to buy Cigarettes

         */
        // Task 1
        int age = 20;
        if (age >= 21){
            System.out.println("You are eligible to by Cigarettes");
        }else {
            System.out.println("You are not eligible to buy Cigarettes");
        }

        /*
        1. Create a class named MaximumNumber.java
2. Declare the following variables:
1. num1
2. num2
3. Write a program that can print the maximum number between the
two numbers above, if both are equal then print Equal
Ex:
num1 = 10
num2 = 20
output:
20 is the maximum number

         */
        // Task2
        int num1 = 10;
        int num2 = 20;
        if (num1<num2){
            System.out.println(num2+" is the maximum number.");
        } else if (num1>num2) {
            System.out.println(num1+" is the maximum number.");
        }else {
            System.out.println("These two numbers are equal.");
        }

        /*
        1. Create a class named MinimumNumber.java
2. Declare the following variables:
1. num1
2. num2
3. Write a program that can print the minimum number between the
two numbers above, if both are equal then print Equal
Ex:
num1 = 10
num2 = 20
output:
10 is the minimum number

         */
        //Task3
        if (num1<num2){
            System.out.println(num1+" is the minimum number.");
        } else if (num1>num2) {
            System.out.println(num2+" is the minimum number.");
        }else {
            System.out.println("These two numbers are equal.");
        }
/*
1. Create a class named PosNegZero.java
2. An integer variable named number is declared and given, Write a
program can identify if the number is positive, negative or zero
Ex:
number = 20
output:
Positive

 */
        //Task4
        int number = 20;
        if (number<0){
            System.out.println("Negative");
        } else if (number==0) {
            System.out.println("Zero");
        }else {
            System.out.println("Positive");
        }
/*
1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write
a program to determine and print which school type someone is in
Ex:
gradeLevel = 2
output:
Elementary School
The grade level and types are:
1 ~ 5: Elementary school
6 ~ 8: Middle school
9 ~ 12: High school
13 ~ 16: College
17 ~ 18: Grad School
Assume that the given number is 1 ~ 18

 */
        //Task5
        int gradeLevel = 18;
        if (gradeLevel <= 5 && gradeLevel >=1){
            System.out.println("Elementary school");
        } else if (gradeLevel <= 8 && gradeLevel >=6) {
            System.out.println("Middle school");
        } else if (gradeLevel <= 12 && gradeLevel >=9) {
            System.out.println("High school");
        } else if (gradeLevel <= 16 && gradeLevel >=13) {
            System.out.println("College");
        } else if (gradeLevel <= 18 && gradeLevel >=17) {
            System.out.println("Grad School");
        }else {
            System.out.println("You are giving wrong input");
        }

        /*
1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents
Ex:
Given:
number = 1
output:
Monday
Hint: Assume that a number between 1 ~ 7 is given to the variable

         */
        int numberOfDay = 1;
        if (numberOfDay==1){
            System.out.println("Monday");
        }
        if (numberOfDay==2){
            System.out.println("Tuesday");
        }
        if (numberOfDay==3){
            System.out.println("Wednesday");
        }
        if (numberOfDay==4){
            System.out.println("Thursday");
        }
        if (numberOfDay==5){
            System.out.println("Friday");
        }
        if (numberOfDay==6){
            System.out.println("Saturday");
        }
        if (numberOfDay==7){
            System.out.println("Sunday");
        }
        if (numberOfDay>7 || numberOfDay <= 0){
            System.out.println("Invalid number");
        }

        /*
        1. Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents
Ex:
Given:
number = 10
output:
October

         */
        //Task7
        int numberOfMonth = 10;
        if (numberOfMonth==1){
            System.out.println("January");
        }
        if (numberOfMonth==2){
            System.out.println("February");
        }
        if (numberOfMonth==3){
            System.out.println("March");
        }
        if (numberOfMonth==4){
            System.out.println("April");
        }
        if (numberOfMonth==5){
            System.out.println("May");
        }
        if (numberOfMonth==6){
            System.out.println("Jun");
        }
        if (numberOfMonth==7){
            System.out.println("July");
        }
        if (numberOfMonth==8){
            System.out.println("August");
        }
        if (numberOfMonth==9){
            System.out.println("September");
        }
        if (numberOfMonth==10){
            System.out.println("October");
        }
        if (numberOfMonth==11){
            System.out.println("November");
        }
        if (numberOfMonth==12){
            System.out.println("December");
        }
        if (numberOfMonth>12 || numberOfMonth <= 0){
            System.out.println("Invalid number");
        }

        /*
        1. Create a class named NumberOfDays.java
2. An integer variable named month is declared and given, Write a
program that can print the number of days in the given month
Ex:
Given:
number = 1
output:
31 days
Hints:
Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days are: 4, 6, 9, 11
Month that has 28 days: 2
         */

        //Task8
        numberOfMonth=1;
        if (numberOfMonth==1 || numberOfMonth==3 || numberOfMonth==5 || numberOfMonth==7
                || numberOfMonth==8 || numberOfMonth==10 || numberOfMonth==12){
            System.out.println("31 days");
        }
        if (numberOfMonth==4 || numberOfMonth==6 || numberOfMonth==9 || numberOfMonth==11){
            System.out.println("30 days");
        }
        if (numberOfMonth==2){
            System.out.println("28 days");
        }
        if (numberOfMonth>12 || numberOfMonth <= 0){
            System.out.println("Invalid number");
        }

        boolean has28Days = numberOfMonth ==2;
        boolean has30Days = numberOfMonth == 4 || numberOfMonth == 6 || numberOfMonth == 9 || numberOfMonth == 11;
        boolean has31Days = !has28Days && !has30Days;
        System.out.println(has31Days);
        String daysOfMonth = "";
        if (has28Days){
            daysOfMonth = "28 days";
        }
        if (has30Days){
            daysOfMonth = "30 days";
        }
        if (has31Days){
            daysOfMonth = "31 days";
        }
        System.out.println(daysOfMonth);
    }
}
