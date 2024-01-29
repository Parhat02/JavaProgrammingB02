package week11.week11_review.practice;

public interface Volume {

    public static final boolean HAS_VOLUME = true; // "public static final" by default

    double calcVolume();

    public static void main(String[] args) {
        System.out.println("Static Method");
    }

    default void method(){
        System.out.println("Default method");
    }

}
