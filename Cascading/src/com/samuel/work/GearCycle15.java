package com.samuel.work;

public class GearCycle15 extends Cycle15 {
    public GearCycle15() {
        System.out.println("Running in the GearCycle15 constructor");
    }

    @Override
    public void ride() {
        System.out.println("Running public method ride by child class");
    }

    public void shiftGear() {
        System.out.println("Running in public method shiftGear");
    }
}
