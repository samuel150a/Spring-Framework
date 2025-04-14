package com.samuel.work;

public class LCDScreen54 extends Screen54 {
    public LCDScreen54() {
        System.out.println("Running in the LCDScreen54 constructor");
    }

    @Override
    public void display() {
        System.out.println("Running public method display by child class");
    }

    public void adjustBrightness() {
        System.out.println("Running in public method adjustBrightness");
    }
}
