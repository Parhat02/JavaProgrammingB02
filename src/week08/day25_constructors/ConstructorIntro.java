package week08.day25_constructors;

public class ConstructorIntro {

    public ConstructorIntro(){
        System.out.println("Objet is created by using default constructor");
    }

    public ConstructorIntro(int a){
        System.out.println("Object is created by using int argument constructor");
    }


    public static void main(String[] args) {

        ConstructorIntro abj1 = new ConstructorIntro(10);

        ConstructorIntro  obj2 = new ConstructorIntro();


    }
}
