package com.coherentsolutions.task2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class to test the sorting method
 */
public class SortingAlgorithmTest {
    // Initialize the SortingAlgorithm object
    SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();


    /**
     * Parameterized test for sorting algorithm
     * @param input The input array to sort
     * @param expectedOutput The expected sorted array
     * @param message The message to show if the test fails
     */
    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testSort(int[] input, int[] expectedOutput, String message) {
        int[] sortedArray = sortingAlgorithm.sort(input);
        assertArrayEquals(expectedOutput, sortedArray, message);
    }

    /**
     * Method to provide test cases
     * @return The arguments for the test cases
     */
    public static Stream<Arguments> provideTestCases() {

        return Stream.of(
                //Empty Array
                Arguments.of(new int[]{}, new int[]{}, "The sorted array for an empty array should be an empty array"),
                //Single element array
                Arguments.of(new int[]{1}, new int[]{1}, "The sorted array for a single element array should be the single element array"),
                //Unsorted array
                Arguments.of(new int[]{5,3,1,4,2,6}, new int[]{1,2,3,4,5,6}, "The sorted array of an array of numbers from 1 to 6 should be 1,2,3,4,5,6"),
                //Already sorted array
                Arguments.of(new int[]{1,2,3,4,5,6}, new int[]{1,2,3,4,5,6}, "The sorted array of an already sorted array of numbers from 1 to 6 should be 1,2,3,4,5,6"),
                //Reverse sorted array
                Arguments.of(new int[]{6,5,4,3,2,1}, new int[]{1,2,3,4,5,6}, "The sorted array of reverse sorted array of numbers from 1 to 6 should be 1,2,3,4,5,6"),
                //Duplicate numbers
                Arguments.of(new int[]{2,3,2,1,3,1}, new int[]{1,1,2,2,3,3}, "The sorted array for duplicate elements from 1 to 3 should be 1,1,2,2,3,3"),
                //Negative values
                Arguments.of(new int[]{2,3,0,-1,1,-3,-2}, new int[]{-3,-2,-1,0,1,2,3}, "The sorted array of an unsorted array of numbers from -3 to 3 should be -3,-2,-1,0,1,2,3")
        );
    }
}