package com.coherentsolutions.task2;

import com.coherentsolutions.task2.DatabaseService;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

/**
 * This class contains unit tests for a CRUD (Create, Read, Update, Delete) application
 * It utilizes Mockito to mock a database service and tests various CRUD operations
 */
public class CRUDApplicationTest {
    //setup (create the Mock)
    DatabaseService mockService = mock(DatabaseService.class);

    /**
     * Test the 'read' method of the mocked DatabaseService
     * It verifies that the 'read' method returns the expected data
     */
    @Test
    public void testMockDatabaseServiceRead() {
        when(mockService.read()).thenReturn("MockData");
        assertEquals("MockData", mockService.read());
        verify(mockService).read();
    }

    /**
     * Test the 'create' method of the mocked DatabaseService
     * It ensures that the 'create' method is called with the correct argument
     */
    @Test
    public void testMockDatabaseServiceCreate() {
        doNothing().when(mockService).create(anyString());
        mockService.create("New Data");
        // Verify that the create method was called with the correct argument
        verify(mockService).create("New Data");
    }

    /**
     * Test the 'update' method of the mocked DatabaseService
     * It ensures that the 'update' method is called with the correct argument
     */
    @Test
    public void testMockDatabaseServiceUpdate() {
        doNothing().when(mockService).update(anyString());
        mockService.update("Updated Data");
        // Verify that the update method was called with the correct argument
        verify(mockService).update("Updated Data");
    }

    /**
     * Test the 'delete' method of the mocked DatabaseService.
     * It checks if the 'delete' method is called and returns true.
     */
    @Test
    public void testMockDatabaseServiceDelete() {
        when(mockService.delete()).thenReturn(true);
        assertTrue(mockService.delete());
        // Verify that the delete method was called and returns true
        verify(mockService).delete();
    }

    /**
     * Test the 'countRecords' method of the mocked DatabaseService.
     * It verifies that the 'countRecords' method returns the expected count.
     */
    @Test
    public void testMockDatabaseServiceCountRecords() {
        when(mockService.countRecords()).thenReturn(10);
        assertEquals(10, mockService.countRecords());
        // Verify that the countRecords method was called and returns the expected count
        verify(mockService).countRecords();
    }

    /**
     * Test the 'findAll' method of the mocked DatabaseService.
     * It verifies that the 'findAll' method returns a list of records as expected.
     */
    @Test
    public void testMockDatabaseServiceFindAll() {
        List<String> sampleRecords = Arrays.asList("Record1", "Record2", "Record3");
        when(mockService.findAll()).thenReturn(sampleRecords);
        assertEquals(sampleRecords, mockService.findAll());
        // Verify that the findAll method was called and returns the expected list of records
        verify(mockService).findAll();
    }
}

