package week09.day27_accessModifiers;

public class StaticInitializationBlock {

    public static int a;
    public static double b;
    public static String c;

    static {
        a = 100;
        b = 20.5;
         c = "Java";
    }



    /*
    public StaticInitializationBlock() {

        a = 100;
        b = 20.5;
        c = "Java";
    }
    */
}
