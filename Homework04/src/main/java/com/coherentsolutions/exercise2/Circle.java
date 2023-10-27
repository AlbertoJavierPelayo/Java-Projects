package com.coherentsolutions.exercise2;

/**
 * Circle class, a subclass of Shape that represents a circle.
 * Attributes:
 *      radius (represents the radius of the Circle)
 */
public class Circle extends Shape {
    private double radius;

    /**
     * Constructor to create a Circle object with a given radius.
     * @param radius of the circle
     */
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    /**
     * Calculates and returns the area of the geometric shape.
     * @return The area of the circle obtained from the formula = Pi * radius ̂2.
     */
    @Override
    public double area(){
        System.out.println("Calculate of the area from a Circle with radius " + radius);
        return Math.PI * radius * radius;
    }
}
