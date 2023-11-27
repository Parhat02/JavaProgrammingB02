package week02.day03_variables;

public class Day03Tasks {
    public static void main(String[] args) {

        // Task1: EmployeeInfo / Declare the following variables with appropriate date types:
        String name = "Ferhat";
        String gender = "Male";
        int age = 28;
        String companyName = "Google";
        String jobTitle = "Java Developer";
        int employeeId = 1234567891;
        int salary = 10000;
        boolean isFullTime = true;
        System.out.println("Name: "+name+"\nAge: "+age+"\nGender: "+gender+"\nCompany Name: "+companyName+
                "\nJob Title: "+jobTitle+"\nEmployee ID: "+employeeId+"\nSalary: "+salary+"\nFull Time: "+isFullTime);
        System.out.println("-------------------------------------------");
        // Task2: StudentInfo / Declare the following variables with appropriate date types:
        String student_name = "Ferhat";
        int age1 = 25;
        String gender1 = "Male";
        String school_name = "Yildiz Technical university";
        int student_id = 18093901;
        int grade_level = 4;
        double gpa = 3.29;
        System.out.println("Student Name: "+student_name+"\nAge: "+age1+"\nGender: "+gender1+"\nSchool Name: "+school_name+
                "\nStudent ID: "+student_id+"\nGrade Level: "+grade_level+"\nGPA: "+gpa );
        System.out.println("-------------------------------------------");
        // Task3: Rectangle.java / Declare the following variables
        // Write a program that can display the area of the rectangle
        double width = 25;
        double length = 15;
        double areaOfRectangle = width*length;
        System.out.println("The Area Of The Rectangle is: "+areaOfRectangle);
    }
}
