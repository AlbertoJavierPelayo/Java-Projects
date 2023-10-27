package com.coherentsolutions;

import java.util.List;

/**
 *  Book class that represents a book with the basic information (title, author, year of production, rating and tags)
 */
public class Book {
    // Attributes of book (title, author, yearOfPublication, rating, and tags)
    private String title;
    private String author;
    private int yearOfPublication;
    private double rating; //Added for bonus task
    private List<String> tags; // Added for bonus task



    /**
     * Constructor for book object
     * @param title The title of the book
     * @param author The Author who wrote the book
     * @param yearOfPublication The year of publication of the book
     * @param rating The rating of the book
     * @param tags The tags related to the book
     */
    public Book(String title, String author, int yearOfPublication, double rating, List<String> tags) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.rating = rating;
        this.tags = tags;
    }


    //Getter methods

    /**
     * Getter method for title
     * @return The title of the book
     */
    public String getTitle() {
        return title;
    }
    /**
     * Getter method for author
     * @return The author of the book
     */
    public String getAuthor() {
        return author;
    }
    /**
     * Getter method for year of publication
     * @return The year of publication of the book
     */
    public int getYearOfPublication() {
        return yearOfPublication;
    }
    /**
     * Getter method for rating
     * @return The rating of the book
     */
    public double getRating() {
        return rating;
    }
    /**
     * Getter method for tags
     * @return The list of tags of the book
     */
    public List<String> getTags() {
        return tags;
    }


    /**
     * Override method to display the information of each book
     * @return The information of the book
     */
    @Override
    public String toString(){
    return "Title: " + title + ", Author: " + author + ", Year of Publication: " + yearOfPublication + ", Rating: " + rating + ", Tags: " + String.join(", ", tags);
    }
}
