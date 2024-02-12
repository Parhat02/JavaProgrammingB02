package genneralPractice.oopQuiz;

public class MainClass {

    public static void main(String[] args) {
        Y.staticMethod1();
    }

}

class X{
    int a;
    public X(int age) {
        System.out.println("xxxxx");
    }

    public void staticMethod(){
        System.out.println("ClassX");
    }
}

class Y extends X{

    public Y(int age) {
        super(age);
    }

    public static void staticMethod1(){
        System.out.println("ClassY");
    }
}