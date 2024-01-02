package week10.day30_inheritance.day30Tasks;

public class EBook extends Book{

    private String size;
    private int pages;

    public EBook(String title, String type, String author, int price, String size, int pages) {
        super(title, type, author, price);
        setSize(size);
        setPages(pages);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages <= 0){
            System.err.println("Pages can not be set to zero or negative.");
            System.exit(1);
        }
        this.pages = pages;
    }

    public void readBook(){
        System.out.println(getTitle() + " is being read.");
    }
}
