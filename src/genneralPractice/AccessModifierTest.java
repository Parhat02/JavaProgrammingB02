package genneralPractice;

import week09.day27_accessModifiers.AccessModifiers;
import week09.day27_accessModifiers.Data;

public class AccessModifierTest {

    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        Data obj = new Data();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

        System.out.println("---------------------------");

        System.out.println(AccessModifiers.publicData); // public is always accessible in different packages

        //  System.out.println(AccessModifiers.protectedData); // protected is NOT always accessible in different packages

        //   System.out.println(AccessModifiers.defaultData); // default is not be accessible in different packages

        //    System.out.println(AccessModifiers.privateData); // private is not accessible in different packages

        new AccessModifiers();


        AccessModifiers.publicMethod();
        //    AccessModifiers.protectedMethod();
        //    AccessModifiers.defaultMethod();
        //    AccessModifiers.privateMethod();



    }

}
