package week03.day07_IfStatements;

public class Grade {

    public static void main(String[] args) {
         char grade = 'A';
         String result = "";
         if (grade == 'A'){
             result = "Excellent";
         }
        if (grade == 'B'){
            result = "Great job";
        }
        if (grade == 'C'){
            result = "Good";
        }
        if (grade == 'D'){
            result = "Passed";
        }
        if (grade == 'F'){
            result = "Failed";
        }
        System.out.println(result);

        grade = 'B';
        if (grade == 'A'){
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        }else {
            result = "Failed";
        }
        System.out.println(result);
    }
}
