package com.bharath.oops.assignment;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    // Constructor to initialize title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods for title and author
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // toString method to return a string representation of a Book object
    @Override
    public String toString() {
        return "'" + title + "' by " + author;
    }
}

class Library {
    private List<Book> books;

    // Constructor initializes the books list
    public Library() {
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to list all books in the library
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Method to destroy all books when the library is destroyed
    public void destroyLibrary() {
        books.clear();  // Clear all books from the list
        System.out.println("All books in the library have been destroyed.");
    }

    // Destructor-like method to simulate library being destroyed

}

public class Composition {
    public static void main(String[] args) {
        // Create library
        Library library = new Library();

        // Create some book instances
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // List all books
        System.out.println("Books in the library:");
        library.listBooks();

        // Destroy the library, which will also destroy the books
        library.destroyLibrary();


    }
}