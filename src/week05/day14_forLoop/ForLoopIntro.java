package week05.day14_forLoop;

public class ForLoopIntro {

    public static void main(String[] args) {
        for (int i=1; i <= 5; i++){
            System.out.println("Hello Cydeo");
        }

        for (int i =10; i >=5; i --){
            System.out.println("Hello Cydeo");
        }
        System.out.println("----------------------------------------");
        // sum of all numbers 1~100
        int sum = 0;
        for (int i=1; i <= 100; i++){
            sum += i;
        }
        System.out.println(sum);
        System.out.println("----------------------------------------");

        // print all alphabet latter A~Z
        for (char i = 'A'; i <= 'Z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        String letters = "";
        for (char i = 65; i <= 90; i++){
            char ch = i;
            letters = letters+ch+" " ;
        }
        System.out.println(letters);
        System.out.println("----------------------------------------");

        // print all alphabet letters in backwards
        letters = "";
        for (char i = 90; i >= 65; i--){
            char ch = i;
            letters = letters+ch+" " ;
        }
        System.out.println(letters);
        System.out.println("----------------------------------------");

    }
}
