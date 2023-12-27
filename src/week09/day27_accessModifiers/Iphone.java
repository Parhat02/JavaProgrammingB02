package week09.day27_accessModifiers;

public class Iphone {

    public String brand, model, size, color;
    public static String OS;
    public static boolean isSmartPhone;
    public static String madeIn, designedIn;

    public Iphone(String brand, String model, String size, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
    }

    static {
        OS = "IOS";
        isSmartPhone = true;
        madeIn = "China";
        designedIn = "USA";
    }

    public void printOperatingSystem(){
        System.out.println(OS);
    }

    public void call(long phoneNumber){
        System.out.println("Calling : " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("Texting to : " + phoneNumber);
    }

    public void faceTime(long phoneNumber){
        System.out.println("Face time with : " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println("Face time with : " + email);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
