package week05.day13_customMethods;

public class Day13Tasks {
    public static void main(String[] args) {

        System.out.println(combine("One", "Eight"));
        System.out.println(frequencyOfWord("Java java jAvA", "java"));
        System.out.println(title("jAvA"));
    }

    /*
    1. Create a method named isOdd, that can return true if a number is an odd number, otherwise returns false
     */
    public static boolean isOdd(int num){
        return num % 2 != 0;
    }

    /*
    2. Create a method named isEven, that can return true if a number is an even number, otherwise returns false
     */
    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    /*
    3. Create a method named max, that can return the maximum number between two numbers
     */
    public static int max(int num1, int num2){
        return Math.max(num1, num2);
    }

    /*
    4. Create a method named min, that can return the minimum number between two numbers
     */
    public static int min(int num1, int num2){
        return Math.min(num1, num2);
    }

    /*
    5.  Create a method named combine that can take two string and then add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight
     */
    public static String combine(String word1, String word2){
        word1 =word1.toLowerCase();
        word2 =word2.toLowerCase();
        int word1Length = word1.length();
        char lastChar = word1.charAt(word1Length-1);
        char firstChar = word2.charAt(0);
        String combined = "";
        if (lastChar == firstChar){
            combined = word1.substring(0,word1Length-1) + word2;
        }else {
            combined = word1 + word2;
        }
        return combined;
    }

    /*
    6. Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 4
     */
    public static int frequencyOfWord(String sentence, String word){
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        String temp = sentence.replace(word,word.substring(1));
        return sentence.length() - temp.length();
    }

    /*
    7. Create a method named title that takes a string arguments
    The method returns the proper capitalized version of the given argument
    Ex:
        title("jAvA") ===> Java
     */
    public static String title(String word){
        word = word.toUpperCase().charAt(0) + word.toLowerCase().substring(1);
        return word;
    }
}
