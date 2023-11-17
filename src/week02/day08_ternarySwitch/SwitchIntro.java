package week02.day08_ternarySwitch;

public class SwitchIntro {

    public static void main(String[] args) {
        char grade = 'Q';
        String result = "";
        switch (grade) {
            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result = "Great Job";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;

            default:
                result = "Invalid";
                break;
        }
        System.out.println(result);



        int num = 10;
        int n = num++;
        System.out.println(n);
        System.out.println(num);


        float f1 = (1560.01 > 12_60.00) ? 10 : 20.45f;
        System.out.println(f1);

    }
}
