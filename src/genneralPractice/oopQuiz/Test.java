package genneralPractice.oopQuiz;

public class Test {

    public static void main(String[] args) {
        C1 c = new C1();
        c.m2();
        c.m2("CYDEO" + c.m3(4.0));
    }
}

interface l1{
    void m1();
    void m2();
    void m2(String str);
}

interface l2{
    default int m3(double d1){
        return (int) Math.sqrt(d1);
    }

}

class C1 implements l1, l2 {

    @Override
    public void m1() {
        System.out.println("Method fro C1");
    }

    @Override
    public void m2() {

    }

    @Override
    public void m2(String str) {
        System.out.println(str.substring(2,5));
    }
}