package week10.day30_inheritance.day30Tasks;

public class AudioBook extends Book {

    private int length;
    private String narrator;

    public AudioBook(String title, String type, String author, int price, int length, String narrator) {
        super(title, type, author, price);
        setLength(length);
        setNarrator(narrator);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length <= 0){
            System.err.println("Length can not be set to zero or negative.");
            System.exit(1);
        }
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                '}';
    }
}
