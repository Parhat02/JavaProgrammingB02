package week09.day27_accessModifiers;

public class InstanceBlock {

    public InstanceBlock() {
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance Block");
    }

    public static void main(String[] args) {

        new InstanceBlock();
        new InstanceBlock();
        new InstanceBlock();

    }
}
