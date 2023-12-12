package week07.day19_array;

import java.util.Arrays;

public class day19Tasks {

    public static void main(String[] args) {

        /*
        1. create an array of named classmates, and store 10 of your classmates' full names
            print the initials of each classmate in separate lines
         */

        String[] classMates = new String[10];
        classMates[0] = "Ferhat Polat";
        classMates[1] = "Celal Can";
        classMates[2] = "Mehmet Hanifi ";
        classMates[3] = "James Paul";
        classMates[4] = "Yor Tan";
        classMates[5] = "Zoo Orc";
        classMates[6] = "Moon Jew";
        classMates[7] = "Nick Vick";
        classMates[8] = "Brick Soup";
        classMates[9] = "Kwi White";
        System.out.println("classMates = " + Arrays.toString(classMates));

        for (int i = 0; i < classMates.length; i++) {

            String initials = classMates[i];

            String lastName = initials.substring(initials.indexOf(" ")+1);

            initials = initials.charAt(0)+""+lastName.charAt(0);
            System.out.println(initials);
        }
        System.out.println("--------------------------------------------------------------");

        /*
        2. create a string array, and store the names of your classmates (10)
            reverse each student's names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
         */

        String[] names = {"Ferhat", "Celal", "Hanifi" , "James", "Yor", "Zoo Orc", "Moon Jew", "Nick Vick",
                "Brick Soup", "Kwi White"};

        for (int i = 0; i < names.length; i++) {

            String revers = "";
            String name = names[i];

            for (int j = name.length()-1; j >= 0; j--) {
                revers = revers + name.charAt(j);
            }

            System.out.println(revers);
        }



    }
}
