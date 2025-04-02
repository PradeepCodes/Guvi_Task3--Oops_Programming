package Oops;

public class Book {
    public  int bookId;

    @Override
    public String toString() {
        return "BookID: " + bookId + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }

    public String title;
    public  String author;
    private boolean isAvailable;

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    public Book(int bookId, String author, String title) {
        this.bookId = bookId;
        this.author = author;
        this.title = title;
        this.isAvailable = true;
    }

}
