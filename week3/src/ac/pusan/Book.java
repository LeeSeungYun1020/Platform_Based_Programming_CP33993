package ac.pusan;

import java.util.Random;

public class Book {
    private String author;
    private String title;
    private final int id;
    private static int identification;
    public static int bookCount;

    static {
        identification = new Random().nextInt(10001) - 1;
        bookCount = 0;
    }

    {
        identification++;
        bookCount++;
        id = identification;
    }

    public Book() {
        this("Unknown", "Unknown");
    }

    public Book(String title){
        this(title, "Unknown");
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public static void decrease() {
        bookCount--;
        identification--;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        // if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return author.equals(book.author) && title.equals(book.title);
    }

    @Override
    public String toString() {
        return "Book No: " + id +
                ", entitled \"" + title + "\"" +
                ", written by " + author;
    }
}
