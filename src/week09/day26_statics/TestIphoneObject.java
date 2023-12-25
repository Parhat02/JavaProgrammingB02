package week09.day26_statics;

public class TestIphoneObject {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 15", "Black", 1000);

        System.out.println(iphone.model);
        System.out.println(iphone.color);
        System.out.println(iphone.price);

        iphone.printPhoneInfo();

        System.out.println(iphone.brand);
        System.out.println(iphone.OS);
        iphone.printOperatingSystem();

        System.out.println(Iphone.brand);
        System.out.println(Iphone.OS);
        Iphone.printOperatingSystem();

    }
}
