package com.coherentsolutions.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * The Stack class represents a simple stack data structure that follows the Last-In-First-Out (LIFO) principle.
 */
public class Stack {
    // Initial Data Structure
    private List<Object> stackList =  new ArrayList<>();


    /**
     * Push method to add an element to the top of the stack
     * @param element The element to pushed onto the stack
     */
    public void push(Object element) {
        stackList.add(element);
    }

    /**
     * Pop method to remove and return the top element from the stack
     * @return The top element of the stack
     * @throws IllegalStateException if the stack is empty
     */
    public Object pop() {
        if(isEmpty()){
            throw new IllegalStateException("Stack is Empty");
        }
        // Remove and return the top element from the stack
        return stackList.remove(stackList.size() - 1);
    }

    /**
     * Peek method to return the top element without removing it
     * @return The top element of the stack
     * @throws IllegalStateException if the stack is empty
     */
    public Object peek() {
        if(isEmpty()){
            throw new IllegalStateException("Stack is Empty");
        }
        // Return the top element without removing it
        return stackList.get(stackList.size() - 1);
    }

    /**
     * Check if the stack is Empty
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty(){
        return stackList.isEmpty();
    }
}