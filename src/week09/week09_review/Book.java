package week09.week09_review;

public class Book {
    private String title, author;
    private int publicationYear;
    private String genre;

    private double price;

    public static boolean hasPages;
    public static boolean isReadable;
    public static boolean isEdible;

    //public static double price; // ONLY one copy


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        if(publicationYear < 0){
            throw new RuntimeException("Publication year of the book can not be negative: " + publicationYear);
        }
        this.publicationYear = publicationYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            throw new RuntimeException("Price of the book can not be set to negative: " + price);
        }
        this.price = price;
    }

    static{
        hasPages = true;
        isReadable = true;
        isEdible = false;
    }

    public Book(String title) {
        setTitle(title);
        setAuthor("Unknown");
        setGenre("Unknown");
        setPublicationYear(2000);
        setPrice(5);
    }

    public Book(String title, String author) {
        this(title);
        setAuthor(author);
    }

    public Book(String title, String author, int publicationYear) {
        this(title, author);
        setPublicationYear(publicationYear);
    }

    public Book(String title, String author, int publicationYear, String genre) {
        this(title, author, publicationYear);
        setGenre(genre);
    }

    public Book(String title, String author, int publicationYear, String genre, double price) {
        this(title, author, publicationYear, genre);
        setPrice(price);
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                '}';
    }
}
