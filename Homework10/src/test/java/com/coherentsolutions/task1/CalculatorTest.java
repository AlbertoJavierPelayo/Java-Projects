package com.coherentsolutions.task1;

import com.coherentsolutions.task1.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test cases for the Calculator class.
 */
public class CalculatorTest {
    //setup
    Calculator calc = new Calculator();

    /**
     * Test the addition operation
     * It aims to verify that the add method returns the correct sum of two numbers
     */
    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(5, calc.add(3, 2));
    }

    /**
     * Test the subtraction operation
     * It aims to verify that the subtract method returns the correct result when subtracting one number from another
     */
    @Test
    public void testSubtract() {
        assertEquals(-1, calc.subtract(2, 3));
        assertEquals(1, calc.subtract(3, 2));
    }

    /**
     * Test the multiplication operation
     * It aims to verify that the multiply method returns the correct product of two numbers
     */
    @Test
    public void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
        assertEquals(6, calc.multiply(3, 2));
    }

    /**
     * Test the division operation
     * It aims to verify that the divide method returns the correct result when dividing one number by another
     * And catch the arithmetic Exception in a division by zero
     */
    @Test
    public void testDivide() {
        assertEquals(5.0, calc.divide(10, 2), 0.001);
        assertEquals(0.2, calc.divide(2, 10), 0.001);
        assertThrows(ArithmeticException.class,() -> calc.divide(10,0));
    }
}
