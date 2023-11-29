package utilities;

public class StringUtility {

    public static String reverse(String str){
        // Reverse String

        String reverse = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }
}
