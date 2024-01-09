package week11.day32_finalKeyWord;

import week09.day26_statics.Student;

import java.time.LocalDate;

class CydeoStudent{

    public void language(){
        System.out.println("Java programming");
    }
}


public class FinalKeyWord extends CydeoStudent{

    public void language(){
        System.out.println("Python programming");
    }

    public static void main(String[] args) {

        final char gender = 'M';
        System.out.println(gender);

        //gender = 'F';
        System.out.println(gender);

        final LocalDate dateOfBirth = LocalDate.now();

        System.out.println(dateOfBirth);

        //dateOfBirth = dateOfBirth.plusYears(1);

        System.out.println(dateOfBirth);

        System.out.println("--------------------------------------------------------");

        new FinalKeyWord().language();
        new CydeoStudent().language();

        System.out.println("-----------------------------------");

        final String name = "James";
        // name = null;
        // name = "Daniel";

        System.out.println(name);
    }
}
