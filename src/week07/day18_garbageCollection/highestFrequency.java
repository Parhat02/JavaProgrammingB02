package week07.day18_garbageCollection;

public class highestFrequency {

    /*
1. Write a program that can return the character that has the highest frequency from a string
Ex:
    str = "aaabbccccddeeee"

    output:
        c
        e
 */
    public static void main(String[] args) {
        highestFrequencyCh("aaabbccccddeeee");
    }


    public static void highestFrequencyCh(String str){

        String frequency = "";
        int max = 0;

        String result = "";
        for (int i = 0; i < str.length(); i++) {

            int count = 0;


            if (result.contains(str.charAt(i)+"")){
                continue;
            }
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)){
                    count += 1;
                }

            }
            if (count > max){
                max = count;
            }

            result = str.charAt(i)+"";
        }

        result = "";
        System.out.println("Max frequency is: "+max);
        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            if (result.contains(str.charAt(i)+"")){
                continue;
            }
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)){
                    count += 1;
                }
            }
            result = str.charAt(i)+"";
            System.out.println(str);
            System.out.println(str.charAt(i)+"");
            System.out.println(count);

            if (count == max){
                frequency = frequency + str.charAt(i) + "\n";
            }
        }
        System.out.println("The characters which has the highest frequency: \n"+frequency);
    }
}
