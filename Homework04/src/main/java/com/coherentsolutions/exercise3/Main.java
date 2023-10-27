package com.coherentsolutions.exercise3;

public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        Refrigerator refrigerator = new Refrigerator();

        washingMachine.turnOn();
        washingMachine.turnOff();
        refrigerator.turnOn();
        refrigerator.turnOff();
    }
}