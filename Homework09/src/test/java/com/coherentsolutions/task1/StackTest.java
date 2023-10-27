package com.coherentsolutions.task1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class to test the Stack class
 */
public class StackTest {
    // Initialize your Stack object here
    Stack stack;

    /**
     * Initialize a new stack before each test
     */
    @BeforeEach
    public void setup(){
        stack = new Stack();
    }

    /**
     * Test for the push method
     */
    @Test
    public void testPush() {
        stack.push(1);
        //Check if the top element is 1 after pushing 1
        assertEquals(1,stack.peek(), "After pushing number: 1 onto the stack, the top element should be: 1");
    }

    /**
     * Test for the pop method
     */
    @Test
    public void testPop() {
        stack.push("First");
        stack.push("Second");

        //Pop the top element and check if it is "Second"
        assertEquals("Second",stack.pop(),"After popping the top element of a stack of two elements, the pop element should be 'Second'");
        //Pop the top element and check if it is "First"
        assertEquals("First",stack.pop(), "After popping the top element of a stack of one elements, the pop element should be 'First'");
        //Check if the stack is empty after pop all the elements
        assertTrue(stack.isEmpty(), "After popping all elements of the stack the stack should be empty");
    }

    /**
     * Test for the peek method
     */
    @Test
    public void testPeek() {
        stack.push("First Element");
        stack.push("Second Element");

        //Check if the peek returns "Second Element" without removing it
        assertEquals("Second Element",stack.peek(), "After peeking the top element of a stack of two elements, the top element should be: 'Second Element");
        //Check if the peek still return "Second Element" without removing it
        assertEquals("Second Element",stack.peek(), "After peeking the top element of a stack of two elements, the top element should be: 'Second Element");
    }

    /**
     * Test for empty stack
     */
    @Test
    public void testEmptyStack(){
        //Check if throws the exception when try to pop an element on an empty stack
        assertThrows(IllegalStateException.class, stack::pop, "The stack should throw the illegal state exception when you try to pop an element on an empty stack");
        //Check if throws the exception when try to peek an element on an empty stack
        assertThrows(IllegalStateException.class, stack::peek, "The stack should throw the illegal state exception when you try to peek an element on an empty stack");
    }

    /**
     * Destroy the stack after each test
     */
    @AfterEach
    void tearDown(){
        stack = null;
    }
}
