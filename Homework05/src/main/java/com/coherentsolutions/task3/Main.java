package com.coherentsolutions.task3;

/**
 * Main class to test the ClassReflection Class and list the methods and fields
 */
public class Main {
    public static void main(String[] args) {
        ClassReflection<?> classReflection = new ClassReflection<>(String.class);

        System.out.println(classReflection.getReflectClass());

        classReflection.listMethods();
        classReflection.listFields();
    }
}