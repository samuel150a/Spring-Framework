package com.samuel.work;

public class WaterBottle62 extends Bottle62 {
    public WaterBottle62() {
        System.out.println("Running in the WaterBottle62 constructor");
    }

    @Override
    public void fill() {
        System.out.println("Running public method fill by child class");
    }

    public void drink() {
        System.out.println("Running in public method drink");
    }
}
