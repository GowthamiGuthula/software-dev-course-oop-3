package org.example;
public class Book extends LibraryItem {
    protected int pageCount;

    public Book(String title, String author, int year, int pageCount) {
        super(title, author, year);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "Book: " + getTitle() + " by " + getAuthor() + " (" + getYear() + ") - " + pageCount + " pages";
    }

    public void readBook() {
        System.out.println("Reading " + getTitle() + " by " + getAuthor() + "...");
        System.out.println("Done!");
    }
}

// This `Book` class extends the `LibraryItem` class and adds an additional field for the number of pages in the book. 
// It includes a constructor that initializes all fields, a getter method for the `pageCount`, an overridden `toString` 
// method that provides a string representation of the book in the specified format, and a `readBook` method 
// that simulates reading the book by printing messages to the console. 
// You can now create instances of the `Book` class, use its methods to access properties, represent it as a string, and simulate reading it.     