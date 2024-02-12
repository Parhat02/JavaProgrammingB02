package genneralPractice.oopQuiz;

public class OrderDriver {

    public static void main(String[] args) {

        Order order = new Order("f");
        order = new Order();
        System.out.println(order.value);

        System.out.println("sdf" + 1);

    }

}

class Order{

    String value = "t";

    {
        value += "a";
    }


    {
        value += "c";
    }

    public Order(){
        value += "b";
    }

    public Order(String str) {
        this();
        value += str;
    }
}