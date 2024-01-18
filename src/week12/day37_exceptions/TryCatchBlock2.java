package week12.day37_exceptions;

public class TryCatchBlock2 {

    public static void main(String[] args) {

        System.out.println("Program1 started");

        int[] arr = {1, 2, 3, 4};

        try {
            System.out.println(arr[1000]);
        }catch (RuntimeException e){
            e.printStackTrace(); // display full details of the exception after the execution of program
        }


        System.out.println("Program1 ended");

        System.out.println("-------------------------------------------------------");

        System.out.println("Program2 started");
        try{
            System.out.println(9/0);
        }catch (RuntimeException e){
            e.printStackTrace();

        }


        System.out.println("Program1 ended");

        System.out.println("-------------------------------------------------------");

        System.out.println("Program3 started");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program3 ended");
    }
}
