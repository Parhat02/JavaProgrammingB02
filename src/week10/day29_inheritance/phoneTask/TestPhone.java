package week10.day29_inheritance.phoneTask;

public class TestPhone {

    public static void main(String[] args) {

        IPhone iphone = new IPhone("IPhone 12", "Large", "max","Black", 1000.5);

        Samsung samsung = new Samsung("Galaxy S22", "Medium", "max","White", 1100);

        Nokia nokia = new Nokia("Brick", "Small", "mini", "Pink",50);

//        Nokia nokia1 = new Nokia();
//
//        System.out.println(nokia1);

        iphone.call(911);
        samsung.call(911);
        nokia.call(911);

        iphone.text(123456789);
        samsung.text(123456789);
        nokia.text(123456789);

        System.out.println("-------------------------------");

        iphone.faceTime(123456789);


        samsung.freeze();


        nokia.selfDefence();


        System.out.println("-------------------------------");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

    }

}
