package com.coherentsolutions.exercise2;

/**
 * Square class, a subclass of Shape that represents a square.
 * Attributes:
 *      side (represents the side of the Square)
 */
public class Square extends Shape {
    private double side;

    /**
     * Constructor to create a Square object with a given side.
     * @param side of the Square
     */
    public Square(double side) {
        super();
        this.side = side;
    }

    /**
     * Calculates and returns the area of the geometric shape.
     * @return The area of the square obtained from the formula = side * side.
     */
    @Override
    public double area(){
        System.out.println("Calculate of the area from a Square with side " + side);
        return side * side;
    }
}
