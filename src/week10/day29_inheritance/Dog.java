package week10.day29_inheritance;

public class Dog extends Animal{

      /*
    public void method(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);

        setInfo();
        eat();
        drink();
        sleep();
        toString();
        bark();

    }
    */

    public void bark() {
        System.out.println(getName() + " is barking");
    }
}
