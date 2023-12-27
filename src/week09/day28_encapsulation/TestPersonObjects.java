package week09.day28_encapsulation;

import week09.day27_accessModifiers.Person;

public class TestPersonObjects {

    public static void main(String[] args) {


        Person person2 = new Person("Abidullah", 'M');

        Person person3 = new Person("Hasan", 30);

        Person person4 = new Person("Daniel", "English");

        Person person5 = new Person("Tatiana", "English", 'F');

        Person person6 = new Person("Lucy", "English", 31, 'F');

        person4.name = "James";

        //person4.planet = "Mars";
        Person.planet = "Mars";


        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);


        Person.printPlanetName();

        person3.eat("Baklava");

        person2.drink("Water");

        person5.drink("Tea");

        person6.drink("Coffee");
    }
}
