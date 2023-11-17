package week02.day08_ternarySwitch;

public class Day08Tasks {

    public static void main(String[] args) {
        /*
        2. Create a class called Loans; given two variables, salary and credit score, use the given info to determine if you can get a loan.

                To be approved for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650
                    Otherwise print: "Loan Denied"
              NOTE: MUST USE TERNARY.
         */

        int salary = 50000;
        int score = 650;
        String result = (salary >= 60000 && score >= 650)? "Loan Approved" : "Loan Denied";
        System.out.println(result);
        System.out.println("---------------------------------------------------");
        /*
6. Create a class called BiggerNum, and write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1, n2 and n3

            if n1 is the biggest output: "n1 is bigger"
            if n2 is the biggest output: "n2 is bigger"
            if n3 is the biggest output: "n3 is bigger"
         NOTE: MUST USE TERNARY
         */
        int n1 = 2, n2 = 3, n3 = 5;
        String result1 = (n1>n2 && n1>n3)? "n1 is bigger": (n2>n1 && n2>n3)? "n2 is bigger": "n3 is bigger";
        System.out.println(result1);
        System.out.println("--------------------------------------");

        /*
        7. Create a class called Calculator; given two double variables named n1 & n2, and a char variable named
         mathOperator, write a program that can calculate the result of n1&n2 based on the given math Operator.
		char operator -> -, +, *, /
		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"
		Ex:
			n1 = 10, n2= 20, mathOperator = '+'
		output:
			30
		Note: MUST use the switch statement
         */
        String operator = "*";
        int num1 = 10, num2 = 20;
        int result3 = 0;
        switch (operator){
            case "+":
                result3 = num1 + num2;
                break;
            case "-":
                result3 = num1 - num2;
                break;
            case "*":
                result3 = num1 * num2;
                break;
            case "/":
                result3 = num1 / num2;
                break;
            default:
                System.out.println("Invalid sign");
                break;
        }
        System.out.println(result3);
        System.out.println("-------------------------------------");

        // Practice Task 8
        // Solution 1 : Ternary
        int statusCode = 200;
        String label = (statusCode == 200)? "OK" : (statusCode == 201)? "Created": (statusCode == 202)? "Accepted":
                (statusCode == 301)? "Moved Permanently": (statusCode == 303)? "See Other" :
                        (statusCode == 304)? "Not Modified": (statusCode == 307)? "Temporary Redirect":
                        (statusCode == 400)? "Bad Request": (statusCode == 401)? "Unauthorized": (statusCode == 403)? "Forbidden":
                                (statusCode == 404)? "Not Found": (statusCode == 410)? "Gone": (statusCode == 500)? "Internal Server Error":
                                        (statusCode == 503)? "Service Unavailable" : "Invalid code";

        System.out.println(label);
        // Solution 2 : switch statement
        String label1 = "";
        switch (statusCode){
            case 200:
                label1 = "OK";
                break;
            case 201:
                label1 = "Created";
                break;
            case 202:
                label1 = "Accepted";
                break;
            case 301:
                label1 = "Moved Permanently";
                break;
            case 303:
                label1 = "See Other";
                break;
            case 304:
                label1 = "Not Modified";
                break;
            case 307:
                label1 = "Temporary Redirect";
                break;
            case 400:
                label1 = " Bad Request";
                break;
            case 401:
                label1 = "Unauthorized";
                break;
            case 403:
                label1 = "Forbidden";
                break;
            case 404:
                label1 = "Not Found";
                break;
            case 410:
                label1 = "Gone";
                break;
            case 500:
                label1 = "Internal Server Error";
                break;
            case 503:
                label1 = "Service Unavailable";
                break;
            default:
                label1 = "Invalid";
                break;
        }
        System.out.println(label);
        System.out.println("---------------------------------------------");

        /*
        9. write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, the output should be: Invalid Browser

        	Do Not use if statement or ternary
         */
        String browserName = "chrome";
        String result4 = "";
        switch (browserName){
            case "chrome":
                result4 = "chrome";
                break;
            case "firefox":
                result4 = "firefox";
                break;
            case "opera":
                result4 = "opera";
                break;
            case "safari":
                result4 = "safari";
                break;
            case "edge":
                result4 = "edge";
                break;
            default:
                System.out.println("Invalid Browser");
                break;
        }
        System.out.println(result4);
        System.out.println("-------------------------------------------");
        /*
        10. Create a class named CydeoBatches. In Cydeo, we have three batch types: US morning, US evening, and EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If the batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use the switch statement
				Solution 2: use if & switch statements mixed
         */
        //Solution 1: use if statement
        String batchType = "Us morning";
        String result5 = "";
        if (batchType.equalsIgnoreCase( "US morning")){
            result5 = "Class times are 10-5 EST. M, T, Th, F.";
        } else if (batchType.equalsIgnoreCase( "US evening")) {
            result5 = "Class times are 7-10 EST. M, T, W, Th, S, S";
        }else if (batchType.equalsIgnoreCase("EU")) {
            result5 = "Class times are  10-5 EST. M, T, W, Th, F.";
        }else {
            result5 = "Invalid Btach";
        }
        System.out.println(result5);
        System.out.println("-------------------------------------------");

        //Solution 2: use the switch statement
        batchType = "US evening";
        switch (batchType){
            case "US morning":
                result5 = "Class times are 10-5 EST. M, T, Th, F.";
                break;
            case "US evening":
                result5 = "Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
            case "EU":
                result5 = "Class times are  10-5 EST. M, T, W, Th, F.";
                break;
            default:
                result5 = "Invalid Btach";
                break;
        }
        System.out.println(result5);
        System.out.println("-------------------------------------------");

        //
    }
}
