package com.coherentsolutions.task2;

/**
 * Sorting class that apply bubble sort to sort an array of elements
 */
public class SortingAlgorithm {
    /**
     * Sort method that apply Bubble sort method to sort the array
     * @param array The array to sort
     * @return The sorted array
     */
    public int[] sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++){
            for (int j=0; j < n-1; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
