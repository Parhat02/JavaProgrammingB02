package week02.wee07_IfStatements;

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

    }
}
