package org.example;

public class Album extends LibraryItem {
    protected int trackCount;

    public Album(String title, String author, int year, int trackCount) {
        super(title, author, year);
        this.trackCount = trackCount;
    }

    public int getTrackCount() {
        return trackCount;
    }

    @Override
    public String toString() {
        return "Album: " + getTitle() + " by " + getAuthor() + " (" + getYear() + ") - " + trackCount + " tracks";
    }
}
// This `Album` class extends the `LibraryItem` class and adds an additional field for the number of tracks on the album. 
// It includes a constructor that initializes all fields, a getter method for the `trackCount`, and an overridden `toString` method 
// that provides a string representation of the album in the specified format. 
// You can now create instances of the `Album` class and use its methods to access the properties and represent the album as a string.
