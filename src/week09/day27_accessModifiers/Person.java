package week09.day27_accessModifiers;

public class Person {

    public String name, language;
    public int age;
    public char gender;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, String language) {
        this.name = name;
        this.language = language;
    }

    public Person(String name, String language, int age) {
        this.name = name;
        this.language = language;
        this.age = age;
    }

    public Person(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }

    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead = 0;
    }

    public static void printPlanetName(){
        System.out.println("Planet name is : " + planet);
    }

    public void eat(String food){
        System.out.println(name + " is eating "+ food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking "+ drink);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", planet='" + planet + '\'' +
                '}';
    }
}
