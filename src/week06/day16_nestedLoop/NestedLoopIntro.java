package week06.day16_nestedLoop;

public class NestedLoopIntro {

    public static void main(String[] args) {

        String str = "aaabbccccddeeeeff";

        String result = "";  // "bdf"

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // each character of str
            int count = 0;
            for (int i = 0; i < str.length(); i++) { // responsible for comparing ch to each character of str and return the frequency of ch
                if(str.charAt(i) == ch){
                    count++;
                }
            }

            if(count == 2 && !result.contains(""+ch)){
                result += ch;
            }

        }


        System.out.println(result);


    }
}
