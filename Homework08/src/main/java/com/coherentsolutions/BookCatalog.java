package com.coherentsolutions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class of a catalog of books
 */
public class BookCatalog {
    // List to hold Book objects
    private List<Book> books;


    /**
     * Constructor of the catalog to initialize the array of the catalog
     */
    public BookCatalog() {
        books = new ArrayList<>();
    }

    /**
     * Method for adding a book
     * @param book The book object to add
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Method for removing a book by title
     * @param title The title of the book to remove
     */
    public void removeBookByTitle(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    /**
     * Method for sorting books by title
     */
    public void sortBooksByTitle() {
        books.sort(Comparator.comparing(Book::getTitle));
    }

    /**
     * Method for sorting books by author
     */
    public void sortBooksByAuthor() {
        books.sort(Comparator.comparing(Book::getAuthor));
    }

    /**
     * Method for sorting books by title
     */
    public void sortBooksByYearOfPublication() {
        books.sort(Comparator.comparing(Book::getYearOfPublication));
    }

    /**
     * Method for finding books by title
     * @param title The title of the book to find
     * @return the list of books with that title
     */
    public List<Book> findBooksByTitle(String title) {
        return books.stream().filter(book -> book.getTitle().equals(title)).collect(Collectors.toList());
    }

    /**
     * Method for finding books by author
     * @param author The author of the books to find
     * @return The list of books written by that author
     */
    public List<Book> findBooksByAuthor(String author) {
        return books.stream().filter(book -> book.getAuthor().equals(author)).collect(Collectors.toList());
    }

    /**
     * Method for finding books by year of publication
     * @param yearOfPublication The year of publication
     * @return The list of books written in that year
     */
    public List<Book> findBooksByYearOfPublication(int yearOfPublication) {
        return books.stream().filter(book -> book.getYearOfPublication() == yearOfPublication).collect(Collectors.toList());
    }


    /**
     * Bonus Method 1: Method to Calculate the average rating for books by a particular author
     * @param author The author
     * @return The average rating
     */
    public double averageRatingByAuthor(String author) {
        return books.stream().filter(book -> book.getAuthor().equals(author))
                .mapToDouble(Book::getRating).average().orElse(0.0);
    }

    /**
     * Bonus Method 2: Flatten a list of all tags across all books
     * @return The list of all tags across all books
     */
    public List<String> allTags() {
        return books.stream().flatMap(book -> book.getTags().stream()).distinct().collect(Collectors.toList());
    }

    /**
     * Bonus Method 2: Flatten a list of all tags across all books by author
     * @param author The author
     * @return The list of all tags across all books written by author
     */
    public List<String> allTagsByAuthor(String author) {
        return books.stream().filter(book -> book.getAuthor().equals(author)).flatMap(book -> book.getTags().stream()).distinct().collect(Collectors.toList());
    }


    /**
     * Getter method to return the List of books
     * @return The books of the catalog
     */
    public List<Book> getBooks() {
        return books;
    }
}
