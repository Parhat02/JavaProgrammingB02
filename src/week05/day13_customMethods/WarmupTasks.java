package week05.day13_customMethods;

public class WarmupTasks {
    public static void main(String[] args) {

        calculate(25,36,'+');
        ageGroup(75);

    }

    public static void calculate(double num1, double num2, char mathOperator) {


        switch (mathOperator) {

            case '+':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 + num2));
                break;

            case '-':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 - num2));
                break;

            case '*':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 * num2));
                break;

            case '/':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 / num2));
                break;

            default:
                System.err.println("Invalid operator: " + mathOperator);

        }
    }

    public static void ageGroup(int age) {

        if (age >= 0 && age <= 150) {

            System.out.println((age < 21) ? "Teenager" : (age < 55) ? "Adult" : "Senior");

        } else {

            System.err.println("Invalid age: " + age);

        }
    }



}
