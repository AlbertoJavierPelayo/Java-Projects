package com.coherentsolutions.task2;

import java.util.List;

/**
 * The DatabaseService interface defines methods for basic CRUD (Create, Read, Update, Delete) operations.
 */
public interface DatabaseService {
    /**
     * Creates a new record in the database with the given data
     * @param data The data to be stored in the database
     */
    void create(String data);

    /**
     * Reads and retrieves data from the database
     * @return The data retrieved from the database
     */
    String read();

    /**
     * Updates an existing record in the database with new data
     * @param data The new data to replace the existing data
     */
    void update(String data);

    /**
     * Deletes a record from the database.
     * @return `true` if the deletion was successful, `false` otherwise
     */
    boolean delete();

    /**
     * Counts the total number of records in the database
     * @return The total number of records in the database
     */
    int countRecords();

    /**
     * Retrieves a list of all records in the database
     * @return A list containing all records in the database
     */
    List<String> findAll();
}

