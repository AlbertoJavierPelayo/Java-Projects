package com.coherentsolutions;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListBenchmark {
    public static void main(String[] args) {
        //number of test to run
        int nTest = 1000;

        // Initialize ArrayList and LinkedList
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Record start time for ArrayList
        long startTimeArrayList = System.nanoTime();

        // Perform operations on ArrayList
        // For example, adding elements
        for (int i = 0; i < nTest; i++) {
            arrayList.add(i);
        }

        // Record end time and calculate elapsed time for ArrayList
        long endTimeArrayList = System.nanoTime();
        long elapsedTimeArrayList = endTimeArrayList - startTimeArrayList;

        // Record start time for LinkedList
        long startTimeLinkedList = System.nanoTime();

        // Perform operations on LinkedList
        // For example, adding elements
        for (int i = 0; i < nTest; i++) {
            linkedList.add(i);
        }

        // Record end time and calculate elapsed time for LinkedList
        long endTimeLinkedList = System.nanoTime();
        long elapsedTimeLinkedList = endTimeLinkedList - startTimeLinkedList;

        // Compare and analyze the results
        System.out.println("Elapsed Time for ArrayList ADD: " + elapsedTimeArrayList + " ns");
        System.out.println("Elapsed Time for LinkedList ADD: " + elapsedTimeLinkedList + " ns");
        System.out.println();

        //////////////////////////////////GET///////////////////////////////////////////////////////////////////////

        // Record start time for ArrayList
        long startTimeArrayList_get = System.nanoTime();

        // Perform operations on ArrayList
        // For example, getting elements
        for (int i = 0; i < nTest; i++) {
            arrayList.get(i);
        }

        // Record end time and calculate elapsed time for ArrayList
        long endTimeArrayList_get = System.nanoTime();
        long elapsedTimeArrayList_get = endTimeArrayList_get - startTimeArrayList_get;

        // Record start time for LinkedList
        long startTimeLinkedList_get = System.nanoTime();

        // Perform operations on LinkedList
        // For example, getting elements
        for (int i = 0; i < nTest; i++) {
            linkedList.get(i);
        }

        // Record end time and calculate elapsed time for LinkedList
        long endTimeLinkedList_get = System.nanoTime();
        long elapsedTimeLinkedList_get = endTimeLinkedList_get - startTimeLinkedList_get;

        // Compare and analyze the results
        System.out.println("Elapsed Time for ArrayList GET: " + elapsedTimeArrayList_get + " ns");
        System.out.println("Elapsed Time for LinkedList GET: " + elapsedTimeLinkedList_get + " ns");
        System.out.println();

        //////////////////////////////////remove///////////////////////////////////////////////////////////////////////

        // Record start time for ArrayList
        long startTimeArrayList_remove = System.nanoTime();

        // Perform operations on ArrayList
        // For example, removing elements (removing the first element)
        for (int i = 0; i < nTest; i++) {
            arrayList.remove(0);
        }

        // Record end time and calculate elapsed time for ArrayList
        long endTimeArrayList_remove = System.nanoTime();
        long elapsedTimeArrayList_remove = endTimeArrayList_remove - startTimeArrayList_remove;

        // Record start time for LinkedList
        long startTimeLinkedList_remove = System.nanoTime();

        // Perform operations on LinkedList
        // For example, removing elements (removing the first element)
        for (int i = 0; i < nTest; i++) {
            linkedList.remove(0);
        }

        // Record end time and calculate elapsed time for LinkedList
        long endTimeLinkedList_remove = System.nanoTime();
        long elapsedTimeLinkedList_remove = endTimeLinkedList_remove - startTimeLinkedList_remove;

        // Compare and analyze the results
        System.out.println("Elapsed Time for ArrayList REMOVE: " + elapsedTimeArrayList_remove + " ns");
        System.out.println("Elapsed Time for LinkedList REMOVE: " + elapsedTimeLinkedList_remove + " ns");

        //////////////////////////////////remove inverse///////////////////////////////////////////////////////////////////////
/*
        // Record start time for ArrayList
        long startTimeArrayList_rInverse = System.nanoTime();

        // Perform operations on ArrayList
        // For example, removing elements from the last element to the first (inverse way)
        for (int i = nTest -1; i >=0; i--) {
            arrayList.remove(i);
        }

        // Record end time and calculate elapsed time for ArrayList
        long endTimeArrayList_rInverse = System.nanoTime();
        long elapsedTimeArrayList_rInverse = endTimeArrayList_rInverse - startTimeArrayList_rInverse;

        // Record start time for LinkedList
        long startTimeLinkedList_rInverse = System.nanoTime();

        // Perform operations on LinkedList
        // For example, removing elements from the last element to the first (inverse way)
        for (int i = nTest -1; i >=0; i--) {
            linkedList.remove(i);
        }

        // Record end time and calculate elapsed time for LinkedList
        long endTimeLinkedList_rInverse = System.nanoTime();
        long elapsedTimeLinkedList_rInverse = endTimeLinkedList_rInverse - startTimeLinkedList_rInverse;

        // Compare and analyze the results
        System.out.println("Elapsed Time for ArrayList REMOVE INVERSE: " + elapsedTimeArrayList_rInverse + " ns");
        System.out.println("Elapsed Time for LinkedList REMOVE INVERSE: " + elapsedTimeLinkedList_rInverse + " ns");
*/

    }
}
