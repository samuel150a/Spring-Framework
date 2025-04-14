package com.samuel.work;

public class ElectricScooter88 extends Scooter88 {
    public ElectricScooter88() {
        System.out.println("Running in the ElectricScooter88 constructor");
    }

    @Override
    public void ride() {
        System.out.println("Running public method ride by child class");
    }

    public void charge() {
        System.out.println("Running in public method charge");
    }
}
