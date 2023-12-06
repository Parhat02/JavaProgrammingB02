package week06.day16_nestedLoop;

public class Day16Tasks {
    public static void main(String[] args) {
        // shape

        for (int i = 1; i <= 10; i++) {
            String result = "";
            for (int j = 0; j < i; j++) {
                result += "* ";
            }
            System.out.println(result);
        }

/*
2. Create a class called MultiplicationTable, Write a program that can display the multiplication table:
 */

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                String result = i*j + "      ";
                if ((i*j) >= 10){
                    result = result.replaceFirst(" ", "");
                }
               System.out.print(result);
            }
            System.out.println();

        }

            /*
    3. Use a nested loop to print the following output:
     */

        for (char i = 65; i <= 90; i++) {
            String result = "";
            for (char j = 97; j <= 122; j++) {
                result = result + i + j +" ";

            }
            System.out.print(result);
            System.out.println();
        }
    }



}
