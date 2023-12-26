package week09.day27_accessModifiers;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main method");

        new StaticBlock();
        new StaticBlock();
        new StaticBlock();
    }

    static {
        System.out.println("Static Block");
    }

}
