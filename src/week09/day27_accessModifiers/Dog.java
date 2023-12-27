package week09.day27_accessModifiers;

public class Dog {

    public String breed, size,color;
    public char gender;
    public int age;

    public static int numberOfLegs, numberOfEyes, numberOfWings;

    public boolean isFriendly;

    public Dog(String breed, String size, String color, char gender, int age, boolean isFriendly) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
        this.isFriendly = isFriendly;
    }

    static {
        numberOfLegs = 4;
        numberOfEyes = 2;
        numberOfWings = 0;
    }

    public void eat(){
        System.out.println(breed + " is eating");
    }

    public void drink(){
        System.out.println(breed + " is drinking");
    }

    public void sleep(){
        System.out.println(breed + " is sleeping");
    }

    public void play(){
        System.out.println(breed + " is playing");
    }
    public void bark(){
        System.out.println(breed + " is barking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", isFriendly=" + isFriendly +
                '}';
    }
}
