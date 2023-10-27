package com.coherentsolutions.task1;

/**
 * The ArrayUtilities class provides a set of utility methods for working with arrays of integers.
 */
public class ArrayUtilities {
    /**
     * Find the maximum value in an integer array
     * @param arr An Array of integers
     * @return the maximum value in the array
     * @throws IllegalArgumentException If the input array is empty or null
     */
    public int findMax(int[] arr) {

        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Input Array is EMPTY or NULL");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Find the minimum value in an integer array
     * @param arr An Array of integers
     * @return the minimum value in the array
     * @throws IllegalArgumentException If the input array is empty or null
     */
    public int findMin(int[] arr){
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Input Array is EMPTY or NULL");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * Calculate the sum of all integers in an array
     * @param arr An Array of integers
     * @return The sum of all integers in the array
     * @throws IllegalArgumentException If the input array is empty or null
     */
    public int calculateSum(int[] arr){
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Input Array is EMPTY or NULL");
        }
        int sum = 0;
        for (int num : arr){
            sum+=num;
        }
        return sum;
    }

    /**
     * Count the number of occurrences of a specific integer in an array
     * @param arr An Array of integers
     * @param target The integer to count
     * @return The number of occurrences of the target integer in the array
     * @throws IllegalArgumentException If the input array is empty or null
     */
    public int countOccurrences(int[] arr, int target){
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Input Array is EMPTY or NULL");
        }
        int count = 0;
        for (int num : arr){
            if (num == target){
                count++;
            }
        }
        return count;
    }

}
