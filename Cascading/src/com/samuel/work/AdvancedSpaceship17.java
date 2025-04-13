package com.samuel.work;

public class AdvancedSpaceship17 extends Spaceship17 {
    public AdvancedSpaceship17() {
        System.out.println("Running in the AdvancedSpaceship17 constructor");
    }

    @Override
    public void fly() {
        System.out.println("Running public method fly by child class");
    }

    public void engageHyperdrive() {
        System.out.println("Running in public method engageHyperdrive");
    }
}
