package week02.day01_introPrograming;

public class Test {
    public static void main(String[] args) {
        // EscapeSequences

        // new line: \n
        System.out.println("Hello World\nHello Cydeo");

        //Horizontal tab: \t
        System.out.println("\tJava programming Language");

        // backslash
        System.out.println("\\");

        // double quote: \"
        System.out.println("I like\"Wooden Spoon\"");


        //Quiz:
        long a=3_000L;
        double b=(float)a;
        int c=(short)b;
        System.out.println(a+","+b+","+c);
        System.out.println(c%1000);
        System.out.println("5+2="+3+4);
        System.out.println("5+2="+(3+4));
        String s = "5+2=";
        System.out.println(s);

    }
}
