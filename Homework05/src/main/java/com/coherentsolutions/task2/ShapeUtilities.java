package com.coherentsolutions.task2;

/**
 * ShapeUtilities class for performing operations on an array of Shape objects.
 */
public class ShapeUtilities {
    /**
     * Method to obtain the largest area of an array of shapes
     * @param shapes An array of Shape objects
     * @return The shape with the largest area.
     */
    public static Shape findLargestArea(Shape[] shapes){
        if(shapes.length == 0){
            return null;
        }

        Shape largest = shapes[0];
        for (Shape shape : shapes){
            if(shape.area() > largest.area()){
                largest = shape;
            }
        }
        return largest;
    }
    /**
     * Method to obtain the smallest perimeter of an array of shapes
     * @param shapes An array of Shape objects
     * @return The shape with the smallest perimeter.
     */
    public static Shape findSmallestPerimeter(Shape[] shapes){
        if (shapes.length == 0){
            return null;
        }
        Shape smallest = shapes[0];
        for(Shape shape : shapes){
            if(shape.perimeter() < smallest.perimeter()){
                smallest = shape;
            }
        }
        return smallest;
    }
}
