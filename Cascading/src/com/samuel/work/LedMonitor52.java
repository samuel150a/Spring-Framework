package com.samuel.work;

public class LedMonitor52 extends Monitor52 {
    public LedMonitor52() {
        System.out.println("Running in the LedMonitor52 constructor");
    }

    @Override
    public void display() {
        System.out.println("Running public method display by child class");
    }

    public void adjustBrightness() {
        System.out.println("Running in public method adjustBrightness");
    }
}
