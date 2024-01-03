package week10.day30_inheritance.day30Tasks.device;

public class MyDevices {

    public static void main(String[] args) {

        Phone phone = new Phone("Apple", "ProMax", "Blue", "Large", 1200,true,true);
        System.out.println(phone);
        phone.call(123456);
        phone.text(123546);

        Iphone iphone = new Iphone("ProMax", "Blue", "Large", 1200,true,true);
        System.out.println(iphone);
        iphone.call(987654);
        iphone.text(987654);

        Device device = new Device("Phone", "apple", "Blue", "Large", 1200,true,true);
        System.out.println(device);

        Computer computer = new Computer("Apple", "Pro", "White","Medium",2200, true,true,
                true,1024,32,4090, "Intel I9");
        System.out.println(computer);



    }
}
