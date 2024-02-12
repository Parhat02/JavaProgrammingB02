package genneralPractice.oopQuiz;

public class Cheetah {

    int numSpots;

    public Cheetah() {
        this.numSpots = 35;
    }

    public Cheetah(int numSpots) {
        this();
        this.numSpots = numSpots;
    }

    public static void main(String[] args) {

        System.out.println(new Cheetah(50).numSpots);
    }
}
