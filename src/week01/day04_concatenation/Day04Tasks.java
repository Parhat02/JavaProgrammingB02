package week01.day04_concatenation;

public class Day04Tasks {

    public static void main(String[] args) {

        // Task1: FullName.java: Declare the following variables/ Use concatenation to print the full name
        String firstName = "Ferhat";
        String lastName = "Polat";
        System.out.println("Your full name is : "+firstName+" "+lastName);
        System.out.println("--------------------------------------------");

        // Task2: Flight ticket: Declare the following variables/ Use concatenation to print the full ticket info
        String from = "Istanbul",
            to = "Tokyo",
            ticketPrice = "$2325.5";
        System.out.println("From "+from+" to "+to+" is "+ticketPrice);
        System.out.println("--------------------------------------------");

        // Task3: ShippingAddress.java: Declare the following variables/ Use concatenation to print the full shipping address
        String name = "Ferhat", streetName = "WallStreet", city = "Las Vegas", state = "Nevada";
        int buildingNumber = 525, zipCode = 88901;
        System.out.println("Your Shipping Address is: \n\t"+name+"\n\t"+buildingNumber+" "+streetName+"\n\t"+city+", "+state+" "+zipCode);
        System.out.println("--------------------------------------------");

        // Task4: CarInfo.java: Declare the following variables/ Use concatenation to print the full info of the car
        String make = "Porsche", color = "Silver", model = "Taycan Turbo S";
        int year = 2023, miles = 0, price = 194900;
        System.out.printf("Car information is : \n\t%d %s %s, %d miles, %s, $%d%n",year,make,model,miles,color,price);
        System.out.println("--------------------------------------------");

        // Task5: EmployeeInfo.java/ Declare the following variables/ Use concatenation to print the full info of the employee
        String name1 = "Daniel";
        String gender = "Male";
        int age = 28;
        String companyName = "Google Inc";
        String jobTitle = "Software Developer";
        int salary = 90000;
        System.out.printf("%s is %d years old, gender is %s. \n%s works at %s as a %s." +
                "\n%s makes $%d per year.",name1,age,gender,name1,companyName,jobTitle,name1,salary);
        System.out.println();
        System.out.println("--------------------------------------------");

        /* Task6: SalaryCalculator: Declare the following variables/ Write a program that can calculate the salary and
        display the following info: */
        String name2 = "Joshua";
        int hourlyRate = 40, weeklyHours = 45;
        System.out.println("Hello "+name2+", your salary is $ "+(hourlyRate*weeklyHours*52));
        System.out.println("--------------------------------------------");

        /* Practice tasks:
         1. create a class named PhoneNumber and declare the following variables: countryCode, areaCode, localNumber
         use string concatenation to display the phone number */
        int countryCode = 1, areaCode = 703, localNumber = 4512625;
        System.out.println("+"+countryCode+"("+areaCode+")-"+localNumber);
        System.out.println("--------------------------------------------");

        /* 2. Create a class called BirthDay and create the following variable: name, birthDay(int), birthMonth(String), birthYear(int)
         use concatenation to display the birthday of the person */
        String name3 = "John", birthMonth = "April";
        int birthDay = 25, birthYear = 1995;
        System.out.println(name3+" was born on "+birthMonth+"/"+birthDay+"/"+birthYear);
        System.out.println("--------------------------------------------");

        /* 3. Create a class named KilosToPounds and declare the following variables: kg lb
           3.1 Write a program that can convert any given number of kilos to pounds */
        double kg = 10.5, lb = kg*2.2;
        System.out.println(kg+" kilos is equal to "+lb+" pounds.");
        System.out.println("--------------------------------------------");

        /* 4.  Create a class named GallonsToLiters and declare the following variables: gallon  liters
          Write a program that can convert any given number of gallons to liters */
        double gallon = 10, liters = gallon*3.79;
        System.out.println(gallon+" gallons is equal to "+liters+" liters.");
        System.out.println("--------------------------------------------");

        /* 5. a class named Square and declare the following variables: side area perimeter
         Write a program that can calculate the area and perimeter of a square with any given  side */
        int side = 5, area = side*side, perimeter = 4*side;
        System.out.println("The area of the square is : "+area);
        System.out.println("The perimeter of the square is : "+perimeter);
        System.out.println("--------------------------------------------");

        /* 6. Create a class named Circle and declare the following variables:
         Write a program that can calculate the area and perimeter of a circle with any given radius */
        double radius=5, area3 = radius*radius*3.14, perimeter3 = 2*3.14*radius;
        System.out.println("The area of the circle is : "+area3);
        System.out.println("The perimeter of the circle is : "+Math.round(perimeter3));
        System.out.println("--------------------------------------------");

        /* 7. Create a class named SalaryCalculator, and declare the following variables:
         Use the given info above to calculate the following
         Display each of the above in the following format: */
        int hourlyRate1 = 50, weeklyHours1 = 45, stateTaxRate = 6, federalTaxRate = 26;
        int salaryBeforeTax = hourlyRate1*weeklyHours1*52;
        double stateTax = salaryBeforeTax*stateTaxRate*0.01;
        double federalTax = salaryBeforeTax*federalTaxRate*0.01;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;
        System.out.println("Gross pay is: $"+salaryBeforeTax+"\n\tFederal tax is: $"+federalTax+"\n\tstate tax is: $"+stateTax+
                "\n\tTotal tax is: $"+totalTax+"\n\tNet income is: $"+salaryAfterTax);
        System.out.println("--------------------------------------------");

        // 8. Create a class named SwapTwoVariables1 and declare the following variables:
        //  Write a program that swap variables x & y values by using a temporary variable z
        int x = 10, y = 15, z = 0;
        z = x;
        x = y;
        y = z;
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        System.out.println("--------------------------------------------");

        /* 9.  Create a class named SwapTwoVariable21 and declare the following variables:
         Write a program that swap variables x & y values without using any temporary variables */
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        System.out.println("--------------------------------------------");
        
    }
}
