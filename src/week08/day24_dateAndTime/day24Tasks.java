package week08.day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class day24Tasks {

    public static void main(String[] args) {

        //Task1
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        boolean b = list.removeIf(p -> Collections.frequency(list, p) > 1);
        System.out.println(list);

        System.out.println("----------------------------------------------------");

        //Task2
        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        boolean isDigit = chars.removeIf(p-> Character.isDigit(p));
        //boolean isDigit = chars.removeIf(Character::isDigit);
        System.out.println(chars);

        System.out.println("----------------------------------------------------");

        //Task3
        ArrayList<Character> letterList = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        boolean isLetter = letterList.removeIf(p-> Character.isLetter(p));
        System.out.println(letterList);

        System.out.println("----------------------------------------------------");

        //Task4
        ArrayList<Character> characterList = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        boolean isSpecialCharacter = characterList.removeIf(p-> !Character.isLetterOrDigit(p));
        System.out.println(characterList);

        System.out.println("----------------------------------------------------");

        //Task5
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));
        int max = Collections.max(numberList);
        int min = Collections.min(numberList);
        numberList.removeIf(p-> p==max);
        numberList.removeIf(p-> p==min);
        int secondMax = Collections.max(numberList);
        int secondMin = Collections.min(numberList);
        System.out.println("secondMax = " + secondMax);
        System.out.println("secondMin = " + secondMin);

        System.out.println("----------------------------------------------------");

        //Task6
        ArrayList<String> countryNames = new ArrayList<>(Arrays.asList("Canada","US","Germany", "United Kingdom", "Bangladesh", "new zealand"));
        countryNames.removeIf(p-> p.length()>=10);
        System.out.println(countryNames);

        System.out.println("----------------------------------------------------");

        //Task7
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan",
                "Abida", "Ebrahim", "Farida"));
        for (String name : names) {
            String firstChar = name.charAt(0) + "";
            String lastChar = name.charAt(name.length() - 1) + "";
            if (firstChar.equalsIgnoreCase(lastChar)){
                names.remove(name);
            }
        }
        System.out.println(names);

        System.out.println("----------------------------------------------------");

        //Task8

    }
}
