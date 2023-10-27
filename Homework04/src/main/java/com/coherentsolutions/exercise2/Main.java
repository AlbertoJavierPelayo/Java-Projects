package com.coherentsolutions.exercise2;

/**
 * Main class to test the Circle and Square classes
 * Use an array of Shapes with different types (Circle and Square)
 * Use a for loop to obtain the area for each shape
 */
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(5.0);
        shapes[1] = new Square(10.0);
        shapes[2] = new Circle(15.0);
        shapes[3] = new Square(20.0);

        for (Shape shape : shapes){
            double area = shape.area();
            System.out.println("Area: "+area);
        }
    }
}