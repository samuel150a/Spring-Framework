package com.samuel.work;

public class FastCharger63 extends Charger63 {
    public FastCharger63() {
        System.out.println("Running in the FastCharger63 constructor");
    }

    @Override
    public void charge() {
        System.out.println("Running public method charge by child class");
    }

    public void quickBoost() {
        System.out.println("Running in public method quickBoost");
    }
}
