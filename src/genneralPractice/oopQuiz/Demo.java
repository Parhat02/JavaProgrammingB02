package genneralPractice.oopQuiz;

public class Demo {

    public static void main(String[] args) {

        Demo1 obj1 = new Demo1(5);
        obj1 = new Demo1();

        Demo1 obj2 = obj1;

        obj1.a +=1;
        obj2.a +=1;
        obj2.b +=1;

        obj1.print();
        obj2.print();
    }
}

class Demo1 {

    int a, b;

    public Demo1() {
        a = 10;
        b = 20;
    }
    public Demo1(int a){
        this();
        this.a += a;
    }

    public void print(){
        System.out.println("a: " + a + ", b: " + b);
    }
}