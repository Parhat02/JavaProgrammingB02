package week08.day25_constructors;

import week06.day17_customClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethodPractice {

    public static void main(String[] args) {

        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", "Medium", 'M', 4,"Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", "Large", 'F', 8, "Gold");
        dogs[2].setInfo("Molly", "Beagle", "Small", 'F', 5,"White");
        dogs[3].setInfo("Oliver", "Bulldog", "Small", 'M', 2, "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", "Small", 'F',3 , "White");
        dogs[5].setInfo("Loki", "Chow Chow", "Medium", 'M',7 , "Gold");

        ArrayList<Dog> smallDogs = new ArrayList<>(Arrays.asList(dogs));
        smallDogs.removeIf(p-> !p.size.equalsIgnoreCase("small"));
        /*
        for (Dog dog : dogs) {
            if(dog.size.equalsIgnoreCase("Small")){
                smallDogs.add(dog);
            }
        }
*/
        System.out.println(smallDogs);


        ArrayList<Dog> youngDogs = new ArrayList<>( Arrays.asList(dogs) );
      /*
        for (Dog dog : dogs) {
            if(dog.age <= 4){
                youngDogs.add(dog);
            }
        }
         */
        youngDogs.removeIf( p -> p.age > 4);

        System.out.println(youngDogs);

        youngDogs.forEach( p -> System.out.println(p.name) );

        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));
        femaleDogs.removeIf(p -> p.gender == 'M');

        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));
        maleDogs.removeIf( p -> p.gender == 'F');


        System.out.println("----------------------------------------------------------------------");

        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].setInfo("Max", "Husky", "Medium", 'M', 4,"Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", "Large", 'F', 8, "Gold");
        dogs2[2].setInfo("Molly", "Beagle", "Small", 'F', 5,"White");
        dogs2[3].setInfo("Oliver", "Bulldog", "Small", 'M', 2, "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", "Small", 'F',3 , "White");
        dogs2[5].setInfo("Loki", "Chow Chow", "Medium", 'M',7 , "Gold");

        ArrayList<Dog> list = new ArrayList<>( Arrays.asList(dogs2) );
        list.removeIf(p -> p.size.equalsIgnoreCase("small"));

        dogs2 = list.toArray(new Dog[list.size()]);

        System.out.println(Arrays.toString(dogs2));

    }
}
