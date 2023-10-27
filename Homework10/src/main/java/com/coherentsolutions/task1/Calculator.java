package com.coherentsolutions.task1;

/**
 * The Calculator class provides basic arithmetic operations on integers
 */
public class Calculator {
    /**
     * Adds two integers
     * @param a The first number
     * @param b The second number
     * @return The sum of the two integers
     */
    public int add(int a, int b) {
        return a + b;
    }
    /**
     * Subtracts one integer from another
     * @param a The number from which to subtract
     * @param b The number to subtract
     * @return The result of subtracting b from a
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     * @param a The first number
     * @param b The second number
     * @return The product of the two integers.
     */
    public int multiply(int a, int b) {
        return a * b;
    }
    /**
     * Divides one integer by another and returns the result as a double
     * @param a The numerator
     * @param b The denominator
     * @return The result of dividing a by b
     * @throws ArithmeticException If the denominator is zero, indicating division by zero.
     */
    public double divide(int a, int b) {
        if(b == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }



}
