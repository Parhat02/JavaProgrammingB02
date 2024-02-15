package genneralPractice;

import java.util.*;

import static java.util.Arrays.*;

public class NonRepeatingVowel {

    public static void main(String[] args) {

        System.out.println(frequencyOfCharacter("responsible"));
        System.out.println(frequencyOfCharacter(""));
        System.out.println(frequencyOfCharacter(null));

        System.out.println("===========================================================");

        System.out.println(firstNonRepeatingVowel("google"));
        System.out.println(firstNonRepeatingVowel("responsible"));
        System.out.println(firstNonRepeatingVowel("mood"));

    }
    public static Map<Character, Integer> frequencyOfCharacter(String str){

        if (str == null) return null;

        Map<Character, Integer> map = new HashMap<>();
        if (str.isEmpty()) return map;

//        for (Character each : str.toCharArray()){
//            if (map.containsKey(each)){
//                map.put(each, map.get(each)+1);
//            }else {
//                map.put(each,1);
//            }
//        }

        ArrayList<Character> list = new ArrayList<>();
        for (char each:str.toCharArray()){
            list.add(each);
        }
        int count = 0;
        for (Character each : list){
            count = Collections.frequency(list,each);
            map.put(each, count);
        }

        return map;
    }

    public static Integer firstNonRepeatingVowel(String str){

        if (str == null) return null;

        if (str.isEmpty()) return 0;

        Map<Character, Integer> map = new LinkedHashMap<>();
        str = str.toLowerCase();

        ArrayList<Character> list = new ArrayList<>();
        for (char each:str.toCharArray()){
            list.add(each);
        }

        ArrayList<Character> characters = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int count = 0;
        int index = -1;
        for (Character each : list){
            count = Collections.frequency(list,each);
            map.put(each, count);
            if (count==1 && characters.contains(each)){
                index = str.indexOf(each);
                break;
            }
        }

        System.out.println(map);
        return index;
    }

}
