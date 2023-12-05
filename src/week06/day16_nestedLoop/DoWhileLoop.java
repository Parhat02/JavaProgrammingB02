package week06.day16_nestedLoop;

public class DoWhileLoop {

    public static void main(String[] args) {

        boolean condition = false;

        for (; condition ;){
            System.out.println("Hello Cydeo   --- For Loop");
        }

        System.out.println("-------------------------------------");

        while(condition){
            System.out.println("Hello Cydeo  --- While Loop");
        }

        System.out.println("-------------------------------------");

        do{
            System.out.println("Hello Cydeo  --- Do&While Loop");
        }while (condition);


    }
}
