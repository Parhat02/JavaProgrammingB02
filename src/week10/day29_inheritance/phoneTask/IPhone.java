package week10.day29_inheritance.phoneTask;

public class IPhone extends Phone{

    public IPhone(String brand, String model, String size, String color, double price) {
        super(brand, model, size, color, price);
    }

    public void faceTime(long phoneNumber){
        System.out.println("Face Timing with : " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println("Face Timing with : " + email);
    }
}
