package week05.day12_customMethods;

public class Day12Tasks {
   /*
    1. Create a method named emailDomain that can display the domain of the email
        Ex:
    emailDomain("Cydeo@gmail.com")

    output:
    domain: gmail
    */
    public static void emailDomain(String email){
        int atIndex = email.indexOf("@");
        int indexOfDot = email.indexOf(".");
        System.out.println(email.substring(atIndex+1, indexOfDot));
    }

    /*
    2. Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School
     */
    public static void capitalization(String firstName, String lastName){

        firstName = firstName.toUpperCase().charAt(0) + firstName.toLowerCase().substring(1);
        lastName = lastName.toUpperCase().charAt(0) + lastName.toLowerCase().substring(1);
        String fullName = firstName +" "+lastName;
        System.out.println("Full name: " + fullName);
    }

    /*
    3. Create a method named monthName that can display the name of the month based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)
        output:
            June
     */
    public static void monthName(int number){
        String month;
        switch (number){
            case 1:
                month="January";
                break;
            case 2:
                month="February";
                break;
            case 3:
                month="March";
                break;
            case 4:
                month="April";
                break;
            case 5:
                month="May";
                break;
            case 6:
                month="Jun";
                break;
            case 7:
                month="July";
                break;
            case 8:
                month="August";
                break;
            case 9:
                month="September";
                break;
            case 10:
                month="October";
                break;
            case 11:
                month="November";
                break;
            case 12:
                month="December";
                break;
            default:
                month="Invalid number";
                break;
        }
        System.out.println(month);
        }

    /*
4. Create a method named day that can display the name of the day based on the given number to the method,
 if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)
        output:
            Friday
     */
    public static void day(int numberOfDay){
        String  day = (numberOfDay == 1)? "Monday" : (numberOfDay == 2)? "Tuesday" : (numberOfDay ==3)? "Wednesday" : (numberOfDay==4)? "Thursday" :
                (numberOfDay==5)? "Friday" : (numberOfDay==6)? "Saturday" : (numberOfDay==7)? "Sunday" : "Invalid Number";
        System.out.println(day);
    }

    /*
    5. Create a method that can print how many days a month has
    Ex:
        month("jUNe")
        output:
            June has 30 days
     */
    public static void month(String monthName){
        monthName = monthName.toLowerCase();
        String namesOfMonth = "january, february, march, april, may, june, july, august, september, october, november and december";
//        if (!namesOfMonth.contains(monthName)){
//            System.err.println("Wrong month name, please try again later!");
//            System.exit(1);
//        }

        String daysOfMonth = "";
        if (namesOfMonth.contains(monthName)){
            boolean has28Days = monthName.equals("february");
            boolean has30Days = monthName.equals("april") || monthName.equals("jun") || monthName.equals("september") || monthName.equals("november");
            boolean has31Days = !has28Days && !has30Days;
            System.out.println(has31Days);
            if (has28Days){
                daysOfMonth = "28 days";
            }else if (has30Days){
                daysOfMonth = "30 days";
            } else {
                daysOfMonth = "31 days";
            }
        }else {
            daysOfMonth = "Invalid month name";
        }

        System.out.println(daysOfMonth);
    }

    /*
6. Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)
    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)
        output:
            You are eligible to vote
     */
    public static void eligibleToVote(int age, boolean isAmerican){
        if (age >= 18 && isAmerican){
            System.out.println("You are eligible to Vote");
        }else {
            System.out.println("You are not eligible to Vote");
        }
    }

    /*
    7. Create a method named salary that takes two arguments:
        1. hourlyRate (double)
        2. weeklyHours (int)
    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)
        output:
            You make $45.0 per hour
            You work 40 hours in a week
            Your gross income is $93600.0
     */
    public static void salary(double hourlyRate, int weeklyHours){
        double perWeek = hourlyRate * weeklyHours;
        double annualIncome = perWeek * 52;
        System.out.println("            You make $"+hourlyRate+" per hour\n" +
                "            You work "+weeklyHours+" hours in a week\n" +
                "            Your gross income is $" + annualIncome);
    }
    public static void main(String[] args) {
        emailDomain("Cydeo@gmail.com");
        capitalization("cyDeO", "sCHooL");
        monthName(6);
        day(5);
        month("jUNeee");
        eligibleToVote(23, true);
        salary(45, 40);
    }

}
