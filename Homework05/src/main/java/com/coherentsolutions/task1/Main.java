package com.coherentsolutions.task1;

/**
 * Main Class to test the BasicCalculator class and the basic math operations
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator =  new BasicCalculator();

        double num1 = 20.0;
        double num2 = 40.0;

        System.out.println("Addition " + num1 + " + " + num2 + " = " + calculator.add(num1, num2));
        System.out.println("Subtraction " + num1 + " - " + num2 + " = " + calculator.subtract(num1, num2));
        System.out.println("Multiplication " + num1 + " * " + num2 + " = " + calculator.multiply(num1, num2));
        System.out.println("Division " + num1 + " / " + num2 + " = " + calculator.divide(num1, num2));
    }
}