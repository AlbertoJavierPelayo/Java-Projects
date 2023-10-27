package com.coherentsolutions.exercise1;

/**
 * Main class to test the Circle and Square classes
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10.0);
        Square square = new Square(5.0);

        System.out.println("Circle area: "+ circle.area());
        System.out.println("Square area: "+ square.area());
    }
}