package Oops;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library() {
        this.books = new Book[5];
        this.bookCount = 0;
    }
    public void addBook(Book book) {
        if (bookCount < 5) {
            books[bookCount++] = book;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }
    public void removeBook(int bookID) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookId() == bookID) {
                books[i] = books[bookCount - 1]; // Replace with last book
                books[bookCount - 1] = null; // Remove reference
                bookCount--;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }
    public Book searchBook(int bookID) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookId() == bookID) {
                return books[i];
            }
        }
        return null;
    }
    public void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books available in the library.");
        } else {
            for (int i = 0; i < bookCount; i++) {
                System.out.println(books[i]);
            }
        }
    }
}
