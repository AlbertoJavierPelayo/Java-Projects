package com.coherentsolutions.task3;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ClassReflection class to reflect the methods and fields of an specific class
 * @param <T>
 */
public class ClassReflection<T> {
    /**
     * Attribute to the class wanted to reflect
     */
    private Class<T> reflectClass;

    /**
     * Constructor
     * @param reflectClass the class wanted to reflect
     */
    public ClassReflection(Class<T> reflectClass) {
        this.reflectClass = reflectClass;
    }

    /**
     * get method of the reflected class
     * @return the reflected class
     */
    public Class<T> getReflectClass(){
        return reflectClass;
    }

    /**
     * Method to list the methods of the class
     */
    public void listMethods(){
        System.out.println("Methods in " + reflectClass.getName() + ":");
        Method[] methods = reflectClass.getMethods();

        for (Method method : methods){
            System.out.println("Method name: " + method.getName());
        }
    }

    /**
     * Method to list the fields of the class
     */
    public void listFields(){
        System.out.println("\nFields in " + reflectClass.getName() + ":");
        Field[] fields = reflectClass.getFields();

        for (Field field : fields){
            System.out.println(field.getName());
        }
    }
}
