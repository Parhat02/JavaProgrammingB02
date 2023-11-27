package week02.day03_variables;

public class            PrimitiveDataTypesIntro {
    public static void main(String[] args) {

        // DataType variableName = Data;
        byte b= 127; // byte only accepts integer values (-128~127), byte cannot take decimal numbers
        short s= 17500; // values (-32768~32767)
        int i = 95000;  // values (-2147483648~2147483647)
        long l = 9999999999L;
        double d = 3.5; // preferred  /  Primitives: int is for integer numbers. double is for decimal numbers.
        float f=3.4f;
        char c='A';  // only single character can be assigned
        char c1='!'; // values (0~65535)
        char c2=989; char c3=3500;
        System.out.println(c+","+c1+","+c2+","+c3);
        boolean r=true; boolean r1=false;
        boolean r2 = 100<101; boolean r3 = 12<11;
        System.out.println(r2+","+r3);

    }
}
