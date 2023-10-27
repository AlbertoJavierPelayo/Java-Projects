package com.coherentsolutions.exercise3;

/**
 * Refrigerator class,a subclass of Appliance.
 * Two Override methods: turnOn and turnOff
 */
public class Refrigerator extends Appliance{
    /**
     * Override method to turn ON the Refrigerator
     */
    @Override
    public void turnOn() {
        System.out.println("Refrigerator is turned ON");
    }

    /**
     * Override method to turn OFF the Refrigerator
     */
    @Override
    public void turnOff() {
        System.out.println("Refrigerator is turned OFF");
    }
}
