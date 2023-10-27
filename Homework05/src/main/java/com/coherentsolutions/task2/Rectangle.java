package com.coherentsolutions.task2;
/**
 * Rectangle class, a subclass of shape class and implements Resizable interface
 */
public class Rectangle extends Shape implements Resizable{
    /**
     * attribute of the width of the rectangle
     */
    private double width;
    /**
     * attribute of the height of the rectangle
     */
    private double height;

    /**
     * Constructor to initialize the Rectangle with the width and height given
     * @param width The width of the Rectangle
     * @param height The height of the Rectangle
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    /**
     * Calculate the area of the Rectangle
     * @return the area of the Rectangle obtained by the math formula width * height
     */
    @Override
    public double area() {
        return width * height;
    }
    /**
     * Calculate the perimeter of the Rectangle
     * @return the perimeter of the Rectangle obtained by the math formula 2  * (width + height))
     */
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
    /**
     * Scale the width and the height of the Rectangle multiplied by the factor
     * @param factor The factor by which to scale the shape
     */
    @Override
    public void scale(double factor) {
        width *= factor;
        height *= factor;
    }
    /**
     * Resize width and the height of the Rectangle multiplied by the factor
     * @param factor The factor by which o resize the object
     */
    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
    }
}
