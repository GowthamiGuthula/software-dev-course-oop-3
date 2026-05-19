package org.example; 
public class Movie extends LibraryItem {
    protected int durationInMinutes;

    public Movie(String title, String author, int year, int durationInMinutes) {
        super(title, author, year);
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    @Override
    public String toString() {
        return "Movie: " + getTitle() + " by " + getAuthor() + " (" + getYear() + ") - " + durationInMinutes + " minutes";
    }
}
// ``` This `Movie` class extends the `LibraryItem` class and adds an additional field for the duration of the movie in minutes. 
// It includes a constructor that initializes all fields, a getter method for the `durationInMinutes`, 
// and an overridden `toString` method that provides a string representation of the movie in the specified format. 
// You can now create instances of the `Movie` class and use its methods to access the properties and represent the movie as a string.
