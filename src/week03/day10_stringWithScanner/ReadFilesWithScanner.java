package week03.day10_stringWithScanner;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFilesWithScanner {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner( Path.of("src/week03/day10_stringWithScanner/Test.txt") );

//        System.out.println( scan.nextLine() );
//        System.out.println( scan.nextLine() );
//        System.out.println( scan.nextLine() );


        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());

        // System.out.println(  scan.hasNext());

        scan.close();

    }
}
