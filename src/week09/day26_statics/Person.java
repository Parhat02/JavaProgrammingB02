package week09.day26_statics;

public class Person {

    public String name;
    public int age;
    public char gender;

    public static boolean isHuman = true;
    public static boolean hasNose = true;
    public static boolean hasWings = false;

    public static int numberOfHead = 1;
    public static int numberOfEyes = 2;

    public Person() {
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name+" is eating.");
    }

    public void drink(){
        System.out.println(name+" is drinking.");
    }

    public void sleep(){
        System.out.println(name+" is sleeping.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isHuman=" + isHuman +
                ", hasNose=" + hasNose +
                ", hasWings=" + hasWings +
                ", numberOfHead=" + numberOfHead +
                ", numberOfEyes=" + numberOfEyes +
                '}';
    }
}
