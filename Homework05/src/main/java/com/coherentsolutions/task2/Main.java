package com.coherentsolutions.task2;

/**
 * Main class to test the Shape class and the subclasses Rectangle and Circle
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Create a circle shape with a specific radius
         * Create a rectangle shape with a specific width and height
         */
        Circle circle =  new Circle(10.0);
        Rectangle rectangle = new Rectangle(10.0, 20.0);

        /**
         * Calculate the area and perimeter of the circle
         */
        System.out.println("Initial calculation of Area and Perimeter");
        System.out.println("Circle Area = " + circle.area());
        System.out.println("Circle Perimeter = " + circle.perimeter());

        /**
         * Calculate the area and perimeter of the rectangle
         */
        System.out.println("Rectangle Area = " + rectangle.area());
        System.out.println("Rectangle Perimeter = " + rectangle.perimeter());

        /**
         * Scale the circle and rectangle by a different factors
         */
        circle.scale(2.0);
        rectangle.scale(1.5);
        System.out.println("Calculation of Area and Perimeter after scale");
        System.out.println("Circle Area = " + circle.area());
        System.out.println("Circle Perimeter = " + circle.perimeter());

        System.out.println("Rectangle Area = " + rectangle.area());
        System.out.println("Rectangle Perimeter = " + rectangle.perimeter());

        /**
         * resize the circle and rectangle by a different factors
         */
        circle.resize(0.5);
        rectangle.resize(0.75);
        System.out.println("Calculation of Area and Perimeter after resize");
        System.out.println("Circle Area = " + circle.area());
        System.out.println("Circle Perimeter = " + circle.perimeter());

        System.out.println("Rectangle Area = " + rectangle.area());
        System.out.println("Rectangle Perimeter = " + rectangle.perimeter());

        //create an array of shapes adding circle and rectangle
        Shape[] shapes = {circle, rectangle};

        //obtain the largest area and smallest perimeter shapes
        Shape largestAreaShape = ShapeUtilities.findLargestArea(shapes);
        Shape smallestPerimeterShape = ShapeUtilities.findSmallestPerimeter(shapes);

        System.out.println("Shape with largest Area = " + largestAreaShape.getClass().getSimpleName());
        System.out.println("Shape with smallest Perimeter = " + smallestPerimeterShape.getClass().getSimpleName());



    }
}