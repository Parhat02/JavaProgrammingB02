package week10.day29_inheritance;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 4, "Large", "White");

        Cat cat = new Cat();
        cat.setInfo("Felicia", "stray", 'F', 3, "Medium", "Black and White");

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal",  'M', 5, "Large", "Orange");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("--------------------------------------------------------------------------------------");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.bark();

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.meow();

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.hunt();



        System.out.println(dog.getName());
        System.out.println(dog.getColor());

        dog.setGender('F');
        dog.setAge(8);

        System.out.println(dog);

    }
}
