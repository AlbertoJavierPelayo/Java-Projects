package com.coherentsolutions.task1;

import com.coherentsolutions.task1.ArrayUtilities;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * The ArrayUtilitiesTest class contains JUnit test cases for the ArrayUtilities class
 */
public class ArrayUtilitiesTest {
    //setup for tests
    ArrayUtilities au = new ArrayUtilities();
    int[] emptyArray = {};
    int[] nullArray = null;

    /**
     * Test case for the findMax method
     * It aims to test the findMax method with a valid array and check if it returns the maximum value, without care the order of elements
     */
    @Test
    public void testFindMax() {
        assertEquals(3, au.findMax(new int[]{1, 2, 3}));
        assertEquals(3, au.findMax(new int[]{3, 2, 1}));
        assertThrows(IllegalArgumentException.class,() -> au.findMax(emptyArray));
        assertThrows(IllegalArgumentException.class,() -> au.findMax(nullArray));
    }

    /**
     * Test case for the findMin method
     * It aims to test the findMin method with a valid array and check if it returns the minimum value, without care the order of elements
     */
    @Test
    public void testFindMin(){
        assertEquals(1, au.findMin(new int[]{1, 2, 3}));
        assertEquals(1, au.findMin(new int[]{3, 2, 1}));
        assertThrows(IllegalArgumentException.class,() -> au.findMin(emptyArray));
        assertThrows(IllegalArgumentException.class,() -> au.findMin(nullArray));
    }

    /**
     * Test case for the calculateSum method
     * It aims to test the calculateSum method with a valid array and check if it returns the correct sum of elements, without care the order of elements
     */
    @Test
    public void testCalculateSum(){
        assertEquals(6, au.calculateSum(new int[]{1, 2, 3}));
        assertEquals(6, au.calculateSum(new int[]{3, 2, 1}));
        assertThrows(IllegalArgumentException.class,() -> au.calculateSum(emptyArray));
        assertThrows(IllegalArgumentException.class,() -> au.calculateSum(nullArray));
    }

    /**
     * Test case for the countOccurrences method
     * It aims to test the countOccurrences method with a valid array and check if it counts occurrences of a specific value correctly
     */
    @Test
    public void testCountOccurrences(){
        assertEquals(2, au.countOccurrences(new int[]{3, 2, 3},3));
        assertEquals(0, au.countOccurrences(new int[]{3, 2, 1},5));
        assertEquals(3, au.countOccurrences(new int[]{3, 3, 3},3));
        assertThrows(IllegalArgumentException.class,() -> au.countOccurrences(emptyArray,1));
        assertThrows(IllegalArgumentException.class,() -> au.countOccurrences(nullArray,1));
    }
}
