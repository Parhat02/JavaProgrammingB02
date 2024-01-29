package week11.week11_review.deviceTask;

public class Samsung extends Phone implements AndroidApps{
    public Samsung(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" is downloading apps from " + Samsung.APPStoreName);
    }
}
