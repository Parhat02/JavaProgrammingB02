package week03.day06_ifStatements;

public class Day06PracticeTasks {
    public static void main(String[] args) {

        /*
        1. Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers
        Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
         */
        int a = 10, b= 15, c = 20;
        if ((a<b && a>c)||(a<c && a>b)){
            System.out.println(a+" is the median number");
        }
        if ((b<a && b>c)||(b<c && b>a)){
            System.out.println(b+" is the median number");
        }
        if ((c<b && c>a)||(c<a && c>b)){
            System.out.println(c+" is the median number");
        }

        /*
         2. Create a  class named NumberToWord, and write a Java program that can convert numbers between 0 ~ 9 into words
			Ex:
				number = 1;
			output:
				One
		Note: Do not use more than one print statement
         */
        int number = 1;
        String result = "";
        if (number==0){
            result = "Zero";
        }
        if (number==1){
            result = "One";
        }
        if (number==2){
            result = "Two";        }
        if (number==3){
            result = "Three";        }
        if (number==4){
            result = "Four";        }
        if (number==5){
            result = "five";        }
        if (number==6){
            result = "Six";        }
        if (number==7){
            result = "Seven";        }
        if (number==8){
            result = "Eight";        }
        if (number==9){
            result = "Nine";        }
        if (number>9 || number < 0){
            System.out.println("Invalid number");
        }
        System.out.println(result);

        /*
        3. Create a class called Calculator; given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate the result of n1&n2 based on the given math Operator.

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
         */
        double n1 = 10, n2 = 20;
        String operator = "+";
        if (operator=="+"){
            System.out.println(n1+n2);
        } else if (operator=="-") {
            System.out.println(n1-n2);
        }else if (operator=="*") {
            System.out.println(n1*n2);
        }else if (operator=="/") {
            System.out.println(n1/n2);
        }else {
            System.out.println("Invalid operator");
        }

        /*
        4. Create a class named ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in the selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

	Note: Do not use more than one print statement
         */
        int selection = 3;
        String language = "";
        if (selection==1){
            language = "Hello, thank for your call";
        }
        if (selection==2){
            language = "Hola, gracias para llamar";
        }
        if (selection==3){
            language = "Merhaba, aradiginiz icin tesekkurler";
        }
        if (selection==4){
            language = "Privet, spasibo za vash zvonok";
        }
        if (selection==5){
            language = "Merci ,pour votre appel";
        }if (selection<=0 || selection>5){
            language = "Invalid selection";
        }
        System.out.println(language);

        /*
        5. Create a class named CharacterIdentity, and write a program that can identify
        if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character
		Ex:
			ch = '@'
		output:
			Special Character

			ch = '1'
		output:
			digit
		HINT: You may wanna check out the numbers of the characters on ASCII table
         */
        char ch = '@';
        String output = "";
        if (ch >=48 && ch <= 57){
            output = "digit";
        } else if ((ch >=65 && ch <= 90) || (ch >=97 && ch <= 122)) {
            output = "Alphabetic Character";
        } else {
            output = "Special Character";
        }
        System.out.println(output);

        /*
        6. Create a class named AgeGroups, an integer variable named age is declared and given. write a program that
        can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

            Note: Do not use more than one print statement
         */
        int age = 15;
        String ageGroup = "";
        if (age>0 && age<=2) {
            ageGroup = "infant";
        }
        if (age>=3 && age<=5) {
            ageGroup = "Toddler";
        }
        if (age>=6 && age<=9) {
            ageGroup = "Kid";
        }
        if (age>=10 && age<=12) {
            ageGroup = "Pre-Teen";
        }
        if (age>=13 && age<=17) {
            ageGroup = "Teenager";
        }
        if (age>=18 && age<=20) {
            ageGroup = "Young Adult";
        }
        if (age>=21 && age<=39) {
            ageGroup = "Adult";
        }
        if (age>=40 && age<=49) {
            ageGroup = "Young Middle-Aged Adult";
        }
        if (age>=50 && age<=54) {
            ageGroup = "Middle-Aged Adult";
        }
        if (age>=55 && age<=64) {
            ageGroup = "Very Young Senior Citizen";
        }
        if (age>=65 && age<=74) {
            ageGroup = "Young Senior Citizen";
        }
        if (age>=75 && age<=84) {
            ageGroup = "Senior Citizen";
        }if (age>=85) {
            ageGroup = "Old Senior Citizen";
        }
        System.out.println(ageGroup);

        /*
        7. Create a class named EqualNumbers, and write a program that can check the equality of the three given numbers
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are equal ==>print "n3&n1 are equal"
				if none of them are equal ==> none of them are equal
         */
        int num1 = 2, num2 = 5, num3 = 2;
        if (num1==num2 && num2==num3){
            System.out.println("all equal");
        }
        if (num1==num2 && num2!=num3){
            System.out.println("num1 & num2 are equal");
        }
        if (num1!=num2 && num2==num3){
            System.out.println("num2 & num3 are equal");
        }
        if (num1!=num2 && num1==num3){
            System.out.println("num1 & num3 are equal");
        }if (num1!=num2 && num2!=num3 && num1!=num3){
            System.out.println("none of them are equal");
        }

        /*
        8. Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number)
        and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you are at 50%

                USE ONE PRINT STATEMENT ONLY
         */
        int oxygenLevel = 80;
        String message = "";
        if (oxygenLevel>90) {
            message = "Your tank is full";
        }
        if (oxygenLevel>80) {
            message = "Still okay";
        }
        if (oxygenLevel>70) {
            message = "Don't go too far";
        }
        if (oxygenLevel>60) {
            message = "Start to head back";
        }
        if (oxygenLevel>50) {
            message = "Be careful now you are at 50%";
        }
        System.out.println(message);

        /*
        9. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax
        based on the following requirements
                the tax rates are:
                        35% for a salary of 130K or more
                        30% for a salary of 100K to 129k
                        25% for a salary of 80K to 99K
                        20% for a salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
         */
        double salary = 140000;
        boolean isMarried = false;
        double taxRate = 0;
        double tax = 0;
        if (isMarried && salary > 135000){
            taxRate = 30;
            tax = salary * 30/100;
        }
        if (isMarried && (salary >= 100000 && salary <= 129000)){
            taxRate = 25;
            tax = salary * 25/100;
        }
        if (isMarried && (salary >= 80000 && salary <= 99000)){
            taxRate = 20;
            tax = salary * 20/100;
        }
        if (isMarried && salary <= 79000){
            taxRate = 15;
            tax = salary * 15/100;
        }
        if (!isMarried && salary > 135000){
            taxRate = 35;
            tax = salary * 35/100;
        }
        if (!isMarried && (salary >= 100000 && salary <= 129000)){
            taxRate = 30;
            tax = salary * 30/100;
        }
        if (!isMarried && (salary >= 80000 && salary <= 99000)){
            taxRate = 25;
            tax = salary * 25/100;
        }
        if (!isMarried && salary <= 79000){
            taxRate = 20;
            tax = salary * 20/100;
        }
        double salaryAfterTax = salary - tax;
        System.out.println("Tas rate is : "+taxRate);
        System.out.println(salaryAfterTax);
    }
}
