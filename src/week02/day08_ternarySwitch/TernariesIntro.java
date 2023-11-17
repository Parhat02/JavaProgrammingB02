package week02.day08_ternarySwitch;

public class TernariesIntro {

    public static void main(String[] args) {
        int score = 85;
        String result = (score >= 60) ? "Passed" : "Failed";
        System.out.println(result);
        System.out.println("-------------------------------------------");
        int age = 34;
        String result1 = (age >= 21) ? "Eligible" : "Not eligible";
        System.out.println(result1);
        System.out.println("---------------------------------------------");

        int number = 100;
        String result2 = (number > 0)? "Positive" : (number < 0)? "Negative" : "Zero";
        System.out.println(result2);
        System.out.println("------------------------------------------------------");

        int n = 1;
        String  day = (n == 1)? "Monday" : (n == 2)? "Tuesday" : (n ==3)? "Wednesday" : (n==4)? "Thursday" :
                (n==5)? "Friday" : (n==6)? "Saturday" : (n==7)? "Sunday" : "Invalid";
        System.out.println(day);
        System.out.println("--------------------------------------------------------");

        int score1 = 85;
        String result3 = (score1 >= 0 && score <= 100)? (score >= 60)? "Passed": "Failed" : "Invalid" ;
        System.out.println(result3);
        System.out.println("-------------------------------------------------------------");

        if (score1 >= 0 && score <= 100){
            result3 = (score1 >= 90) ? "A": (score1 >= 80)? "B" : (score1 >= 70)? "C" : (score1 >= 60)? "D": "F";
        }else {
            result3 = "Invalid";
        }
        System.out.println(result3);
    }
}
