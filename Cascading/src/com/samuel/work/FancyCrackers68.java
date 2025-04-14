package com.samuel.work;

public class FancyCrackers68 extends Crackers68 {
    public FancyCrackers68() {
        System.out.println("Running in the FancyCrackers68 constructor");
    }

    @Override
    public void explode() {
        System.out.println("Running public method explode by child class");
    }

    public void sparkle() {
        System.out.println("Running in public method sparkle");
    }
}
