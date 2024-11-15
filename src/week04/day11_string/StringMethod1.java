package week04.day11_string;

public class StringMethod1 {
    public static void main(String[] args) {
        String str1 = "CYDEO SCHOOL";

        str1 = str1.toLowerCase(); //"cydeo school"

        System.out.println(str1);


        //-----------------------------------------

        String str2 = "java programming";

        String str3 = str2.toUpperCase(); //"JAVA PROGRAMMING"

        System.out.println(str3);

        //---------------------------------------------

        String word = "Wooden Spoon";

        word = word.toUpperCase(); //"WOODEN SPOON"

        word = word.toLowerCase(); //"wooden spoon"

        System.out.println(word);

        //---------------------------------------------

        String str4 = "          Cydeo School";

        str4 =  str4.trim(); //"Cydeo SchooL"

        System.out.println(str4);


        //---------------------------------------------

        String sentence1 = "Today is Sunday, and we have Java Class";

        int index1 = sentence1.indexOf('w');

        System.out.println(index1);


        String s1 = "I Love Java Programming";

        int firstA = s1.indexOf('a');

        System.out.println(firstA);

        int secondA = s1.indexOf("a ");


        String s2 = "Java Python JavaScript Cydeo Python";

        int a1 = s2.indexOf('a');

        System.out.println(a1);

        int a2 = s2.indexOf("a Python");

        System.out.println(a2);

        int a3 = s2.indexOf("avaS");

        System.out.println(a3);

        int a4 = s2.indexOf("aS");

        System.out.println(a4);


        //-----------------------------------------

        String w = "Java";

        System.out.println(w.indexOf('a')); //1

        System.out.println(w.lastIndexOf('a')); //3

        String w2 = "Java Python JavaScript Cydeo Python";


        System.out.println(w2.lastIndexOf('a'));

        System.out.println(w2.lastIndexOf('P'));
    }
}
