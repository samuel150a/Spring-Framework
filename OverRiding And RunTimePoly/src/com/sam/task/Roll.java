package com.sam.task;

public class Roll extends Wheel61 {
    public Roll() {
        System.out.println("Running in the Roll constructor");
    }

    @Override
    public void rotate() {
        System.out.println("Running in the overridden method rotate from Roll");
    }

    public void speedUp() {
        System.out.println("Running in the public method speedUp");
    }

    public void stopRolling() {
        System.out.println("Running in the public method stopRolling");
    }
}
