package week10.day30_inheritance.day30Tasks.device;

public class IPhone extends Phone{

    public IPhone(String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Apple", model, color, size, price, hasBattery, hasPowerButton);
    }

    public IPhone(String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }

    public  void faceTime(long phoneNumber){
        System.out.println( getModel() +" is face timing with " +phoneNumber );
    }

    public void faceTime(String email){
        System.out.println( getModel() +" is face timing with " + email );
    }
}
