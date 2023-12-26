package week09.day27_accessModifiers;

public class TestNestedClassObjects {

    public static void main(String[] args) {

        Car car1 = new Car(); // Car object

        Car.CarEngine obj2 = car1.new CarEngine(); // CarEngine object

        Car.StaticInnerClass obj3 = new Car.StaticInnerClass();

        obj2.method();
        obj3.method();
    }
}
