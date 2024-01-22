package week13.day39_collections;

public class TestMultiThreading {

    public static void main(String[] args) {

        ThreadHelloWorld thread1 = new ThreadHelloWorld(1);
        ThreadHelloWorld thread2 = new ThreadHelloWorld(2);
        ThreadHelloWorld thread3 = new ThreadHelloWorld(3);
        ThreadHelloWorld thread4 = new ThreadHelloWorld(4);
        ThreadHelloWorld thread5 = new ThreadHelloWorld(5);


/*
        thread1.run();
        thread2.run();
        thread3.run();
        thread4.run();
        thread5.run();

 */

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
