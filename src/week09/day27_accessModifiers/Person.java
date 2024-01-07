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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public static String getPlanet() {
        return planet;
    }

    public static void setPlanet(String planet) {
        Person.planet = planet;
    }

    public static boolean isIsHuman() {
        return isHuman;
    }

    public static void setIsHuman(boolean isHuman) {
        Person.isHuman = isHuman;
    }

    public static boolean isHasNose() {
        return hasNose;
    }

    public static void setHasNose(boolean hasNose) {
        Person.hasNose = hasNose;
    }

    public static int getNumberOfWings() {
        return numberOfWings;
    }

    public static void setNumberOfWings(int numberOfWings) {
        Person.numberOfWings = numberOfWings;
    }

    public static int getNumberOfHead() {
        return numberOfHead;
    }

    public static void setNumberOfHead(int numberOfHead) {
        Person.numberOfHead = numberOfHead;
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
