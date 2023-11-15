package week02.day07_IfStatements;

public class Day07Tasks {

    public static void main(String[] args) {
        /*
        1. An integer variable named number is declared and given, Write a
program can identify if the number is positive, negative or zero
         */
        int number = 20;
        if (number < 0) System.out.println("Negative");
        else if (number > 0) {
            System.out.println("Positive");
        } else System.out.println("Zero");

        /*
        2. An integer variable named gradeLevel is declared and given, Write a
program to determine and print which school type someone is in.
         */
        int gradeLevel = 2;
        if (gradeLevel <= 5) {
            System.out.println("Elementary school");
        } else if (gradeLevel <= 8) {
            System.out.println("Middle school");
        } else if (gradeLevel <= 12) {
            System.out.println("High school");
        } else if (gradeLevel <= 16) {
            System.out.println("College");
        } else if (gradeLevel <= 18) {
            System.out.println("Grad School");
        } else {
            System.out.println("Invalid");
        }

        /*
        An integer variable named score is declared and given, Write a 
program that can print the grade of the student
         */
        int score = 95;
        String result = "";
        if (score >= 0 && score <= 100) {
            if (score >= 95) {
                result = "A";
            } else if (score >= 80) {
                result = "B";
            } else if (score >= 70) {
                result = "C";
            } else if (score >= 60) {
                result = "D";
            } else {
                result = "F";
            }
        } else {
            result = "Invalid";
        }
        System.out.println("Your grade is: " + result);
        System.out.println("------------------------------------------");
        /*
        1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program
        that can display the price and calories of cappuccino
         */
        String validSize = "Tall";
        validSize = validSize.toLowerCase();
        String size = "tall, grande, venti";
        double price = 0;
        int calories = 0;
        if (size.contains(validSize)) {

            if (validSize.equals("tall")) {
                price = 3.69;
                calories = 90;
            } else if (validSize.equals("grande")) {
                price = 3.99;
                calories = 120;
            } else if (validSize.equals("venti")) {
                price = 4.29;
                calories = 150;
            } else {
                System.out.println("Invalid Size");
            }
            System.out.println("price is $" + price + "\n" + calories + " calories");
        } else {
            System.out.println("Invalid Size");
        }
        System.out.println("------------------------------------------------------");


        /*
        2. Write a program that can display the name of the selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are chrome, firefox, opera, safari, and edge.
        3. if the browser name does not match with the valid browser names, output should be: Invalid Browser Name
         */
        String browserName = "chrome, firefox, opera, safari, edge";
        String selectedBrowser = "Chrome";
        selectedBrowser = selectedBrowser.toLowerCase();
        String result1 = "";
        if (browserName.contains(selectedBrowser)) {
            if (selectedBrowser.equals("chrome")) {
                result1 = "chrome";
            } else if (selectedBrowser.equals("firefox")) {
                result1 = "firefox";
            } else if (selectedBrowser.equals("opera")) {
                result1 = "opera";
            } else if (selectedBrowser.equals("safari")) {
                result1 = "safari";
            } else {
                result1 = "edge";
            }
            System.out.println(result1 + " Browser is selected");

        }else {
            System.out.println("Invalid selection");
        }

        /*
        Create a class called CrewAndPassenger; given the number of people on the ship (int number),
        determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.
         */
        int numberOfPeople = 100;
        int crew = 0, passenger = 0;
        result = "";
        if (numberOfPeople == 100 || numberOfPeople ==50 || numberOfPeople == 75){
            if (numberOfPeople == 50){
                crew = 20; passenger = 30;
            } else if (numberOfPeople == 75) {
                crew = 25; passenger = 50;
            }else {
                crew = 30; passenger = 70;
            }
            result = "Total: "+numberOfPeople+" =====> "+crew+" crew,"+passenger+"passengers";
        }else {
            result = "Invalid";
        }
        System.out.println(result);

        /*
5. Create a class called AgeGroups, and write a program that can define the age groups of a person
         */
        int age = 9;
        if (age>=0 && age <=150){
            if (age <21){
                System.out.println("Teemage");
            } else if (age>=21 && age<55) {
                System.out.println("Adult");
            }else{
                System.out.println("Senior");
            }
        }else System.out.println("Invalid");

        /*
write a function that prints out the number. but for a number which is a multiple of 3,
print "FIN" instead of the number, and for a number which is a multiple of 5, print "RA"
instead of the number. and for a number that is a multiple of both 3 and 5, print "FINRA" instead of the number.
         */
        int num = 21;
        result = "";
        if (num%3==0 && num%5==0){
            result = "FINRA";
        } else if (num%5==0) {
            result = "RA";
        } else if (num%3==0) {
            result = "FIN";
        }else {
            result = "Invalid";
        }
        System.out.println(result);

    }
}
