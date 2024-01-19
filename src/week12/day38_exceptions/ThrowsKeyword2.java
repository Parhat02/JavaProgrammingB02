package week12.day38_exceptions;

import utilities.Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws InterruptedException {

        method1();

        Library.sleep(3.5);

//        try {
//            method2();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
    }

    public static void pauseFor5Seconds() throws InterruptedException {
        Thread.sleep(5000);
    }

    public static void method1() throws InterruptedException {
        System.out.println("Hello World");
        pauseFor5Seconds();
        System.out.println("Hello Cydeo");
    }

    public static void method2() throws InterruptedException, FileNotFoundException {

        System.out.println("First program started");

        Thread.sleep(3000);

        System.out.println("First program ended");

        new FileInputStream(" ");


        Thread.sleep(5000);


    }

}
