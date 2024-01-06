package week09.week09_review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {

    private String name;

    private String address;

    private ArrayList<Book> books = new ArrayList<>(); // Read ONLY (NO Setter)



    // Constructor: sets the name and address
    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Library(List<Book> list) {
    }

    public Library() {
    }

    // Encapsulate
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }


    // add book
    public void addBook(Book book){
        books.add(book);
    }

    public void addBooks(Book[] books){
        this.books.addAll(Arrays.asList(books));
    }

    // remove a book
    public void removeBook(Book book){
        books.remove(book);
    }


    // toString
    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", books=" + books +
                '}';
    }
}
