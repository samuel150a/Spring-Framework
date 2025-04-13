package com.samuel.work;

public class WaterBottle5 extends Bottle5 {
    public WaterBottle5() {
        System.out.println("Running in the WaterBottle5 constructor");
    }

    @Override
    public void useBottle() {
        System.out.println("Running public method useBottle by child class");
    }

    public void fillWater() {
        System.out.println("Running in public method fillWater");
    }
}
