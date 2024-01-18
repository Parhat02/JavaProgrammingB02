package week12.day37_exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Program1 started");

        try {

            System.out.println(9 / 0); // Arithmetic Exception

            System.out.println("Try block");

        }catch(ArithmeticException e){ // We have to give right exception class

            System.out.println("Catch Block");

        }

        System.out.println("Program1 ended");

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Program2 started");

        String str = null;

        try {
            System.out.println(str.toLowerCase());
        }catch (RuntimeException e){
            System.out.println("Catch Block");
        }

        System.out.println("Program2 ended");

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Program3 started");

        try {

            Thread.sleep(5000);
            System.out.println("Try Block");

        }catch (InterruptedException e){

            System.out.println("Catch Block");

        }

        System.out.println("Program3 ended");

    }
}
