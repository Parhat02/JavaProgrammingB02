package week07.day19_array;

import java.util.Arrays;

public class Alphabets {

    public static void main(String[] args) {

        char[] ascending = new char[26];
        int n = 'A';
        for (int i = 0; i < ascending.length; i++) {
            ascending[i] = (char)n;
            n += 1;
        }

        System.out.println("ascending = " + Arrays.toString(ascending));

        char[] descending = new char[26];

        for (int i = 0, j = 'A', k = 'Z'; i < ascending.length; i++, j++, k--) {
            ascending[i] = (char) j;
            descending[i] = (char) k;
        }

        System.out.println("ascending = " + Arrays.toString(ascending));
        System.out.println("descending = " + Arrays.toString(descending));

        System.out.println("-----------------------------------------------------");
        
        char[] characters = new char[65535]; // All the characters

        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) i;
        }

        System.out.println("characters = " +Arrays.toString(characters));
    }
}
