package com.coherentsolutions.Exercise2;

public class MathOperations {
    //Method calculateAverage with an array of integers
    public static double calculateAverage(int[] numbers){
        //validate that the array has at least 2 numbers to calculate the average
        if(numbers == null || numbers.length < 2){
            throw new IllegalArgumentException("You must provide at least two numbers");
        }
        //initialize the variable sum at 0 to start adding all the numbers in the array
        int sum=0;
        //for loop to obtain all the numbers in the array and add these numbers in the variable sum
        for(int num : numbers){
            sum+=num;
        }
        //calculate the average result
        double average = (double) sum/numbers.length;
        System.out.println("Method calculateAverage with an array of integers");
        return average;
    }

    //Method calculateAverage with varargs
    public static double calculateAverage(int firstNum, int... numbers){
        //validate the amount of parameters, at least 2 numbers to calculate the average
        if(numbers == null || numbers.length == 0 ){
            throw new IllegalArgumentException("You must provide at least two numbers");
        }
        //initialize the variable sum with the first number (firstNum)
        int sum = firstNum;
        //for loop to obtain the rest of the numbers in the varargs and add these numbers in the variable sum
        for(int num : numbers){
            sum+=num;
        }
        //calculate the average result, adding 1 to the numbers.length due to the firstNum
        double average = (double) sum/(numbers.length+1);
        System.out.println("Method calculateAverage with varargs");
        return average;
    }


}
