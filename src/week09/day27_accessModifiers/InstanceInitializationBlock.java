package week09.day27_accessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;

    {
        name = "James";
        age = 20;
    } // this created default value

    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {


//        InstanceInitializationBlock obj1 = new InstanceInitializationBlock();
//
//        InstanceInitializationBlock obj2 = new InstanceInitializationBlock();
//
//        System.out.println(obj1.name);
//
//        System.out.println(obj2.name);



        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("James", 25);

        InstanceInitializationBlock obj2 = new InstanceInitializationBlock("Aaron", 28);


        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }
}
