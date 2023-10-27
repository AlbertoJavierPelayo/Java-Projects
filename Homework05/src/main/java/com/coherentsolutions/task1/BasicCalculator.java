package com.coherentsolutions.task1;

/**
 * Basic implementation of Calculator interface
 */
public class BasicCalculator implements Calculator{
    /**
     * Do the addition of two numbers
     * @param num1 first number to add
     * @param num2 second number to add
     * @return the sum of num1 plus num2
     */
    @Override
    public double add(double num1, double num2) {
        return num1 + num2;
    }
    /**
     * Do the subtraction of two numbers
     * @param num1 minuend number in a subtraction
     * @param num2 subtrahend number in a subtraction
     * @return the subtraction of num1 minus num2
     */
    @Override
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }
    /**
     * Do the multiplication of two numbers
     * @param num1 first number to multiply
     * @param num2 second number to multiply
     * @return the product of multiply num1 by num2
     */
    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
    /**
     * Do the division of two numbers
     * @param num1 dividend number
     * @param num2 divisor number
     * @return the result of divide num1 by num2
     */
    @Override
    public double divide(double num1, double num2) {
        if(num2==0){
            throw new ArithmeticException("Division by ZERO is not allowed");
        }
        return num1 / num2;
    }
}
