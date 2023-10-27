package com.coherentsolutions.task2;

/**
 * Circle class, a subclass of shape class and implements Resizable interface
 */
public class Circle extends Shape implements Resizable{
    /**
     * attribute of the radius of the circle
     */
    private double radius;

    /**
     * Constructor to initialize the Circle with the radius given
     * @param radius The radius of the Circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculate the area of the Circle
     * @return the area of the circle obtained by the math formula Pi * r^2
     */
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    /**
     * Calculate the perimeter of the Circle
     * @return the perimeter of the circle obtained by the math formula 2  * Pi * r
     */
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Scale the radius of the circle multiplied by the factor
     * @param factor The factor by which to scale the shape
     */
    @Override
    public void scale(double factor) {
        radius *= factor;
    }

    /**
     * Resize the radius of the Circle multiplied by the factor
     * @param factor The factor by which o resize the object
     */
    @Override
    public void resize(double factor) {
        radius *= factor;
    }
}
