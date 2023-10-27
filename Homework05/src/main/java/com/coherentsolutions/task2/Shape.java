package com.coherentsolutions.task2;

/**
 * Abstract class representing a shape
 */
public abstract class Shape {
    /**
     * Abstract method to calculate the area of the shape
     * @return The area of the shape
     */
    public abstract double area();

    /**
     * Abstract method to calculate the perimeter of the shape
     * @return The perimeter of the shape
     */
    public abstract double perimeter();

    /**
     * Method to scale the shape y a given factor
     * @param factor The factor by which to scale the shape
     */
    public  void scale(double factor){
        //Implementation to scale the shape, it is specific to each shape type

    }
}
