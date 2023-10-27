package com.coherentsolutions.exercise3;

/**
 * WashingMachine class,a subclass of Appliance.
 * Two Override methods: turnOn and turnOff
 */
public class WashingMachine extends Appliance {
    /**
     * Override method to turn ON the WashingMachine
     */
    @Override
    public void turnOn(){
        System.out.println("Washing machine is turned ON");
    }

    /**
     * Override method to turn OFF the WashingMachine
     */
    @Override
    public void turnOff() {
        System.out.println("Washing machine is turned OFF");
    }
}
