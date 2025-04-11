package com.sam.task;

public class Pour extends Bottle76 {
    public Pour() {
        System.out.println("Running in the Pour constructor");
    }

    @Override
    public void openCap() {
        System.out.println("Running in the overridden method openCap from Pour");
    }

    public void pourWater() {
        System.out.println("Running in the public method pourWater");
    }

    public void refill() {
        System.out.println("Running in the public method refill");
    }
}
