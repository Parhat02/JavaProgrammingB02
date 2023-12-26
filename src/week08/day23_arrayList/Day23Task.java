package week08.day23_arrayList;

import java.util.*;

public class Day23Task {

    public static void main(String[] args) {

        //Task1
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list.set(list.size()-1, 0);
        System.out.println(list);

        System.out.println("-----------------------------------------------------");

        //Task2
        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> combine = new ArrayList<>(Arrays.asList(arr1));
        combine.addAll(Arrays.asList(arr2));
        System.out.println(combine);

        System.out.println("-----------------------------------------------------");

        //Task3
        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));
        names.removeAll(List.of("Ahmed"));
        System.out.println(names);

        System.out.println("-----------------------------------------------------");

        //Task4
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer> number2 = new ArrayList<>(numbers);
        number2.addAll(numbers);
        boolean b = Collections.addAll(number2, 1,2);
        System.out.println(b);
        System.out.println(number2);

        System.out.println("-----------------------------------------------------");

        //Task5
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        int n = 5;
        for (int i = 0; i < n-1; i++) {
            int max = Collections.max(numberList);
            numberList.removeAll(Arrays.asList(max));
        }
        System.out.println(numberList);
        int max = Collections.max(numberList);

        System.out.println(n+"th max number = " + max);

        System.out.println("-----------------------------------------------------");

        //Task6
        ArrayList<Integer> numberList1 = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        int length = numberList1.size();
        numberList1.removeAll(Arrays.asList(0));
        Collections.sort(numberList1);

        //Collections.reverse(numberList1);
        length = length - numberList1.size();
        for (int i = 0; i < length; i++) {
            numberList1.add(0);
        }

        System.out.println(numberList1);

        System.out.println("-----------------------------------------------------");

        //Task7
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        for (int i = 0; i < numbers2.size(); i++) {

            if (numbers2.get(i)%2 != 0){
                numbers2.set(i,numbers2.get(i)*2);
            }
        }

        System.out.println(numbers2);

        System.out.println("-----------------------------------------------------");

        //Task8
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character>  specialCharacter= new ArrayList<>();

        //String[] sh = str.split("");
        //System.out.println(Arrays.toString(sh));

        char[] ch = str.toCharArray();
        for (char s : ch) {
            if (Character.isDigit(s)){
                digits.add(s);
            }
            if (Character.isLetter(s)){
                letters.add(s);
            }
            if (!Character.isLetterOrDigit(s)){
                specialCharacter.add(s);
            }
        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialCharacter = " + specialCharacter);
    }
}
