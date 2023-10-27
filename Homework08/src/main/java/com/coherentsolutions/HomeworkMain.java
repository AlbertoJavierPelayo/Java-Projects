package com.coherentsolutions;

import java.util.List;

public class HomeworkMain {
    public static void main(String[] args) {
        // Create a new book catalog
        BookCatalog catalog = new BookCatalog();

        // Add some books to the catalog
        catalog.addBook(new Book("Harry Potter and the Philosopher’s Stone", "J.K. Rowling", 1997, 4.47, List.of("Harry Potter", "Magic", "Philosopher’s Stone", "Science Fiction", "HP Book 1")));
        catalog.addBook(new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", 1998, 4.43, List.of("Harry Potter", "Chamber of Secrets", "Science Fiction", "HP Book 2")));
        catalog.addBook(new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 1999, 4.58, List.of("Harry Potter", "Prisoner of Azkaban", "Science Fiction", "HP Book 3")));
        catalog.addBook(new Book("Harry Potter and the Goblet of Fire", "J.K. Rowling", 2000, 4.56, List.of("Harry Potter", "Goblet of Fire", "Science Fiction", "HP Book 4")));
        catalog.addBook(new Book("Harry Potter and the Order of the Phoenix", "J.K. Rowling", 2003, 4.50, List.of("Harry Potter", "Order of the Phoenix", "Science Fiction", "HP Book 5")));
        catalog.addBook(new Book("Harry Potter and the Half-Blood Prince", "J.K. Rowling", 2005, 4.58, List.of("Harry Potter", "Half-Blood Prince", "Science Fiction", "HP Book 6")));
        catalog.addBook(new Book("Harry Potter and the Deathly Hallows", "J.K. Rowling", 2007, 4.62, List.of("Harry Potter", "Deathly Hallows", "Science Fiction", "HP Book 7")));

        catalog.addBook(new Book("The Hunger Games", "Suzanne Collins", 2008, 4.33, List.of("The Hunger Games", "Romance", "Fiction", "1st book")));
        catalog.addBook(new Book("Catching Fire", "Suzanne Collins", 2009, 4.31, List.of("The Hunger Games SAGA", "catching fire", "2nd book")));
        catalog.addBook(new Book("Mockingjay", "Suzanne Collins", 2010, 4.08, List.of("The Hunger Games trilogy", "mockingjay", "Fiction", "3rd book")));



        // Sort books by title
        catalog.sortBooksByTitle();

        // Display sorted books
        List<Book> sortedBooks = catalog.getBooks();
        System.out.println("Sorted Books by Title:");
        for (Book book : sortedBooks) {
            System.out.println(book);
        }

        // Find books by author
        List<Book> booksByAuthor = catalog.findBooksByAuthor("Suzanne Collins");
        System.out.println("\nBooks by Suzanne Collins:");
        for (Book book : booksByAuthor) {
            System.out.println(book);
        }

        // Remove a book by title
        catalog.removeBookByTitle("Catching Fire");

        // Display remaining books
        List<Book> remainingBooks = catalog.getBooks();
        System.out.println("\nRemaining Books:");
        for (Book book : remainingBooks) {
            System.out.println(book);
        }

        // Bonus: Calculate the average rating for books by a particular author
        double averageRating = catalog.averageRatingByAuthor("J.K. Rowling");
        System.out.println("\nAverage rating for J.K. Rowling " + averageRating);

        // Bonus: Get a list of all tags across all books
        List<String> allTags = catalog.allTags();
        System.out.println("\nAll Tags:");
        for (String tag : allTags) {
            System.out.println(tag);
        }

        // Bonus: Get a list of all tags across all books filtering by author
        List<String> allTagsByAuthor = catalog.allTagsByAuthor("Suzanne Collins");
        System.out.println("\nAll Tags for Suzanne Collins books:");
        for (String tag : allTagsByAuthor) {
            System.out.println(tag);
        }
    }
}

