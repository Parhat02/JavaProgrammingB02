package week11.day34_abstraction.animalTask;

public class Dolphin extends Animal implements Playable, Swimmable{


    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin "+getName()+" is eating fish");
    }

    @Override
    public void swim() {

    }

    @Override
    public void play() {

    }
}
