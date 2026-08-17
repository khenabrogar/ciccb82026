public class Book {
    // Attributes
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    // Constructor — initializes all 4 attributes
    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    // Override toString() — returns formatted string
    @Override
    public String toString() {
        return "Title: \"" + title + "\"\n" +
               "Author: \"" + author + "\"\n" +
               "Year Published: " + yearPublished + "\n" +
               "Price: $" + String.format("%.2f", price);
    }
}