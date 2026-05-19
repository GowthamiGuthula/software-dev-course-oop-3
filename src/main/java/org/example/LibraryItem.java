package org.example;

public class LibraryItem {
    protected String title;
    protected String author;
    protected int year;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Item: " + title + " by " + author + " (" + year + ")";
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }
}
// This class serves as the base for the other item types in the library system.
//  It includes a constructor to initialize the fields, getter methods for each field, 
//  and a `toString` method to provide a string representation of the item. 
//  You can now create the `Album`, `Movie`, and `Book` classes that extend `LibraryItem` 
//  and add any additional fields or methods specific to those item types.    
