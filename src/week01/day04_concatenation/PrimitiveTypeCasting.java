package week01.day04_concatenation;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {
        double d = 2.5;
        byte b = (byte) d; //explicit casting
        int i = b; // implicit casting
        System.out.println(i);
        int i1 = 12345;
        double d1 = i1; // implicit casting
        double d2 = 525.25;
        int i2 = (int) d2; //explicit casting
        System.out.println(i2);

        System.out.println(50/6);
        System.out.println(50.0/6);
        System.out.println(50/6.0);
        System.out.println(2.5/0.5);
        System.out.println((int)(2.5/0.5));
        System.out.println(20%6);
        System.out.println(20);
    }
}
