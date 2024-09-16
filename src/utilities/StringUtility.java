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

    public static void main(String[] args) {

        String s = "abc";
        String b = "abc";

        String a = new String("abc");
        String d = new String("abc");

        System.out.println(s.equals(b));
        System.out.println(s==b);
        System.out.println(a==b);
        System.out.println(a==d);
        System.out.println(a.equals(b));
        System.out.println(a.equals(d));
    }
}
