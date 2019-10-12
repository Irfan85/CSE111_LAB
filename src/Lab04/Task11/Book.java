package Lab04.Task11;

public class Book {
    private String title, author;
    private double price;

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

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

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return  "Title = " + title + "\n" +
                "Author = " + author + "\n" +
                "Price = " + price;
    }
}
