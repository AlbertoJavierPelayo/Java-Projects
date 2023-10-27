package com.coherentsolutions.Exercise2;
public class Main {
    public static void main(String[] args) {
        int[] nums = {10, 15, 20, 25, 30};
        double average1 = MathOperations.calculateAverage(nums);
        System.out.println("Average with array = " + average1);
        double average2 = MathOperations.calculateAverage(10, 15, 20, 25, 30);
        System.out.println("Average with varargs = " + average2);

    }
}